public interface Telephone {
    //access modifiers are redundant
    void powerOn();

    void makeCall(int phoneNum);

    void answer();

    boolean callPhone(int phoneNum);

    boolean isRinging();
}
