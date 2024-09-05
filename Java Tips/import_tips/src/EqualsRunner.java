public class EqualsRunner {

    static class Client {
        int id;

        public Client(int id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object that) {
            if(this == that) {
                return true;
            }
            if(that == null) {
                return false;
            }
            if(getClass() != that.getClass()) {
                return false;
            }
            if(id != ((Client) that).id) {
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Client c1 = new Client(1);
        Client c2 = new Client(2);
        Client c3 = new Client(2);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
    }
}
