package discount;

public class Sale implements Deduct{
    @Override
    public double getBillAmount(double billAmount) {
        double afterDiscount = billAmount - (billAmount * 0.1);
        return afterDiscount;
    }
}
