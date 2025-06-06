public class Task038 {
    public static void main(String[] args) {
        // The following line causes a compile-time error:
        // "Employeeeee is abstract; cannot be instantiated"
        Employeeeee e = new Employeeeee("George W.", "Houston, TX", 43);
        System.out.println("\n Call mailCheck using Employeeeee reference--");
        e.mailCheck();
    }
}
abstract class Employeeeee {
    private String name;
    private String address;
    private int number;
    public Employeeeee(String name, String address, int number) {
        System.out.println("Constructing an Employeeeee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay() {
        System.out.println("Inside Employeeeee computePay");
        return 0.0;
    }
    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
    public String toString() {
        return name + " " + address + " " + number;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public int getNumber() {
        return number;
    }
}
