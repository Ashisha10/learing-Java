public class Fan {
    private String make;
    private double rad;
    private String color;
    private boolean isOn;
    private byte speed;

    public Fan(java.lang.String make, double rad, java.lang.String color) {
        this.make = make;
        this.rad = rad;
        this.color = color;
    }

    void switchOn() {
        isOn = true;
    }
    void switchOff() {
        isOn = false;
        changeSpeed(0);
    }
    void changeSpeed(int newSpeed) {
        byte newSpeed2 = (byte) newSpeed;
        if(isOn && newSpeed <= 5) {
            speed = newSpeed2;
        }
    }

    public String toString() {
        return "make- " + make + " rad- " + rad + " color- "+ color +" isOn- " + isOn + " speed-" + speed;
    }

}
