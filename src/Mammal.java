package inheritanceDemoV3;

public class Mammal extends Animal {

    private boolean hasFur;
    private boolean giveBirth;

    public Mammal(){
        super(false,2, "Omnivore");
    }

    public Mammal(boolean hasFur, boolean giveBirth){
        super(false, 2, "Carnivore");
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
        //this();
    }

    public Mammal(boolean beingDangerous, int numberOfLegs, String diet, boolean hasFur, boolean giveBirth){
        super(beingDangerous, numberOfLegs, diet);
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    public Mammal(Animal animal){
        super(animal.beingDangerous,animal.numberOfLegs, animal.diet);
    }

    public Mammal(Animal animal, boolean hasFur, boolean giveBirth){
        super(animal.beingDangerous,animal.numberOfLegs, animal.diet);
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    public Mammal(String name, boolean hasFur, boolean giveBirth){
        // super();
        this.hasFur = hasFur;
        this.giveBirth = giveBirth;
    }

    public String toString(){
        return "\nDangerous: " + beingDangerous + "\nLegs: " + numberOfLegs + "\nDiet: " + diet + "\n";
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println(" Meow~~~");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(" Yummy ");
    }
    public void run(){
        System.out.println("Animal spotted. Check if it's dangerous.");
        System.out.println("Checking...");
        System.out.println("Checked.");
        if(diet == "\nCarnivore\n"){
            if(beingDangerous == true){
                System.out.print("\nRun!\n");
            } else if (beingDangerous == false){
                System.out.print("\nStay calm.\n");
            }

        }else{
            System.out.print("\nYou're fine, keep walking.\n");
        }
}

}
