
import java.time.LocalDate;

public class passager {
    private int idPassager;
    private String numeroPasseport;
    private String nom;
    private String prenom;
    private String telephone;
    private LocalDate dateNaissance;
    private String nationalite;
    private String email;

    public passager(){}

    public passager(int idPassager, String numeroPasseport, String nom, String prenom, 
                   String telephone, LocalDate dateNaissance, String nationalite, String email) {
        this.idPassager = idPassager;
        this.numeroPasseport = numeroPasseport;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.nationalite = nationalite;
        this.email = email;
    }

    // Getters
    public int getIdPassager() {
        return idPassager;
    }

    public String getNumeroPasseport() {
        return numeroPasseport;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setIdPassager(int idPassager) {
        this.idPassager = idPassager;
    }

    public void setNumeroPasseport(String numeroPasseport) {
        this.numeroPasseport = numeroPasseport;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Méthode d'affichage utilisant les getters
    public void displayPassager() {
        System.out.println("=== Informations du passager ===");
        System.out.println("ID: " + getIdPassager());
        System.out.println("Passeport: " + getNumeroPasseport());
        System.out.println("Nom complet: " + getNom() + " " + getPrenom());
        System.out.println("Téléphone: " + getTelephone());
        System.out.println("Date de naissance: " + getDateNaissance());
        System.out.println("Nationalité: " + getNationalite());
        System.out.println("Email: " + getEmail());
        System.out.println("===============================");
    }
}