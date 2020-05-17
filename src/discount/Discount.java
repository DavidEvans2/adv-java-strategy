package discount;

public class Discount implements  Deduct{
    @Override
    public double getBillAmount(double billAmount){
        double afterDiscount = billAmount - (billAmount * 0.5);
        return afterDiscount;
    }
}
