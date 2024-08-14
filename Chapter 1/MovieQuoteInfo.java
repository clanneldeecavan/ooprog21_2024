public class MovieQuoteInfo
{

    static void printMovieQuoteInfo(String movieQuote, String characterName, String movieTitle, int movieYear) {
        System.out.println("Movie Quote:");
        System.out.println("\t" + movieQuote);
        System.out.println();
        System.out.println("Title of the Movie:");
        System.out.println("\t" + movieTitle);
        System.out.println();
        System.out.println("Character Name:");
        System.out.println("\t" + characterName);
        System.out.println();
        System.out.println("Year of the Movie:");
        System.out.println("\t" + movieYear);
    }

    public static void main(String[] args) {
        printMovieQuoteInfo(
            "\"I love you 3000\"",   
            "Tony Stark/Iron Man",   
            "Avengers: Endgame",     
            2019                    
        );
    }
}
