package validation;

import modele.Commande;

public class PaiementHandler implements IHandler {
    private IHandler suivant;

    @Override
    public void setSuivant(IHandler suivant) {
        this.suivant = suivant;
    }

    @Override
    public void traiter(Commande commande) {
        System.out.println("Vérification du paiement pour la commande " + commande.getId());
        if (suivant != null) {
            suivant.traiter(commande);
        }
    }
}
