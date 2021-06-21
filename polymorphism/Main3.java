// Polymorphism example3
// Loose coupling
public class Main3{
    public static void main(String[] args){
        Plant jasmine = getFlowerType(new FloweringPlant());
        Plant horsetails = getFlowerType(new NonFloweringPlant());  
        
        jasmine.type();
        horsetails.type();
        
    }
    
    static Plant getFlowerType(Plant plant){
        return plant;
    }
    // plant parameter in getFlowerType is of type FloweringPlant for jasmine object
    // plant parameter in getFlowerType is of type NonFloweringPlant for horsetails object
    // plant parameter have many forms 

}