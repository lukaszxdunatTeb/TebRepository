/*

 */

import InputData.InputDataClass;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    private static ResourceBundle resourceBundle;

    static InputDataClass input = new InputDataClass();
    public static void main(String[] args) {

        //Wybór języka
        selectLanguage();

        //Powitanie
        System.out.println(resourceBundle.getString("global_hello"));

        //Wypisanie menu głównego

        //Zakończenie programu - pożegnanie
        System.out.println(resourceBundle.getString("global_goodbye"));
    }

    //Funkcja ustawienia języka programu
    private static void setLocale(String language) {
        Locale locale = new Locale(language);
        resourceBundle = ResourceBundle.getBundle("LanguagePack", locale);
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

    private static void showMainMenu(){
        //Nagłówek menu -
        System.out.println(resourceBundle.getString("main_menu_header"));
        System.out.println(resourceBundle.getString("main_menu_entry_add_new_item"));
        System.out.println(resourceBundle.getString("main_menu_entry_remove_item_from_list"));
        System.out.println(resourceBundle.getString("main_menu_entry_show_current_list"));
        System.out.println(resourceBundle.getString("main_menu_entry_check_item"));
        System.out.println(resourceBundle.getString("main_menu_entry_close_program"));
    }
}
