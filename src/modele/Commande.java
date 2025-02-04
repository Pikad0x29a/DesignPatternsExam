package modele;

import java.util.List;
import notification.Observable;

public class Commande extends Observable {
    private int id;
    private List<String> produits;
    private double prixTotal;
    private EStatut statut;

    public Commande(CommandeBuilder builder) {
        this.id = builder.getId();
        this.produits = builder.getProduits();
        this.prixTotal = builder.getPrixTotal();
        this.statut = builder.getStatut();
    }

    public void setStatut(EStatut statut) {
        this.statut = statut;
        notifierObservers(statut.name());
    }

    public EStatut getStatut() {
        return statut;
    }

    public int getId() {
        return id;
    }

    public List<String> getProduits() {
        return produits;
    }

    public double getPrixTotal() {
        return prixTotal;
    }
}
