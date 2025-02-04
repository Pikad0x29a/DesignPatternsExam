package paiement;

public class PayPal implements IMoyenPaiement {
    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " effectué via PayPal.");
    }
}
