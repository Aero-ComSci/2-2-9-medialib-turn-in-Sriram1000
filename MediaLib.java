public class MediaLib
{
    // CLASS VARIABLES
    private static int numEntries = 0;
    private static int numBooks = 0;
    private static int numMovies = 0;
    private static int numSongs = 0;

    // INSTANCE VARIABLES
    private Book book;
    private Movie movie;
    private Song song;

    public void addBook(String title, String author)
    {
        if (book == null)
        {
            book = new Book(title, author);
            numEntries++;
            numBooks++;
        }
    }

    public void addMovie(String title, double duration)
    {
        if (movie == null)
        {
            movie = new Movie(title, duration);
            numEntries++;
            numMovies++;
        }
    }

    public void addSong(String title)
    {
        if (song == null)
        {
            song = new Song(title);
            numEntries++;
            numSongs++;
        }
    }

    public static int getNumEntries()
    {
        return numEntries;
    }

    public static int getNumBooks()
    {
        return numBooks;
    }

    public static int getNumMovies()
    {
        return numMovies;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }

    public String toString()
    {
        String info = "";

        if (book != null) info += book + "\n";
        if (movie != null) info += movie + "\n";
        if (song != null) info += song + "\n";

        return info;
    }
}
