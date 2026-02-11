public class Movie
{
    private String title;
    private double duration;
    private int rating;

    public Movie(String title, double duration)
    {
        this.title = title;
        this.duration = duration;
        rating = 0;
    }

    public String getTitle()
    {
        return title;
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

    public boolean equals(Movie m)
    {
        if (m == null)
        {
            return false;
        }
        return title.equals(m.title) && duration == m.duration;
    }

    public String toString()
    {
        return "title: " + title + ", rating: " + rating;
    }
}
