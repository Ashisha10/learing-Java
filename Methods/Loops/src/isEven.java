public class isEven {
    public static void main(String[] args) {
        int i = 1;
        while(i < 10) {
            i++;
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        do{
            System.out.println(i);
            i++;
        }while(i <= 15);
    }
}
