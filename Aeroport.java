package model;

public class Aeroport {
    private final String codeIATA;
    private final String nom;
    private final String ville;
    private final String pays;

    public Aeroport(String codeIATA, String nom, String ville, String pays) {
        this.codeIATA = codeIATA;
        this.nom = nom;
        this.ville = ville;
        this.pays = pays;
    }

    // Getters (pas de setters car immuable)
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

    @Override
    public String toString() {
        return String.format("%s (%s) - %s, %s", nom, codeIATA, ville, pays);
    }
}