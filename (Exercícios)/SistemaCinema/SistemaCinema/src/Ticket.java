public class Ticket {

    protected double value;
    private String movieName;
    private boolean dubbedOrSubtitled;

    public String getMovieName() {
        return movieName;
    }

    public boolean isDubbedOrSubtitled() {
        return dubbedOrSubtitled;
    }

    public Ticket(double value, String movieName, boolean dubbedOrSubtitled) {
       this.value = value;
       this.movieName = movieName;
       this.dubbedOrSubtitled = dubbedOrSubtitled;
    }
    public double getPrice(){
        return value;
    }
    protected double getValue(){
        return value;
    }
}
