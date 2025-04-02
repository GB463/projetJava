public class Main {
    public static void main(String[] args) {
        // Création des aéroports
        AeroportDepart paris = new AeroportDepart(
            "CDG", "Paris Charles de Gaulle", "Paris", "France",
            LocalDateTime.of(2023, 12, 15, 14, 30));
        
        AeroportArrivee newYork = new AeroportArrivee(
            "JFK", "John F. Kennedy", "New York", "USA",
            LocalDateTime.of(2023, 12, 15, 20, 15));
        
        // Création d'un vol
        Vol vol = new Vol("AF123", "Air France", 150, paris, newYork);
        
        // Affichage
        System.out.println("Détails du vol:");
        System.out.println(vol);
        
        System.out.println("\nInfos départ:");
        System.out.println(paris);
        
        System.out.println("\nInfos arrivée:");
        System.out.println(newYork);
    }
}