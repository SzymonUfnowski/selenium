package zoo;

public class Animal {
    public String specie;
    int age;
    float weight;
    double height;
    boolean isAlive;




    void speak(){
        System.out.println("hello, my specie is: " + specie + " and my age is: " + age);

    }
    void feed(String food){
        System.out.println("i eat " + food);
    }
}
