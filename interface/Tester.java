import java.util.ArrayList;

public class Tester {
  public static void main(String[] args) {
    ArrayList<Payable> payables = new ArrayList<>();

    // Valid Freelancers
    payables.add(new Freelancer("Alex", "Carter", 30.00, 35));
    payables.add(new Freelancer("Maya", "Nguyen", 28.00, 46));

    try {
      // Invalid Freelancers
      payables.add(new Freelancer("Jordan", "Lee", -20.00, 30));

    } catch (IllegalArgumentException ex) {
      System.err.println("Error adding Freelancer: " + ex.getMessage());
    }

    try {
      // Invalid Freelancers
      payables.add(new Freelancer("Sofia", "Martinez", 25.00, -5));

    } catch (IllegalArgumentException ex) {
      System.err.println("Error adding Freelancer: " + ex.getMessage());
    }

    // Valid VendorInvoices
    payables.add(new VendorInvoice("Pacific Office Supply", "INV-1001", 1250.75));

    payables.add(new VendorInvoice("Tech Solutions LLC", "INV-1002", 3480.00));

    try {
      payables.add(new VendorInvoice("Metro Printing", "INV-1003", -450.00));
    } catch (IllegalArgumentException ex) {
      System.err.println("Error adding Vendor Invoice: " + ex.getMessage());
    }

    try {
      payables.add(new VendorInvoice("Valley Equipment", "INV-1004", -1.00));
    } catch (IllegalArgumentException ex) {
      System.err.println("Error adding Vendor Invoice: " + ex.getMessage());
    }

    // Print valid payables
    // Calculating total payout
    double totalPayout = 0.0;

    System.out.println();
    for (Payable p : payables) {
      p.print();
      System.out.println();

      totalPayout += p.calculatePayment();
    }

    System.out.printf("===> Total Payout: $%.2f\n", totalPayout);
  }
}
