package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GestionReservations {
    private List<Vol> volsDisponibles;
    private List<Billet> billets;
    private List<Passager> passagers;

    public GestionReservations() {
        this.volsDisponibles = new ArrayList<>();
        this.billets = new ArrayList<>();
        this.passagers = new ArrayList<>();
    }

    // Méthodes pour les vols
    public void ajouterVol(Vol vol) {
        volsDisponibles.add(vol);
    }

    public List<Vol> rechercherVols(String depart, String arrivee, LocalDateTime date) {
        List<Vol> resultats = new ArrayList<>();
        for (Vol vol : volsDisponibles) {
            if (vol.getAeroportDepart().getCodeIATA().equalsIgnoreCase(depart) &&
                vol.getAeroportArrivee().getCodeIATA().equalsIgnoreCase(arrivee) &&
                vol.getDateDepart().toLocalDate().equals(date.toLocalDate())) {
                resultats.add(vol);
            }
        }
        return resultats;
    }

    // Méthodes pour les passagers
    public void enregistrerPassager(Passager passager) {
        passagers.add(passager);
    }

    // Méthodes pour les réservations
    public Billet reserverVol(Vol vol, Passager passager, String categorie) {
        if (vol.getPlacesDisponibles() > 0) {
            // Générer un ID de billet unique
            String idBillet = "BLT" + System.currentTimeMillis();
            
            // Déterminer le prix selon la catégorie
            double prix = calculerPrix(vol, categorie);
            
            // Générer un siège aléatoire (simplifié)
            String siege = genererSiege(vol);
            
            Billet billet = new Billet(idBillet, prix, siege, categorie, vol, passager);
            
            if (vol.reserverPlace()) {
                billets.add(billet);
                return billet;
            }
        }
        return null;
    }

    private double calculerPrix(Vol vol, String categorie) {
        double basePrice = 150.0; // Prix de base
        switch (categorie.toUpperCase()) {
            case "PREMIERE": return basePrice * 3;
            case "AFFAIRE": return basePrice * 2;
            default: return basePrice;
        }
    }

    private String genererSiege(Vol vol) {
        int rangee = (int) (Math.random() * 30) + 1;
        char siege = (char) ((int) (Math.random() * 6) + 'A');
        return rangee + "" + siege;
    }

    // Méthodes pour consulter les réservations
    public List<Billet> getReservationsParPassager(int idPassager) {
        List<Billet> resultats = new ArrayList<>();
        for (Billet billet : billets) {
            if (billet.getPassager().getIdPassager() == idPassager) {
                resultats.add(billet);
            }
        }
        return resultats;
    }

    public List<Vol> getVolsDisponibles() {
        return new ArrayList<>(volsDisponibles);
    }
}