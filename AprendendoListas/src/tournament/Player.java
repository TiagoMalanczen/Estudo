package tournament;

import java.util.ArrayList;
import java.util.List;

public class Player {
    //===============Attributes===============
    private String name;
    private int rating;
    private List<String> matchHistory;

    //===============Attributes===============
    public Player(String name){
        this.name = name;
        this.rating = 1500;
        this.matchHistory = new ArrayList<>();
    }


    //===============Methods===============
    public void printSummary() {
        System.out.println("Player: " + name + " [Rating: " + rating + "]");
        System.out.println("History:");
        matchHistory.forEach(System.out::println);
    }
    //===============Getters===============

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    //===============Setters===============
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void addHistory(String entry){
        this.matchHistory.add(entry);
    }

    //===============ToString===============

}
