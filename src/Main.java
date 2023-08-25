public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int NamMonth = 36;
        double payment;
        double mGod = 9.99;
        double mMonth = (mGod / 100) / 12;
        payment = CreditPaymentService.calculate(credit, mMonth, NamMonth);
        System.out.println("Месячная оплата по кредиту составляет " + Math.round(payment) + " рублей");
    }
}