public class DeskPhone implements Telephone {

    private int myNum;

    private boolean isRinging;

    public DeskPhone(int myNum) {
        this.myNum = myNum;
    }

    @Override
    public void powerOn() {
        System.out.println("no action taken");
    }

    @Override
    public void makeCall(int phoneNum) {
        System.out.println("now calling " + phoneNum);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("answering the phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNum) {
        if (phoneNum == myNum) {
            isRinging = true;
            System.out.println("ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
