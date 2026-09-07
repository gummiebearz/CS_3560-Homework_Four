public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    public VendorInvoice(String newVendorName, String newInvoiceNumber, double newAmountDue) {
        vendorName = newVendorName;
        invoiceNumber = newInvoiceNumber;
        setAmountDue(newAmountDue);
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setVendorName(String newVendorName) {
        vendorName = newVendorName;
    }

    public void setInvoiceNumber(String newInvoiceNumber) {
        invoiceNumber = newInvoiceNumber;
    }

    public void setAmountDue(double newAmountDue) {
        if(newAmountDue < 0) {
            throw new IllegalArgumentException("Amount due must be non-negative");
        }
        amountDue = newAmountDue;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    public void print() {
        System.out.println(getPayeeName());
        System.out.printf("    -> Payment: $%.2f\n", calculatePayment());
    }
}
