public class Book
{
    private String title;
    private String author;
    private int rating;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        rating = 0;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getRating()
    {
        return rating;
    }

    public int adjustRating(int r)
    {
        if (rating + r >= 0 && rating + r <= 10)
        {
            rating += r;
        }
        return rating;
    }

    public boolean equals(Book b)
    {
        if (b == null)
        {
            return false;
        }
        return title.equals(b.title) && author.equals(b.author);
    }

    public String toString()
    {
        return "title: " + title + ", author: " + author + ", rating: " + rating;
    }
}
