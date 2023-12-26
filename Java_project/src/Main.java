/*

 */

import InputData.InputDataClass;
import ShoppingList.ShoppingListClass;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    private static ResourceBundle textContainer;

    private static InputDataClass input = new InputDataClass();

    private static ShoppingListClass shoppingList = new ShoppingListClass();
    public static void main(String[] args) {

        //Wybór języka
        selectLanguage();

        //Powitanie
        System.out.println(textContainer.getString("global_hello"));

        //Zmienna decydująca o tym czy program ma się wykonywać
        boolean ifProgramIsExecuting = true;
        do {
            //Wypisanie menu głównego
            showMainMenu();
            switch (input.getValueInt()){
                //Dodawanie nowego elementu do listy
                case 1:
                    System.out.print(textContainer.getString("add_new_item_entry_set_name"));
                    String inputName = input.getValueString();
                    System.out.print(textContainer.getString("add_new_item_entry_set_value"));
                    int inputValue = input.getValueInt();
                    shoppingList.addNewItemToTheList(inputName,inputValue);
                    break;
                //Wyświetlenie listy zakupów
                case 3:
                    System.out.println(textContainer.getString("show_current_list_entry_info"));
                    shoppingList.returnWholeShoppingList();
                    break;
                //Zamykanie programu
                default:
                    ifProgramIsExecuting = false;
            }
        } while (ifProgramIsExecuting);

        //Zakończenie programu - pożegnanie
        System.out.println(textContainer.getString("global_goodbye"));
    }

    //Funkcja ustawienia języka programu
    private static void setLocale(String language) {
        Locale locale = new Locale(language);
        textContainer = ResourceBundle.getBundle("LanguagePack", locale);
    }

    //Funkcja wyboru języka programu
    private static void selectLanguage(){
        boolean languageNotSelected = true;
        do {
            System.out.println("1 - Polski");
            System.out.println("2 - English");
            switch (input.getValueInt()) {
                case 1:
                    setLocale("PL");
                    languageNotSelected = false;
                    break;
                case 2:
                    setLocale("EN");
                    languageNotSelected = false;
                    break;
                default:
            }
        } while (languageNotSelected);
    }

    //Funkcja wypisywania menu głównego
    private static void showMainMenu(){
        //Nagłówek menu - prośba o wybór opcji
        System.out.println(textContainer.getString("main_menu_header"));

        //Opcja dodawania nowego elementu
        String addItem = textContainer.getString("main_menu_entry_add_new_item");
        System.out.println(addItem);
        //Opcja usuwania elementu z listy
        System.out.println(textContainer.getString("main_menu_entry_remove_item_from_list"));
        //Wyświetlanie całej listy zakupów
        System.out.println(textContainer.getString("main_menu_entry_show_current_list"));
        //Opcja wyszukania i wyświetlenia konkretnego elementu z listy
        System.out.println(textContainer.getString("main_menu_entry_check_item"));
        //Informacja o sposobie zakończenia programu - naciśnięcie dowolnego innego klawisza
        System.out.println(textContainer.getString("main_menu_entry_close_program"));
    }
}
