public class overloadedMethod {
    public static void main(String[] args) {
        int newScore = calcScores("Abhijeet", 100);
        System.out.println("Abhijeet's new scores are " + newScore);
        calcScores(10);
        //first the called method is implemented then this statement
        System.out.println("Unnamed player's new scores are " + calcScores(75));
        calcScores();
    }

    public static int calcScores(String name, int score) {
        System.out.println(name + " scored " + score);
        return score *1000;
    }
    public static int calcScores(int score) {
        System.out.println("Unnamed player scored " + score);
        return score *1000; //invalidated in the printed result
    }
    public static int calcScores() {
        System.out.println("No player, no scores");
        return 0;
    }
}
