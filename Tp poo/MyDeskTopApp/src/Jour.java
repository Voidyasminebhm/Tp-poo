import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class Jour {
    private LocalDate date;
    private int minTache;
    private int nbTacheFaite;
    private int nbProgress;

    // Use ArrayList instead of an array
    private ArrayList<Creneau> listeCreneaux = new ArrayList<>();

    public ArrayList<Creneau> getListeCreneaux() {
        return listeCreneaux;
    }

    public Jour(LocalDate date, int minTache) {
        this.date = date;
        this.minTache = minTache;
        this.nbTacheFaite = 0;
        this.nbProgress = 0;
    }

    public void AjouterCreneau(LocalTime debut, LocalTime fin, int nbTacheMax) {
        Creneau creneau = new Creneau(debut, fin, nbTacheMax);
        listeCreneaux.add(creneau);
    }

    public void AjouterTache(Tache tache) {
        int i = 0;
         boolean ajout = false;
    

        while (i < listeCreneaux.size() && !ajout) {
            Creneau creneau = listeCreneaux.get(i);

            if (creneau.CreneauLibre()) {
                creneau.AjouterTache(tache, creneau);
                ajout = true;
                
                

                if ( creneau.getProchainCreneau() && creneau.getDureeRestante() != 0) {
                    Creneau nouveauCreneau = createCreneau(creneau.getHeureFinale(), creneau.getHeureFinale().plusMinutes( creneau.getDureeRestante()), 0);
                    listeCreneaux.add(i+1, nouveauCreneau);
                }
            } else {
                i++;
            }
        }
        if (ajout) {
            System.out.println("Tache ajoutee !!");
        } else {
            System.out.println("Impossible d'ajouter la tache !");
        }
    }

    public void setMessageJ() {
        // TODO: Implement setting the message for the day based on the number of completed tasks
    }

    public void setNbProgress(int nbProgress) {
        this.nbProgress = nbProgress;
    }

    public void setNbTacheFaite(int nbTacheFaite) {
        this.nbTacheFaite = nbTacheFaite;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public int getMinTache() {
        return this.minTache;
    }

    public int getNbTacheFaite() {
        return this.nbTacheFaite;
    }

    public int getNbProgress() {
        return this.nbProgress;
    }

    public void afficherInfo() throws Exception {
        System.out.println("Date: " + date);
        System.out.println("Minimum de taches:" + minTache);
        System.out.println("Nombre de taches faites: " + nbTacheFaite);
        System.out.println("Nombre de taches en cours: " + nbProgress);
        System.out.println("___________________");
        System.out.println("Liste des creneaux:");
        System.out.println("");
        for (Creneau creneau : listeCreneaux) {
        creneau.afficherInfo();
        System.out.println("----------");
        }
        }

        private Creneau createCreneau(LocalTime debut, LocalTime fin, int dureeminimal) {
            return new Creneau(debut, fin, dureeminimal);

        }
        
        
    }
