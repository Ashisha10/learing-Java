public class MuxTable {
    private int num = this.num;

    public MuxTable(int num) {
        this.num = num;
    }
     void printTable(){
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "= " + num*i);
        }
    }
}
