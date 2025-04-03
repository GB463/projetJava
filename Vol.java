
public class Vol {
    private  String idVol;
    private  String compagnie;
    private int placesDisponibles;
    private  Aeroport_depart depart;
    private Aeroport_Arrivee arrivee;

    // Constructor
    public Vol(String idVol, int placesDisponibles) {
        this.idVol = idVol;
        this.placesDisponibles = placesDisponibles;
       
    }

    // Getters
    public String getIdVol() { return idVol; }
    public String getCompagnie() { return compagnie; }
    public int getPlacesDisponibles() { return placesDisponibles; }
    public Aeroport_depart getDepart() { return depart; }
    public Aeroport_Arrivee getArrivee() { return arrivee; }

    //setters
    public void setIdVol(String idVol){this.idVol=idVol;}
    public void setCompagnie(String compagnie) { this.compagnie=compagnie; }
    public void setPlacesDisponibles(int placesDisponibles) { this.placesDisponibles=placesDisponibles; }
    public void setDepart(Aeroport_depart depart) { this.depart=depart; }
    public void setArrivee(Aeroport_Arrivee arrivee) { this.arrivee=arrivee; }


    public void display_vol(){
        System.out.println("Nom du vol"+getCompagnie());
        System.out.println("number du vol"+getIdVol());
        System.out.println("Nombre de pace disponible"+getPlacesDisponibles());




    }




}















