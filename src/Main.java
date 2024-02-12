package inheritanceDemoV3;

public class Main {public static void main(String[] args){
    Mammal mammal1 = new Mammal();
    Reptile reptile1 = new Reptile();

    System.out.print(mammal1);
    System.out.print(reptile1);

    mammal1.makeNoise();
    mammal1.eat();
    mammal1.run();
    reptile1.makeNoise();
    reptile1.eat();

}
}
