package aisco.donation.ewallet;

import aisco.donation.pgateway.DonationImpl;

public class DEWallet extends DonationImpl {

    protected String idEWallet;
    protected String providerName;

    public DEWallet() {
        super();
        this.providerName = "GoPay";
        this.idEWallet = "GW123456789";
        this.paymentMethod = "EWallet";
    }

    @Override
    public void getDonation() {
        super.getDonation();
        System.out.println("Via EWallet");
        System.out.println("Provider: " + providerName);
        System.out.println("EWallet ID: " + idEWallet);
    }

    @Override
    public void addDonation() {
        super.addDonation();
        System.out.println("Payment processed via EWallet.");
    }
}
