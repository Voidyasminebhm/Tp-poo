import java.time.LocalTime;

public class Creneau {
    private LocalTime heureInitial;
    private LocalTime heureFinale;
    private Tache tacheJ;
    private long dureeminimal;
    private boolean libre;
    private long dureeRestante ;
    private boolean prochainCreneau ;

    public Creneau(LocalTime heureInitial, LocalTime heureFinale, long dureeminimal) {
        this.heureInitial = heureInitial;
        this.heureFinale = heureFinale;
        this.libre = true;
        this.dureeminimal = dureeminimal;
        this.dureeRestante = getDureeMinutes();
    }

    public LocalTime getHeureInitial() {
        return heureInitial;
    }

    public void setHeureInitial(LocalTime heureInitial) {
        this.heureInitial = heureInitial;
    }

    public LocalTime getHeureFinale() {
        return heureFinale;
    }

    public void setdureeminimal(int dureeminimal) {
        this.dureeminimal = dureeminimal;
    }

    public long getdureeminimal() {
        return dureeminimal;
    }

    public void setHeureFinale(LocalTime heureFinale) {
        this.heureFinale = heureFinale;
    }

    public void setTacheJ(Tache tacheJ) {
        this.tacheJ = tacheJ;
    }

    public Tache getTacheJ() {
        return tacheJ;
    }

    public long getDureeMinutes() {
        return java.time.Duration.between(heureInitial, heureFinale).toMinutes();
    }

    public boolean CreneauLibre() {
        return this.libre;
    }

    public void setOccupe() {
        this.libre = false;
    }

    public void setProchainCreneau(boolean prochainCreneau) {
        this.prochainCreneau = prochainCreneau;
    }

    public long getDureeRestante() {
        return dureeRestante;
    }
    
   public boolean getProchainCreneau(){
    return prochainCreneau ;
   }

    //Ajout Tache lorsque la duréé min respecté + libre +durée tache acceptable
    public void AjouterTache(Tache tacheAjoute, Creneau creneau) {
            
       
        if ( (creneau.libre) && (tacheAjoute.getDuree() <= creneau.getDureeMinutes())
                && (creneau.dureeminimal <= creneau.getDureeMinutes() - tacheAjoute.getDuree())) {

            dureeRestante = creneau.getDureeMinutes() - tacheAjoute.getDuree();  
            
            creneau.setTacheJ(tacheAjoute);
            creneau.setOccupe();
            creneau.setHeureFinale(creneau.heureInitial.plusMinutes(tacheAjoute.getDuree()));

            
                    
            if (dureeRestante > 0) {
                setProchainCreneau(true);
            }
            System.out.println("prochainCreneau: " + prochainCreneau + ", dureeRestante: " + dureeRestante);
        } else {
            System.out.println("Impossible d'ajouter une Tache");
        }
        
    }

    public void afficherInfo() throws Exception {
        System.out.println("Creneau: " + heureInitial + " - " + heureFinale);
        System.out.println("Durée minimale: " + dureeminimal);
        System.out.println("Tâche: " );
        if (tacheJ == null){
            System.out.println(("Aucune Tache disponile"));

        }
        else
        tacheJ.afficher();
    }
}
