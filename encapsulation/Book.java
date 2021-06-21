class Book{
    private final String name;
    private final String author;
    private float price;

    Book(String name,String author){ // constructor 
        this.name = name;
        this.author = author;
    }
    
    public String getName(){ // name getter
        return this.name;
    }
    
    public String getAuthor(){ // author getter
        return this.author;
    }
    
    // can't mutate name and author because they are final   

    public void setPrice(float price){ // price setter
        if(price >= 5){     // validation         
            this.price = price;
        }else{
            System.out.println("Price can't be less than 5");  
        }
    }
    
    public float getPrice(){ //price getter       
        return this.price;
    }
}