public class FamilyTicket extends Ticket {

    private int familyMembers;

    public int getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(int familyMembers) {
        this.familyMembers = familyMembers;
    }
    public FamilyTicket(double value, String movieName, boolean dubbedOrSubtitled) {
        super(value, movieName, dubbedOrSubtitled);
    }
    @Override
    public double getPrice() {
        double totalValue = getValue() * familyMembers;
        if(familyMembers > 3) {
            double discount = totalValue * 0.05;
            totalValue -= discount;
        }
        return totalValue;
    }
}
