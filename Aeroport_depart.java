import java.time.LocalDateTime;

public class Aeroport_depart{
    private String codeIATA;
    private String nom;
    private String ville;
    private String pays;
    private LocalDateTime dateDepart;

    // Constructeur
    public Aeroport_depart(String codeIATA, String nom, String ville, String pays, LocalDateTime dateDepart){
        this.codeIATA = codeIATA;
        this.nom = nom;
        this.ville = ville;
        this.pays = pays;
        this.dateDepart= dateDepart;
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

    public LocalDateTime getDateDepart() {
        return dateDepart;
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

    public void setDateDepart(LocalDateTime dateDepart){
        this.dateDepart=dateDepart;
    }

    // Méthode d'affichage utilisant les getters
    public void display_Arrivee() {
        System.out.println("=== Informations de l'aéroport d'arrivée ===");
        System.out.println("Code IATA: " + getCodeIATA());
        System.out.println("Nom: " + getNom());
        System.out.println("Ville: " + getVille());
        System.out.println("Pays: " + getPays());
        System.out.println("Date d'arrivée: " + getDateDepart());
        System.out.println("===========================================");
    }
}