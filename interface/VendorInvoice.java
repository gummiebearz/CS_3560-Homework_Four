public class VendorInvoice implements Payable {
  private String vendorName;
  private String invoiceNumber;
  private double amountDue;

  public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
    this.vendorName = vendorName;
    this.invoiceNumber = invoiceNumber;
    this.setAmountDue(amountDue);
  }

  public String getVendorName() {
    return this.vendorName;
  }

  public String getInvoiceNumber() {
    return this.invoiceNumber;
  }

  public double getAmountDue() {
    return this.amountDue;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public void setAmountDue(double newAmountDue) {
    if (newAmountDue < 0) {
      throw new IllegalArgumentException("Amount due must be non-negative");
    }
    this.amountDue = newAmountDue;
  }

  @Override
  public double calculatePayment() {
    return this.amountDue;
  }

  @Override
  public String getPayeeName() {
    return this.vendorName;
  }

  @Override
  public void print() {
    System.out.println(this.getPayeeName());
    System.out.printf("    -> Payment: $%.2f\n", this.calculatePayment());
  }
}
