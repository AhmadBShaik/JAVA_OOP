public class WashingMachine{

    public void wash(){ //hiding all methods and validation in wash method
        setTimer();
        takeWater();
        soak();
        washClothes();
        dryClothes();
        // if timer becomes zero
        ringAlarm();
    }

    private void setTimer(){
        System.out.println("start timer");
    }

    private void takeWater(){
        System.out.println("take water");
    }
    private void soak(){
        System.out.println("soak clothes for 15 minutes");
    }
    private void washClothes(){
        System.out.println("wash clothes");
    } 

    private void dryClothes(){
        System.out.println("dry clothes");
    }

    private void ringAlarm(){
        System.out.println("ring alarm");
    }
}