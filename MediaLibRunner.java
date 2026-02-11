public class MediaLibRunner
{
    public static void main(String[] args)
    {
        MediaLib myLib1 = new MediaLib();
        MediaLib myLib2 = new MediaLib();

        myLib1.addBook("The Alchemist", "Paulo Coelho");
        myLib1.addMovie("The Dark Knight", 2.32);
        myLib1.addSong("Blinding Lights");

        myLib2.addBook("To Kill a Mockingbird", "Harper Lee");
        myLib2.addMovie("Gladiator", 2.35);
        myLib2.addSong("Hotel California");

        System.out.println("Library 1:");
        System.out.println(myLib1);

        System.out.println("Library 2:");
        System.out.println(myLib2);

        System.out.println("Total entries: " + MediaLib.getNumEntries());
        System.out.println("Books: " + MediaLib.getNumBooks());
        System.out.println("Movies: " + MediaLib.getNumMovies());
        System.out.println("Songs: " + MediaLib.getNumSongs());
    }
}
