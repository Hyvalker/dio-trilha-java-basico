public class HalfPrice extends Ticket {


    public HalfPrice(double value, String movieName, boolean dubbedOrSubtitled) {
        super(value, movieName, dubbedOrSubtitled);
    }
    @Override
    public double getPrice() {
        return getValue() / 2;
    }
}
