package pkg;

public class Movie {
    String MovieName;
    double Rating;
    int numRating;
    double Revenue;
    
    //constructors
    public Movie() {
        MovieName = "unknown";
        Rating = 0;
        numRating = 0;
        Revenue = 0;
    }

    public Movie(String a, double b, int c, int d) {
        MovieName = a;
        Rating = b;
        numRating = c;
        Revenue = d;
    }

    //methods
    public void movieToString(String a, double b, int, c, double d) {
        MovieName = a;
        Rating = b;
        numRating = c;
        Revenue = d;
        System.out.println("Movie: " + MovieName);
        System.out.println("Rating: " + Rating);
        System.out.println("Number of Ratings: " + numRating);
        System.out.println("Revenue: " + Revenue);
        Sysetm.out.println("");
        return;
    }

    public double getRevenue(double a) {
        return Revenue;
    }

    public double addRating(double a) {
        Rating = ((numRating*Rating) + a)/(numRating + a);
    }

    public double getRating(double a) {
        return Rating;
    }
    
    public boolean compareRatings (Movie b) {
        if(mA.getRating > mB.getRating){
            return true;
        }
        if(mA.getRating < mB.getRating){
            return false;
        }
    }


}