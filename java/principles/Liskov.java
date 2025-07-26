import java.util.List;
import java.util.ArrayList;

class Animal {
        void sound () {
            System.out.println("all sounds");
        }

        void animalSound(List <? extends Animal> animalList) {
            for(Animal elements : animalList) {
                elements.sound();
            }
        }

        void addCat(List <? super Cat> cats) {
            cats.add(new Cat());
        }

    }

    class Cat extends Animal {
        void sound () {
            System.out.println("cat sounds");
        }
    }

    public class Liskov {
    public static void main(String[] args) {

        Animal cat = new Cat ();
        cat.sound();

        List<Cat> clist = new ArrayList<>();

        clist.add(new Cat());
        clist.add(new Cat());
        clist.add(new Cat());

       cat.animalSound(clist);

       List<Animal> animals = new ArrayList<>();
       cat.addCat(animals);
       cat.animalSound(animals);
    }
}
