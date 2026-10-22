public class EBook extends NetTitle {


    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated){
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;

    }


    private double calculatePages(){

        double pages = (double) characters / 1800 + 20;

        if (illustrated){
            pages = pages * 1.1;
        }
        return pages;


    }

    public double calculatePoints(){

        return calculatePages() * convertLiteratureType() * (getPseudoCopies() + getUseFactor());

    }

}
