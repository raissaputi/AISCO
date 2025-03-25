package aisco.donation.transferbank;

import aisco.donation.pgateway.DonationImpl;

public class DTransferBank extends DonationImpl {

    protected String bankAccountNumber;
    protected String bankName;

    public DTransferBank() {
        super();
        this.bankName = "BCA";
        this.bankAccountNumber = "1234567890";
        this.paymentMethod = "Transfer Bank";
    }

    @Override
    public void getDonation() {
        super.getDonation();
        System.out.println("Bank: " + bankName);
        System.out.println("Account No: " + bankAccountNumber);
    }

    @Override
    public void addDonation() {
        super.addDonation();
        System.out.println("Payment via bank transfer processed.");
    }
}
