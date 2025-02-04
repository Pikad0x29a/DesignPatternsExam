package notification;

public class Client implements IObserver {
    private int id;
    private String nom;
    private String email;

    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    @Override
    public void update(String statut) {
        System.out.println("Notification pour " + nom + ": le statut de votre commande est maintenant " + statut);
    }
}
