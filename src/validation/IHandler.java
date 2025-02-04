package validation;

import modele.Commande;

public interface IHandler {
    void setSuivant(IHandler suivant);
    void traiter(Commande commande);
}
