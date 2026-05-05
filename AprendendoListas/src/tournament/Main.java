package tournament;

public class Main {
    public static void main(String[] args) {

        //==========Attributes==========
        Player p1  = new Player("Jonh");
        Player p2  = new Player("Mark");

        Tournament tournament = new Tournament();

        //==========Testing==========
        tournament.recordMatch(p1, p2, 0);
        p1.printSummary();
        tournament.recordMatch(p1, p2, 1);
        p1.printSummary();

    }
}
