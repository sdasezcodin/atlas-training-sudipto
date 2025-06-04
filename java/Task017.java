
class Person {
    private String name;  // private variable

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class Task017 {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "John";  // ❌ Error: name has private access in Person
        System.out.println(myObj.name);  // ❌ Error: name has private access in Person
    }
}
