//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComplexAlgo C = new DummyAlgo();
        System.out.println(C.complexAlgo(1,2));
        DummyAlgo d = new DummyAlgo();
        System.out.println(d.complexAlgo(2,3));
        ComplexAlgo c2 = new RealAlgo();
        System.out.println(c2.complexAlgo(1,2));
    }
}