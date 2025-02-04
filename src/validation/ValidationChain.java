package validation;

public class ValidationChain {
    public static IHandler construireChaine() {
        IHandler stockHandler = new StockHandler();
        IHandler paiementHandler = new PaiementHandler();
        IHandler envoiHandler = new EnvoiHandler();

        stockHandler.setSuivant(paiementHandler);
        paiementHandler.setSuivant(envoiHandler);

        return stockHandler;
    }
}
