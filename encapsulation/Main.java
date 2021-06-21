public class Main{
    public static void main(String args[]){
        Book book = new Book("abc","Mr.xyz");
        
        // System.out.println(book.name); // Error because it is private variable
        // System.out.println(book.author); // Error because it is private variable
        // System.out.println(book.price); // Error because it is private variable
        
        //Accessors -> Access price,author,price
        System.out.println("Name of the book : " + book.getName()); // 
        System.out.println("Author : " + book.getAuthor());
        System.out.println("Before setting price : " + book.getPrice()); // price is initially 0
        
        //Mutator -> Mutate/Change price
        book.setPrice(5); //setting price to 5
        System.out.println("After setting price : " + book.getPrice()); // price is 10

        book.setPrice(4); //setting price to 4
        System.out.println("After setting price : " + book.getPrice()); // price is not updated
    }
}