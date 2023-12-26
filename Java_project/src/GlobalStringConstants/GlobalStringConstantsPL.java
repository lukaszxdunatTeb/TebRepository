package  GlobalStringConstants;

public enum GlobalStringConstantsPL {
    HELLO ("Witamy w programie Listy zakupów"),
    MAIN_MENU_HEADER ("Wybierz co chcesz zrobić");

    private final String innerText;
    GlobalStringConstantsPL(String innerText){
        this.innerText = innerText;
    }

    public String text(){
        return innerText;
    }
}
