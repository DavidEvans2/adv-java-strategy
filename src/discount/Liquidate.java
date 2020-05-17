package discount;

public class Liquidate implements Deduct
{
    @Override
    public double getBillAmount(double billAmount) {
        double afterDiscount = billAmount - (billAmount * 0.75);
        return afterDiscount;
    }
}
