import java.util.*;

public class Billet {
    private int idBillet;
    private int siege;
    private String categorie;

    public static final int prix_economie = 500000;
    public static final int prix_premium = 600000;
    public static final int prix_Affaire = 700000;
    public static final int prix_Classe = 1000000;

    // Constructor should match the field types (int, not String)
    public Billet(int idBillet, int siege) {
        this.idBillet = idBillet;
        this.siege = siege;
    }

    // GETTERS
    public int getIdBillet() {
        return idBillet;
    }

    public int getSiege() {
        return siege;
    }

    // SETTERS 
    public void setSiege(int siege) {
        this.siege = siege;
    }

    public void setIdBillet(int idBillet) {
        this.idBillet = idBillet;
    }

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        
        
            System.out.println("===== Catégories de vol =====");
            System.out.println("1. Classe Économique");
            System.out.println("2. Classe Économique Premium");
            System.out.println("3. Classe Affaires");
            System.out.println("4. Première Classe");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");

            try {
                choix = scanner.nextInt();
            } catch (InputMismatchException e) {  // Changed from ArithmeticException to InputMismatchException
                System.out.println("Veuillez saisir un chiffre SVP");
                scanner.next(); // Clear the invalid input
            }

            switch (choix) {
                case 1:
                    System.out.println("Classe Économique: " + prix_economie);
                    break;
                case 2:
                    System.out.println("Classe Économique Premium: " + prix_premium);
                    break;
                case 3:
                    System.out.println("Classe Affaires: " + prix_Affaire);
                    break;
                case 4:
                    System.out.println("Première Classe: " + prix_Classe);
                    break;
                case 5:
                    System.out.println("Merci et à bientôt !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
                    break;
            }
    }

    public void display_billet() { 
        System.out.println("Billet ID: " + this.getIdBillet());
        System.out.println("Siège: " + this.getSiege());
    }
}