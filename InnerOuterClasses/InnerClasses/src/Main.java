//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OuterClass o = new OuterClass(1, "Ashisha");
        System.out.println(o.getName() + " " + o.getNum());
        OuterClass.InnerClass s = o.new InnerClass();//for non-static inner class
        s.printing(); 
        System.out.println(s.getHeight() + " " + s.getWeight());
    }
}