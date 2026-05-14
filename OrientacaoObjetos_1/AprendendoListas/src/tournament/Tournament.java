package tournament;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    //===============Attributes===============
    private List<Player> player;

    //===============Constructor===============
    public Tournament() {
        this.player = new ArrayList<>();
    }

    //===============Methods===============
    public  void recordMatch(Player p1, Player p2, int result){
        if (result == 1){
            System.out.println("Victory = " + p1.getName());
            updatePoints(p1, p2, 1 );
            p1.addHistory("Victory   against " + p2.getName());
        }
        else if(result == 0){
            System.out.println("Draw");
            updatePoints(p1, p2, 0 );
            p1.addHistory("Draw against " + p2.getName());
            p2.addHistory("Draw against " + p1.getName());
        }
        else {
            System.out.println("Victory = " + p2.getName());
            updatePoints(p1, p2, -1 );
            p2.addHistory("Victory against " + p1.getName());

        }
    }
    public void updatePoints(Player p1, Player p2, int victory){
        if(victory == 1){
            int points = (p1.getRating() < p2.getRating()) ? 50: 10;
            p1.setRating(p1.getRating() + points);
        } else
            if(victory == -1){
                int points = (p1.getRating() < p2.getRating()) ? 50: 10;
                p2.setRating(p2.getRating() + points);
        }
        else{
            if (p1.getRating() > p2.getRating()){
                p1.setRating(p1.getRating() - 5);
                p2.setRating(p1.getRating() + 5);
            }
            else {
                p1.setRating(p1.getRating() + 5);
                p2.setRating(p1.getRating() - 5);
            }
        }
    }
}
