public class Paiement {
    public boolean effectuerPaiement(Billet billet, String numeroCarte, double montant) {
        // Implémentation de la logique de paiement
        billet.setPaye(true);
        return true;
    }
}