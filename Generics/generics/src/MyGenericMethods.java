import java.util.List;

public class MyGenericMethods {
    static <X> X doubleVal(X val) {
        return val;
    }
    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    static double sumOfNumList(List<? extends Number> ar) {
        double ans = 0.0;
        for(Number val: ar) {
            ans += val.doubleValue();
        }
        return ans;
    }
}
