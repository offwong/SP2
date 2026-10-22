import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;


    public Author(String name){

        this.name = name;
        titles = new ArrayList<>();
    }

    void addTitle(Title title){
        titles.add(title);
    }

    public double calculateRoyalties(){
        double sum = 0.0;
        for (Title title : titles){
           sum += title.calculateRoyalty();
        }
        return Math.round(sum * 100) / 100.0;
    }

    String getName(){
        return name;
    }

    public double calculateTotalPoints(){
        double totalPoints = 0.0;
        for (Title title : titles){
            totalPoints += title.calculatePoints();
        }
        return Math.round(totalPoints * 100) / 100.0;
    }




}
