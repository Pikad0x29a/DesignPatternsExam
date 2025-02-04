package validation;

import modele.Commande;

public class EnvoiHandler implements IHandler {
    private IHandler suivant;

    @Override
    public void setSuivant(IHandler suivant) {
        this.suivant = suivant;
    }

    @Override
    public void traiter(Commande commande) {
        System.out.println("Envoi de la commande " + commande.getId());

    }
}
