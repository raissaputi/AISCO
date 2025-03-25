package aisco.donation.transferva;

import aisco.donation.pgateway.DonationImpl;

public class DTransferVA extends DonationImpl {

    protected String bankVANumber;
    protected String vaNumber;

    public DTransferVA() {
        super();
        this.bankVANumber = "Mandiri";
        this.vaNumber = "VA987654321";
        this.paymentMethod = "Transfer Virtual Account";
    }

    @Override
    public void getDonation() {
        super.getDonation();
        System.out.println("VA Bank: " + bankVANumber);
        System.out.println("VA Number: " + vaNumber);
    }

    @Override
    public void addDonation() {
        super.addDonation();
        System.out.println("Payment via Virtual Account processed.");
    }
}
