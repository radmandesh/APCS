package Ch8Classes;

public class Animal {
    private String name;
    private int numLegs;
    private int numArms;
    private int numEyes;
    private boolean eatsMeat;
    private double height;
    private double weight;
    private char gender;

    public Animal(String name, int numLegs, int numArms, int numEyes, boolean eatsMeat, double height, double weight, char gender) {
        this.name = name;
        this.numLegs = numLegs;
        this.numArms = numArms;
        this.numEyes = numEyes;
        this.eatsMeat = eatsMeat;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public int getNumArms() {
        return numArms;
    }

    public int getNumEyes() {
        return numEyes;
    }

    public boolean isEatsMeat() {
        return eatsMeat;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", numLegs=" + numLegs +
                ", numArms=" + numArms +
                ", numEyes=" + numEyes +
                ", eatsMeat=" + eatsMeat +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }
}
