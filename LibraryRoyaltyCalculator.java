public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author author = new Author("Billy Hopkins");

        AudioBook audioBook = new AudioBook("Adventure time", "SKØN", 350, 460);
        PrintedBook printedBook = new PrintedBook("Book Back", "BI", 670, 25);
        PrintedBook printedBook2 = new PrintedBook("Heste Pigen", "TE", 999, 30);
        AudioBook audioBook2 = new AudioBook("Iron Man", "FAG", 2000, 180);
        EAudioBook eAudioBook = new EAudioBook("Gastro", "FAG", 100, 67, 69, 120);
        EBook eBook = new EBook("Partners", "BI", 48, 32, 20, 14428, true);
        EBook eBookTest = new EBook("test", "FAG", 97, 50,205, 360000, false);


        author.addTitle(audioBook);
        author.addTitle(printedBook);
        author.addTitle(printedBook2);
        author.addTitle(audioBook2);
        author.addTitle(eAudioBook);
        author.addTitle(eBook);

        author.addTitle(eBookTest);

        System.out.println(author.getName() + ": " + author.calculateRoyalties() + " kr " );

        System.out.println(author.getName()+ " Total points = " + author.calculateTotalPoints()+ " Points" );

        System.out.println("Test: " + eBookTest.calculatePoints() + " Points");
    }




}
