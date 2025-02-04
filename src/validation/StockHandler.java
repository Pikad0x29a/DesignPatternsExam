package validation;

import modele.Commande;

public class StockHandler implements IHandler {
    private IHandler suivant;

    @Override
    public void setSuivant(IHandler suivant) {
        this.suivant = suivant;
    }

    @Override
    public void traiter(Commande commande) {
        // Vérification du stock...
        System.out.println("Vérification du stock pour la commande " + commande.getId());
        if (suivant != null) {
            suivant.traiter(commande);
        }
    }
}
