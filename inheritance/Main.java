class CarDriver extends Driver{
    //uses drive method of Driver class
}
class TruckDriver extends Driver{
    public void drive(){ //overrides drive method of Driver class
        System.out.println("I am a Driver and I drive truck");
    }
}

class AutoRikshawDriver extends Driver{
    public void drive(){
        super.drive();
        System.out.println("I drive auto rikshaw");
    }
}


public class Main{
    public static void main(String args[]){
 
  
        CarDriver driver1 = new CarDriver();
        driver1.drive();

        System.out.println();
        TruckDriver driver2 = new TruckDriver();
        driver2.drive();

        System.out.println();
        AutoRikshawDriver driver3 = new AutoRikshawDriver();
        driver3.drive();
        
    }
}