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
        
        // Saisie de la date de naissance avec vérification
        LocalDate dateNaissance = null;
        do {
            System.out.println("Veuillez renseigner votre date de naissance (format JJ/MM/AAAA) :");
            String dateStr = input.nextLine();
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                dateNaissance = LocalDate.parse(dateStr, formatter);
                p1.setDateNaissance(dateNaissance);
            } catch (Exception e) {
                System.out.println("Format de date invalide. Veuillez réessayer.");
            }
        } while (dateNaissance == null);
        
        System.out.println("Veuillez renseigner votre nationalité :");
        p1.setNationalite(input.nextLine());
        
        System.out.println("Veuillez renseigner votre email :");
        p1.setEmail(input.nextLine());
        p1.displayPassager();

        // IATA d'arrivée
        System.out.println("\n=== Informations du vol ===");
        System.out.println("Veuillez renseigner le code IATA de l'aéroport d'arrivée :");
        String codeIATAa = input.nextLine();
        // IATA depart
        System.out.println("Veuillez renseigner le code IATA de l'aéroport de départ :");
        String codeIATAd = input.nextLine();
        
        // name arrivée
        System.out.println("Veuillez renseigner le nom de l'aéroport d'arrivée :");
        String nomAeroporta = input.nextLine();

        // name depart
        System.out.println("Veuillez renseigner le nom de l'aéroport de départ :");
        String nomAeroportd = input.nextLine();

        // ville arrivée
        System.out.println("Veuillez renseigner la ville d'arrivée :");
        String villea = input.nextLine();

        // ville départ
        System.out.println("Veuillez renseigner la ville départ :");
        String villed = input.nextLine();
        
        // pays arrivé
        System.out.println("Veuillez renseigner le pays d'arrivée :");
        String paysa = input.nextLine();

        // pays départ
        System.out.println("Veuillez renseigner le pays de départ:");
        String paysd = input.nextLine();
        
        // Saisie de la date et heure d'arrivée avec vérification
        LocalDateTime dateArrivee = null;
        do {
            System.out.println("Veuillez renseigner la date et heure d'arrivée (format JJ/MM/AAAA HH:mm) :");
            String dateArriveeStr = input.nextLine();
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                dateArrivee = LocalDateTime.parse(dateArriveeStr, formatter);
            } catch (Exception e) {
                System.out.println("Format de date invalide. Veuillez réessayer.");
            }
        } while (dateArrivee == null);

        // Saisie de la date et heure de départ avec vérification
        LocalDateTime dateDepart = null;
        do {
            System.out.println("Veuillez renseigner la date et heure départ (format JJ/MM/AAAA HH:mm) :");
            String dateDepartStr = input.nextLine();
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                dateDepart = LocalDateTime.parse(dateDepartStr, formatter);
            } catch (Exception e) {
                System.out.println("Format de date invalide. Veuillez réessayer.");
            }
        } while (dateDepart == null);

        Aeroport_Arrivee a = new Aeroport_Arrivee(
            codeIATAa, nomAeroporta, villea, paysa, dateArrivee
        );

        Aeroport_depart d = new Aeroport_depart(
            codeIATAd, nomAeroportd, villed, paysd, dateDepart
        );
        
        a.display_Arrivee();
        d.display_depart();
        
        input.close();
   }

Information Billet

Billet.Menu();


Information du vol 
   Vol v1 = new Vol("AF123", 23);

   System.out.println("Renseignez la comagnie dans laquelle vous voulez voyagez");
   v1.setCompagnie(input.nextLine());
        v1.display_vol();



















    }

}

