// Polymorphism example2
// Method overriding
public class Main2{

    public static void main(String args[]) {
        Sparrow sparrow = new Sparrow();
        sparrow.info(); // info method with some functionality

        System.out.println();
        Penguin penguin = new Penguin();
        penguin.info(); // info method with other functionality
        
        System.out.println();
        Flemingo flemingo = new Flemingo();
        flemingo.info(); //info method with some other functionality
        // info method have many forms
    }
}