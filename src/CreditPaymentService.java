public class CreditPaymentService {
    public static double calculate(int credit, double mMonth, int namMonth) {
        //ann = c * ((r * Math.pow((1 + r), 12 * y)) / (Math.pow((1 + r), 12 * y) - 1));
        return (int) credit * ((mMonth * Math.pow((1 + mMonth), namMonth)) / (Math.pow((1 + mMonth), namMonth) - 1));
    }
}
