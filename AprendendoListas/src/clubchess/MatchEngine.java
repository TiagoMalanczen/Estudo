package clubchess;

public class MatchEngine {

    //==========Methods==========
    public void processClubMatch(Member m1, Member m2, int result) {
        if (result == 1) {
            int points = (m1.getRating() > m2.getRating()) ? 10 : 50;
            calculateBonus(points, m1);
            System.out.println("Winner = " + m1.getName());
        } else if (result == -1) {
            int points = (m2.getRating() > m1.getRating()) ? 10 : 50;
            calculateBonus(points, m2);
            System.out.println("Winner = " + m2.getName());
        } else {
            if (m1.getRating() > m2.getRating()) {
                m1.setRating(m1.getRating() - 5);
                m2.setRating(m2.getRating() + 5);
                System.out.println("Draw");
            } else if (m1.getRating() < m2.getRating()) {
                m1.setRating(m1.getRating() + 5);
                m2.setRating(m2.getRating() - 5);
                System.out.println("Draw");
            } else {
                m1.setRating(m1.getRating() + 5);
                m2.setRating(m2.getRating() + 5);
                System.out.println("Draw");
            }
        }
    }
    public void calculateBonus(int points, Member m){
        if (m.hasBonus()){
         int bonus = (points*20)/100;
         points += bonus;
         System.out.println("Bonus applied " + points);
        }
       m.setRating(m.getRating()+ points);
    }
}
