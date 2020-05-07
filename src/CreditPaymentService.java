public class CreditPaymentService {
    public double calculate (int amount, int year, double rate) {
        return amount * ( (rate/12/100) + ((rate/12/100) / (Math.pow(1+(rate/12/100), year)-1)));
    }
}
