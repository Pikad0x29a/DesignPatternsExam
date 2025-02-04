package paiement;

public class CarteBancaire implements IMoyenPaiement {
    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " effectué par carte bancaire.");
    }
}
