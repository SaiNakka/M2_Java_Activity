import java.util.*;

public class Main2 {
    Scanner sc = new Scanner(System.in);
    private String team;
    private String current_Innings;
    private int score;

    public void setTeam(String team) {
        this.team = team;
    }

    public void setcurrent_Innings(String current_Innings) {
        this.current_Innings = current_Innings;
    }

    public void setRuns(int score) {
        this.score = score;
    }

    public String getTeam() {
        return this.team;
    }

    public String getcurrent_Innings() {
        return this.current_Innings;
    }

    public int getscore() {
        return this.score;
    }

    void Values() {
        System.out.println("Enter the Team Name:");
        team = sc.next();
        System.out.println("For 1st Session Enter 1:");
        System.out.println("For 2nd Session Enter 2:");
        current_Innings = sc.next();
        System.out.println("Enter Score:");
        score = sc.nextInt();
    }

    void displayValues() {
        System.out.println("Team Name:" + this.team);
        System.out.println("Score of the Team:" + this.score);
        if (this.current_Innings.equalsIgnoreCase("First") || this.current_Innings.equals("1")) {
            score = score + 1;
            System.out.printf("Need %d to win", score);
        } else if (this.current_Innings.equalsIgnoreCase("Second") || this.current_Innings.equals("2")) {
            System.out.println("Match Ended");

        } else {
            System.out.println("Invaild input");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Main2 cr = new Main2();
        cr.Values();
        cr.displayValues();
    }
}
