public class Flemingo extends Bird{
    public void info(){ //overriding info method of super(Bird) class
        super.info(); // calling info method of parent(Bird) class
        System.out.println("Everybody call me Flemingo");
    }
}