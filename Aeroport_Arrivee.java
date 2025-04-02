import java.time.LocalDateTime;

public class Aeroport_Arrivee {
    private String codeIATA;
    private String nom;
    private String ville;
    private String pays;
    private LocalDateTime dateArrivée;

    // Constructeur
    public Aeroport_Arrivee(String codeIATA, String nom, String ville, String pays, LocalDateTime dateArrivée) {
        this.codeIATA = codeIATA;
        this.nom = nom;
        this.ville = ville;
        this.pays = pays;
        this.dateArrivée = dateArrivée;
    }

    // Getters
    public String getCodeIATA() {
        return codeIATA;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public LocalDateTime getDateArrivée() {
        return dateArrivée;
    }

    // Setters
    public void setCodeIATA(String codeIATA) {
        this.codeIATA = codeIATA;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setDateArrivée(LocalDateTime dateArrivée) {
        this.dateArrivée = dateArrivée;
    }

    // Méthode d'affichage utilisant les getters
    public void display_Arrivee() {
        System.out.println("=== Informations de l'aéroport d'arrivée ===");
        System.out.println("Code IATA: " + getCodeIATA());
        System.out.println("Nom: " + getNom());
        System.out.println("Ville: " + getVille());
        System.out.println("Pays: " + getPays());
        System.out.println("Date d'arrivée: " + getDateArrivée());
        System.out.println("===========================================");
    }
}