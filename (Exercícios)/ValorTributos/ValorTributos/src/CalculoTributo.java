public class CalculoTributo {
    public static double tributeCalculator(Double cost, double tributePercentage) {
        return cost * (tributePercentage / 100) + cost;
    }
}
