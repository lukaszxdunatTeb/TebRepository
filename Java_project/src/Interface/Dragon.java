package Interface;

import static java.lang.System.out;
public class Dragon implements Monster {
    public Dragon(int age) {
        this.age = age;
    }

    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack() {

    }

    @Override
    public void scream() {

    }

    @Override
    public void displayDescription() {
        out.println("Dragon nazywa się: " + name + " wiek: " + age);
    }

}
