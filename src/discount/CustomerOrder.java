package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;
    private Deduct deduct;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
    }

    public void setDeduct(Deduct newDeduct) {
        deduct = newDeduct;
    }

    public double getBillAmount() {
        switch (discountType) {
            case 'S':
            case 's':
                deduct = new Sale();
                deduct.getBillAmount(billAmount);
                break;
            case 'D':
            case 'd':
                deduct = new Discount();
                deduct.getBillAmount(billAmount);
                break;
            case 'L':
            case 'l':
                deduct = new Liquidate();
                deduct.getBillAmount(billAmount);
                break;
            default:
                deduct.getBillAmount(billAmount);
        }
        return deduct.getBillAmount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer"
                + "customerName='" + customerName + '\'' + ", billAmount=" + billAmount + ", discountType=" + discountType ;
    }
}