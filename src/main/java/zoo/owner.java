package zoo;

public class owner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();


        animal.specie = "eliaum";
        animal.age = 18;
        animal.speak();
        animal.feed("nothing");


        animal2.specie = "Tadzio";
        animal2.age = 2138;
        animal2.speak();
        animal.feed("electrons");

    }
}
