import modele.Commande;
import modele.CommandeBuilder;
import modele.EStatut;
import notification.Client;
import paiement.FMoyenPaiement;
import paiement.IMoyenPaiement;
import utils.TransactionLogger;
import validation.ValidationChain;
import validation.IHandler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création du logger
        TransactionLogger logger = TransactionLogger.getInstance();
        logger.log("Démarrage de l'application");

        // Création des objets nécessaires
        IHandler chaineValidation = ValidationChain.construireChaine();

        // Liste de produits
        List<String> produits = List.of(
                "Clavier 10.99€",
                "Antivirus 159.99€",
                "Licence Windows Server 599.49€"
        );

        // Calcul du prix total
        double prixTotal = 10.99 + 159.99 + 599.49;

        // Création de la commande avec le builder
        Commande commande = new CommandeBuilder(1)
                .withProduits(produits)
                .withPrixTotal(prixTotal)
                .withStatut(EStatut.EN_ATTENTE)
                .build();

        // Ajout des observateurs
        Client client1 = new Client(1, "Pika", "pika@uha.fr");
        Client client2 = new Client(2, "Zitouni", "zitouni@uha.fr");
        Client client3 = new Client(3, "Anastasia", "anastasia@uha.fr");
        Client client4 = new Client(4, "Fifi", "fifi@uha.fr");
        commande.ajouterObserver(client1);
        commande.ajouterObserver(client2);
        commande.ajouterObserver(client3);
        commande.ajouterObserver(client4);

        // Traitement de la commande
        logger.log("Traitement de la commande " + commande.getId());
        chaineValidation.traiter(commande);
        logger.log("Commande " + commande.getId() + " traitée");

        // Utilisation de la Factory pour gérer le paiement
        String typePaiement = "carte";
        double montant = commande.getPrixTotal();

        IMoyenPaiement moyenPaiement = FMoyenPaiement.getMoyenPaiement(typePaiement);
        moyenPaiement.payer(montant);
        logger.log("Paiement de " + montant + "€ effectué via " + typePaiement);
    }
}
