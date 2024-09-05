class SuperClass {
    public void printFn() {
        System.out.println("this is parent");
    }
}

class SubClass extends SuperClass{
    //overrides method from parent
    @Override
            //for overriding the fn must be called again
    public void printFn() {
        super.printFn(); //if super keyword is not used, it is infinte  recursive call ---reached end of while parsing
        System.out.println("this is child");
    }



