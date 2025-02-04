package paiement;

public class FMoyenPaiement {
    public static IMoyenPaiement getMoyenPaiement(String type) {
        switch (type.toLowerCase()) {
            case "carte":
                return new CarteBancaire();
            case "paypal":
                return new PayPal();
            case "crypto":
                return new Cryptomonnaie();
            default:
                throw new IllegalArgumentException("Type de paiement inconnu : " + type);
        }
    }
}
