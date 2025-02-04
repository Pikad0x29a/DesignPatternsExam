package modele;

import java.util.List;

public class CommandeBuilder {
    private int id;
    private List<String> produits;
    private double prixTotal;
    private EStatut statut;

    public CommandeBuilder(int id) {
        this.id = id;
    }

    public CommandeBuilder withProduits(List<String> produits) {
        this.produits = produits;
        return this;
    }

    public CommandeBuilder withPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
        return this;
    }

    public CommandeBuilder withStatut(EStatut statut) {
        this.statut = statut;
        return this;
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

    public EStatut getStatut() {
        return statut;
    }

    public Commande build() {
        return new Commande(this);
    }
}
