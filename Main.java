import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Systeme de réservation de vol");
        System.out.println("===================================");

        Scanner input = new Scanner(System.in);
        
        // Saisie des informations du passager
        passager p1 = new passager(); 
        
        System.out.println("\n=== Informations du passager ===");
        System.out.println("Veuillez renseigner votre nom :");
        p1.setNom(input.nextLine());
        
        System.out.println("Veuillez renseigner votre prénom :");
        p1.setPrenom(input.nextLine());
        
        System.out.println("Veuillez renseigner votre ID passager :");
        p1.setIdPassager(input.nextInt());
        input.nextLine();
        
        System.out.println("Veuillez renseigner votre numéro de passeport :");
        p1.setNumeroPasseport(input.nextLine());
        
        System.out.println("Veuillez renseigner votre téléphone :");
        p1.setTelephone(input.nextLine());
        
        System.out.println("Veuillez renseigner votre date de naissance (format JJ/MM/AAAA) :");
        String dateStr = input.nextLine();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateNaissance = LocalDate.parse(dateStr, formatter);
            p1.setDateNaissance(dateNaissance);
        } catch (Exception e) {
            System.out.println("Format de date invalide. Utilisation de la date du jour par défaut.");
            p1.setDateNaissance(LocalDate.now());
        }
        
        System.out.println("Veuillez renseigner votre nationalité :");
        p1.setNationalite(input.nextLine());
        
        System.out.println("Veuillez renseigner votre email :");
        p1.setEmail(input.nextLine());

        // Saisie des informations de l'aéroport d'arrivée
        System.out.println("\n=== Informations du vol ===");
        System.out.println("Veuillez renseigner le code IATA de l'aéroport d'arrivée :");
        String codeIATA = input.nextLine();
        
        System.out.println("Veuillez renseigner le nom de l'aéroport d'arrivée :");
        String nomAeroport = input.nextLine();
        
        System.out.println("Veuillez renseigner la ville d'arrivée :");
        String ville = input.nextLine();
        
        System.out.println("Veuillez renseigner le pays d'arrivée :");
        String pays = input.nextLine();
        
        System.out.println("Veuillez renseigner la date et heure d'arrivée (format JJ/MM/AAAA HH:mm) :");
        String dateArriveeStr = input.nextLine();
        LocalDateTime dateArrivee;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            dateArrivee = LocalDateTime.parse(dateArriveeStr, formatter);
        } catch (Exception e) {
            System.out.println("Format de date invalide. Utilisation de la date et heure actuelles par défaut.");
            dateArrivee = LocalDateTime.now();
        }

        // Création des objets
        Aeroport_Arrivee aeroportArrivee = new Aeroport_Arrivee(
            codeIATA, nomAeroport, ville, pays, dateArrivee
        );

        // Affichage des informations
        System.out.println("\n=== Récapitulatif ===");
        p1.displayPassager();
        aeroportArrivee.display_Arrivee();
        
        input.close();
    }
}