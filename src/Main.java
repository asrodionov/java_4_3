public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int year1 = 12;
        int year2 = 24;
        int year3 = 36;
        int creditAmount = 1_000_000;
        double interestRate = 9.99;

        double monthlyPayment1 = service.calculate(creditAmount, year1, interestRate);
        double monthlyPayment2 = service.calculate(creditAmount, year2, interestRate);
        double monthlyPayment3 = service.calculate(creditAmount, year3, interestRate);

        System.out.printf("%.0f\n",monthlyPayment1);
        System.out.printf("%.0f\n",monthlyPayment2);
        System.out.printf("%.0f\n",monthlyPayment3);
    }
}
