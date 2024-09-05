public class OuterClass {
    private int num;
    private String  name;

    public OuterClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public class InnerClass {
        private int weight = 23;
        private int height = 5 ;

        public int getWeight() {
            return weight;
        }

        public int getHeight() {
            return height;
        }
                void printing() {
            System.out.println(num + " " + name + " " + height + " " + weight);
        }
    }
 }
