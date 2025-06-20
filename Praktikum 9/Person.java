// Nama      : Steven Jonathan Sihombing
// NIM       : 24060123120044
public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }
}