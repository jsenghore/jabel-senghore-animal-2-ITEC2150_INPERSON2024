package inheritanceDemoV3;

public class Mammal extends Animal {

    private boolean hasFur;
    private boolean giveBirth;

    public Mammal(){
    }

    public Mammal(boolean hasFur, boolean giveBirth){
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
        //this();
    }

    public Mammal(boolean beingDangerous, int numberOfLegs, String diet, boolean hasFur, boolean giveBirth){
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    public Mammal(Animal animal){
    }

    public Mammal(Animal animal, boolean hasFur, boolean giveBirth){
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    public Mammal(String name, boolean hasFur, boolean giveBirth){
        // super();
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    @Override
    public void makeNoise(){
        System.out.println(" Meow~~~");
    }

    @Override
    public void eat(){
        System.out.println(" Yummy ");
    }
    public String toString(){
        return "\nDangerous: " + beingDangerous + "\nLegs: " + numberOfLegs + "\nDiet: " + diet + "\n";
    }
    public void run(){
        if(diet == "Carnivore"){
            if(beingDangerous == true){
                 System.out.print("Run!");
            } else if (beingDangerous == false){
                 System.out.print("Stay calm.");
            }

        }else{
             System.out.print("You're fine, keep walking.");
        }
    }
}