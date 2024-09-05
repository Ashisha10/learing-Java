public class method {
    public static void main(String[] args){
        System.out.println("Final score is = " + calc(true, 1000, 4, 200));
        calc2(true, 1000, 4, 200);
        displayHighscore("Abhijeet", caclHighscorePos(1500));
        displayHighscore("Ashisha", caclHighscorePos(900));
        displayHighscore("Cheeto", caclHighscorePos(400));
        displayHighscore("Khushi", caclHighscorePos(50));
        displayHighscore("Baby", caclHighscorePos(1000));
    }
    public static int calc(boolean gameOver, int score, int level, int bonus) {
        if(gameOver) {
            int result = score + (level *bonus);
            result += 1000;
            return result;
            //System.out.println("Final score is = " + result);
        }
        return -1;
    }
    public static void calc2(boolean gameOver, int score, int level, int bonus) {
        if(gameOver) {
            int result = score + (level * bonus);
            result += 1000;
            System.out.println("Final score is = " + result);
        }
    }
    public static void displayHighscore(String name, int pos) {
        System.out.println( name + " managed to get the position " + pos + " on the table.");
    }
    public static int caclHighscorePos(int score) {
        if (score >= 1000) {
            return 1;
        }
        else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;
    }
}
