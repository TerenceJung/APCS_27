package pkg;

//each global variable should be private, also revenue should've been an int
public class Movie {
    private String MovieName;
    private double Rating;
    private int numRating;
    private double Revenue;
    
    //constructors, you can see in the GC google classroom that there are default values
    // public Movie() {
    //     MovieName = "unknown";
    //     Rating = 0;
    //     numRating = 0;
    //     Revenue = 0;
    // }
    public Movie() {
        MovieName = "Avengers";
        Rating = 8.0;
        numRating = 33;
        Revenue = 623357810;
    }

    public Movie(String a, double b, int c, int d) {
        MovieName = a;
        Rating = b;
        numRating = c;
        Revenue = d;
    }

    //methods
    //for the method right below, you didn't need parameters "String a, double b, int, c, double d"
    public void movieToString() {
        // the stuff right below is useless
        // MovieName = a;
        // Rating = b;
        // numRating = c;
        // Revenue = d;
        System.out.println("Movie: " + MovieName);
        System.out.println("Rating: " + Rating);
        System.out.println("Number of Ratings: " + numRating);
        System.out.println("Revenue: " + Revenue);
        Sysetm.out.println("");
        return;
    }

    // add the below
    public String getMovieName(){
        return MovieName;
    }

    public double getRevenue(double a) {
        return Revenue;
    }

    // should be a void because not returning anything, not a double
    public void addRating(double a) {
        // not this: Rating = ((numRating*Rating) + a)/(numRating + a);
        double preTotal = numRating * Rating;
        double total = prevTotal + a;
        numRating++;
        Rating = total / numRating;
    }
    
    //no parameters
    // public double getRating(double a) {
    //     return Rating;
    // }
    public double getRating() {
       return Rating;
    }
    
    //erm like idek at this point
    // public boolean compareRatings (Movie b) {
    //     if(mA.getRating() > mB.getRating()){
    //         return true;
    //     }
    //     if(mA.getRating() < mB.getRating()){
    //         return false;
    //     }
    // }

    // for the below, "this" isn't really necessary, it's just to really clarify
    public boolean compareRatings(Movie b){
        if(this.rating > a.getRating()){
            return true;
        }
        return false;
    }

    //this stuff is for part 6
    public String revenueToString(){
        int rev = revenue;
        String ans = "";

        while(rev != 1000){ //don't do like rev != 0 cuz like u wanna make it stop adding commas for the last three digits
            int three = rev % 1000; // takes off all the values 1000 and more, and leaves with 999 and below
            ans = three + ","; + ans;
            rev = rev / 1000; //truncates the number and does something else
        }
    }

    // part 7
    public Movie pirateMovie(){
        Movie temp = new Movie(MovieName, Rating, NumRating, Revenue); //all 
        return temp;
        // or could also do
        // return new Movie(MovieName, Rating, NumRating, Revenue);  , skipping the variable part bc variable are for like using again
        // or could also do
        // return this; it's because this represents the whole object
    }

}