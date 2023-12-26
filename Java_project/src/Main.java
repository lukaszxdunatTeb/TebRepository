import InputData.InputDataClass;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    private static ResourceBundle resourceBundle;

    static InputDataClass input = new InputDataClass();
    public static void main(String[] args) {
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
        }while (languageNotSelected);

        System.out.println(resourceBundle.getString("globalHello"));

    }

    private static void setLocale(String language) {
        Locale locale = new Locale(language);
        resourceBundle = ResourceBundle.getBundle("LanguagePack", locale);
    }
}
