package aisco.donation.pgateway;
import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationComponent {

    protected String name;
    protected String email;
    protected String phone;
    protected double amount;
    protected String paymentMethod;

    public DonationImpl() {
        System.out.println("\n[Payment Gateway] Donation Initialized.");
    }

    @Override
    public void getDonation() {
        System.out.println("Donor: " + name);
        System.out.println("Amount: Rp " + amount);
        System.out.println("Method: " + paymentMethod);
    }

    @Override
    public void addDonation() {
        System.out.println("New donation added.");
    }
}
