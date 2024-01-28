/*

 */

import InputData.InputDataClass;
import ShoppingList.ShoppingListClass;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
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
                    newItemEntry();
                    break;
                //Usuwanie elementu z listy
                case 2:
                    removeItemEntry();
                    break;
                //Wyświetlenie listy zakupów
                case 3:
                    showWholeShoppingListEntry();
                    break;
                //Wyszukanie elementu na liście
                case 4:
                    findExactItemEntry();
                    break;
                //Zmiana języka
                case 5:
                    selectLanguageManually();
                    break;
                // Zamykanie programu
                default:
                    ifProgramIsExecuting = false;
            }
        } while (ifProgramIsExecuting);

        //Zakończenie programu - pożegnanie
        System.out.println(textContainer.getString("global_goodbye"));

        //shoppingList.saveToFile();
    }

    //Funkcja ustawienia języka programu
    private static void setLocale(String language) {
        Locale locale = new Locale(language);
        textContainer = ResourceBundle.getBundle("LanguagePack", locale);
    }

    //Funkcja wyboru języka programu

    private static void selectLanguage(){
        try {
            // Odczyt danych z pliku JSON
            String content = new String(Files.readAllBytes(Paths.get("settings.json")));
            JSONObject jsonObject = new JSONObject(content);

            // Przykład odczytu danych
            String locale = jsonObject.getString("locale");
            setLocale(locale);
        } catch (Exception e) {
            selectLanguageManually();
        }
    }
    private static void selectLanguageManually(){
        boolean languageNotSelected = true;
        String locale = null;

        do {
            System.out.println("1 - Wciśnij 1 by wybrać język polski");
            System.out.println("2 - Press 2 to select english language");
            switch (input.getValueInt()) {
                case 1:
                    locale = "PL";
                    setLocale(locale);
                    languageNotSelected = false;
                    break;
                case 2:
                    locale = "EN";
                    setLocale(locale);
                    languageNotSelected = false;
                    break;
                default:
            }
        } while (languageNotSelected);

        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("locale", locale);

            Files.write(Paths.get("settings.json"), jsonObject.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        //Opcja zmiany języka
        System.out.println(textContainer.getString("main_menu_entry_set_locale"));
        //Informacja o sposobie zakończenia programu - naciśnięcie dowolnego innego klawisza
        System.out.println(textContainer.getString("main_menu_entry_close_program"));
    }

    private static void newItemEntry(){
        System.out.print(textContainer.getString("add_new_item_entry_set_name"));
        String inputName = input.getValueString();
        System.out.print(textContainer.getString("add_new_item_entry_set_value"));
        int inputValue = input.getValueInt();

        int indexOfItemToUpdate = shoppingList.returnItemIndex(inputName);
        if(indexOfItemToUpdate > -1){
            System.out.println(textContainer.getString("add_new_item_entry_item_exists"));
            if(input.getValueString().toLowerCase().equals("y")){
                shoppingList.updateAmountOfItemOnList(indexOfItemToUpdate,inputValue);
            }
        } else {
            shoppingList.addNewItemToTheList(inputName,inputValue);
        }
    }

    private static void removeItemEntry(){
        if(shoppingList.returnProductsAmount() > 0) {
            System.out.print(textContainer.getString("remove_item_from_list_entry_put_name"));
            if(shoppingList.removeItemFromList(input.getValueString())==1){
                System.out.println(textContainer.getString("remove_item_from_list_entry_pass"));
            } else {
                System.out.println(textContainer.getString("remove_item_from_list_entry_fail"));
            }
        } else {
            System.out.println(textContainer.getString("global_empty_list"));
        }
    }

    private static void showWholeShoppingListEntry(){
        if(shoppingList.returnProductsAmount() > 0) {
            System.out.println(textContainer.getString("show_current_list_entry_info"));
            shoppingList.returnWholeShoppingList();
        } else {
            System.out.println(textContainer.getString("show_current_list_entry_empty_list"));
        }
    }

    private static void findExactItemEntry(){
        if(shoppingList.returnProductsAmount() > 0) {
            System.out.print(textContainer.getString("check_item_entry_put_name"));
            int indexOfSearchingItem = shoppingList.returnItemIndex(input.getValueString());
            if(indexOfSearchingItem > -1){
                System.out.println(textContainer.getString("check_item_entry_pass") + (indexOfSearchingItem+1));
            } else {
                System.out.println(textContainer.getString("check_item_entry_fail"));
            }
        } else {
            System.out.println(textContainer.getString("global_empty_list"));
        }
    }
}
