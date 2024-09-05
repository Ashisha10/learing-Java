public class Car {
    //access modifier --
    //public keyword is an unrestricted access to the class
    //private keyword is when no other classes can access this class
    //protected --limited access 

    //a class is a blueprint for an object that we are going to be creating
     //classes allow us to create variables that are accessable anywhere within the class 
     //these var are member var or fields
    //these tell about the char of the class, for eg doors
    final public int doors = 4;
    public int wheels = 4;
    private String model;
    private String colour;
    int range;
    public Car(int x) {
        range = x;
    }
}
