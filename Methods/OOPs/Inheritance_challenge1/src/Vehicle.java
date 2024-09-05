public class Vehicle {
    private String name;
    private String size;
    public int currentVelocity;
    public int currentDirection;
    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("direction has been changed to " + currentDirection);
    }

    public void speed(int speed) {
        this.currentVelocity += speed;
        System.out.println("velocity has been changed to " + currentVelocity " and moving in " + currentDirection);
    }
}

