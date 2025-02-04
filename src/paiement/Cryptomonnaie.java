package paiement;

public class Cryptomonnaie implements IMoyenPaiement {
    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " effectué en cryptomonnaie.");
    }
}
