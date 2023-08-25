public class CreditPaymentService {
    public static double calculate(int credit, double mMonth, int namMonth) {
        return (int) credit * ((mMonth * Math.pow((1 + mMonth), namMonth)) / (Math.pow((1 + mMonth), namMonth) - 1));
    }
}
