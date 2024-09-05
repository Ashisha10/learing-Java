public interface Phone {
    boolean isOff = false;
    default void ringing(){
        System.out.println("tring tring");
    }

    public void receiving();
    public void solving(boolean success);
    public void solving();
    public void terminating();
}
