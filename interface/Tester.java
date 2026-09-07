import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        // Valid Freelancers
        payables.add(new Freelancer("Alex", "Carter", 30.00, 35));
        payables.add(new Freelancer("Maya", "Nguyen", 28.00, 46));

        double totalPayout = 0.0;

        try {
            // Invalid Freelancers
            payables.add(new Freelancer("Jordan", "Lee", -20.00, 30));

        } catch(IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }

        try {
            // Invalid Freelancers
            payables.add(new Freelancer("Sofia", "Martinez", 25.00, -5));

        } catch(IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }

        for(Payable p : payables) {
            p.print();
            totalPayout += p.calculatePayment();
        }

        System.out.printf("Total Payout: $%.2f\n", totalPayout);
    }
}
