package liskovSubstitutionPrinciple;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        // can't fly
        Ostrich ostrich = new Ostrich();
        ostrich.greet();


        // can fly
        Sparrow sparrow = new Sparrow();
        sparrow.fly();

    }
}
