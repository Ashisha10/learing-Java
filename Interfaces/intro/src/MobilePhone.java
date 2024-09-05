public class MobilePhone implements Telephone{
    private int myNum;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNum) {
        this.myNum = myNum;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone has been switched on");
    }

    @Override
    public void makeCall(int phoneNum) {
        if(isOn == true) {
            System.out.println("making a call to " + phoneNum);
        }
        else{
            System.out.println("Switch on the phone first");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the call now");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNum) {
        if(phoneNum == myNum && isOn == true) {
            isRinging = true;
            System.out.println("Dhoom tana na");
        }
        else{
            System.out.println("The phone is either switched off or the dialed number is different");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
