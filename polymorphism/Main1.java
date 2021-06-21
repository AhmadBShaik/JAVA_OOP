// Polymorphism example1
// Method overloading
public class Main1{
    static int add(int num1,int num2){    //overloading add method
        return num1 + num2;
    }
    
    static int add(int num1, int num2, int num3){   //overloading add method
        return num1 + num2 + num3;
    }

    static int add(int num1, int num2, int num3,int num4){   //overriding add method
        return num1 + num2 + num3 + num4;
    }
    
    public static void main(String args[]) {
        System.out.println(add(2,3));      // add with two parameters
        System.out.println(add(2,3,4));    //add with three parameters
        System.out.println(add(2,3,4,5));  //add with four parameters

        //add method having many(poly) forms (morph) ==> this property 
        //is called polymorphism
    }
}