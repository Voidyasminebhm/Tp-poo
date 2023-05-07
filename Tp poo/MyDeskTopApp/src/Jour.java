public class Jour {
    private String date;
    private int minTache;
    private int nbTacheFaite;
    private int nbProgress;
    private Creneau[] creneaux;

    public Jour(String date, int minTache) {
        this.date = date;
        this.minTache = minTache;
        this.nbTacheFaite = 0;
        this.nbProgress = 0;
        this.creneaux = new Creneau[0];
    }

    public void ajouterCreneau(Creneau creneau) {
        // TODO: Implement adding a creneau to the list
    }

    public void ajouterTache(Tache tache) {
        // TODO: Implement adding a tache to the list of taches in the day
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

    public String getDate() {
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

    public void afficher() {
        System.out.println("Date: " + date);
        System.out.println("Minimum de tâches: " + minTache);
        System.out.println("Nombre de tâches faites: " + nbTacheFaite);
        System.out.println("Nombre de tâches en cours: " + nbProgress);
    }
}
