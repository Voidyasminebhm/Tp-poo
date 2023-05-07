

public class User {
    private String pseudo, mdp;
    //Creneau lire
    private Projet tabProjet[];
    //Historique
    private Calendrier calendrierActuel;

    private Tache tabTaches[];
    private Tache tachesNonPlannifiees[];

    public void connexion(String pseudo, String mdp) {
        if (this.pseudo.equals(pseudo) && this.mdp.equals(mdp)) {
            System.out.println("Connexion réussie !");
            // Display user's projects, tasks, and other information
        } else {
            System.out.println("Pseudo ou mot de passe incorrect !");
        }
    }
    

    public void deconnexion() {
        this.pseudo = null;
        this.mdp = null;
        System.out.println("Déconnexion réussie !");
    }
    

    public void plannifier() {

    }

    public void replannifier() {

    }

    public void fixerPeriode() {

    }

    public void valider() {

    }

    public void supprimerProjet() {

    }

    public void supprimerTache() {

    }

    public Projet[] getTabProjet() {
        return this.tabProjet;
    }

    public void setTabProjet(Projet[] tabProjet) {
        this.tabProjet = tabProjet;
    }

    public Calendrier getCalendrierActuel() {
        return this.calendrierActuel;
    }

    public void setCalendrierActuel(Calendrier calendrierActuel) {
        this.calendrierActuel = calendrierActuel;
    }

    public Tache[] getTabTaches() {
        return this.tabTaches;
    }

    public void setTabTaches(Tache[] tabTaches) {
        this.tabTaches = tabTaches;
    }

    public Tache[] getTachesNonPlannifiees() {
        return this.tachesNonPlannifiees;
    }

    public void setTachesNonPlannifiees(Tache[] tachesNonPlannifiees) {
        this.tachesNonPlannifiees = tachesNonPlannifiees;
    }
}
