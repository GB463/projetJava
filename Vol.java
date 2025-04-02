import java.time.Duration;
import java.util.Objects;

public class Vol {
    private final String idVol;
    private final String compagnie;
    private int placesDisponibles;
    private final Aeroport_depart depart;
    private final Aeroport_Arrivee arrivee;

    // Constructor
    public Vol(String idVol, String compagnie, int placesDisponibles, 
               Aeroport_depart depart, Aeroport_Arrivee arrivee) {
        Objects.requireNonNull(idVol, "L'ID du vol ne peut pas être null");
        Objects.requireNonNull(compagnie, "La compagnie ne peut pas être null");
        Objects.requireNonNull(depart, "L'aéroport de départ ne peut pas être null");
        Objects.requireNonNull(arrivee, "L'aéroport d'arrivée ne peut pas être null");
        
        if (placesDisponibles < 0) {
            throw new IllegalArgumentException("Le nombre de places disponibles ne peut pas être négatif.");
        }

        this.idVol = idVol;
        this.compagnie = compagnie;
        this.placesDisponibles = placesDisponibles;
        this.depart = depart;
        this.arrivee = arrivee;
    }

    // Getters
    public String getIdVol() { return idVol; }
    public String getCompagnie() { return compagnie; }
    public int getPlacesDisponibles() { return placesDisponibles; }
    public Aeroport_depart getDepart() { return depart; }
    public Aeroport_Arrivee getArrivee() { return arrivee; }

    // Méthode pour calculer la durée du vol
    public String getDuree() {
        // Vérification si l'aéroport de départ ou d'arrivée sont null
        if (depart == null || arrivee == null || depart.getDateDepart() == null || arrivee.getDateArrivee() == null) {
            return "Durée inconnue";
        }
        
        // Calcul de la durée si les dates sont valides
        long minutes = Duration.between(depart.getDateDepart(), arrivee.getDateArrivee()).toMinutes();
        return (minutes / 60) + "h " + (minutes % 60) + "m";
    }

    // Affichage des informations du vol
    public void display() {
        System.out.println("Vol " + compagnie + " " + idVol);
        
        // Affichage de l'aéroport de départ avec gestion des nulls
        if (depart != null && depart.getDateDepart() != null) {
            System.out.println("Départ: " + depart.getNom() + " (" + depart.getCodeIATA() + ") - " + depart.getVille() + ", " + depart.getPays());
            System.out.println("Date de départ: " + depart.getDateDepart());
        } else {
            System.out.println("Départ: Inconnu");
        }

        // Affichage de l'aéroport d'arrivée avec gestion des nulls
        if (arrivee != null && arrivee.getDateArrivee() != null) {
            System.out.println("Arrivée: " + arrivee.getNom() + " (" + arrivee.getCodeIATA() + ") - " + arrivee.getVille() + ", " + arrivee.getPays());
            System.out.println("Date d'arrivée: " + arrivee.getDateArrivee());
        } else {
            System.out.println("Arrivée: Inconnu");
        }

        // Affichage de la durée du vol
        System.out.println("Durée: " + getDuree());

        // Affichage des places disponibles
        System.out.println("Places disponibles: " + placesDisponibles);
    }
}
