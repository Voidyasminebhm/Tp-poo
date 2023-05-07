public class Projet {
    private Tache[] taches;
    private int nbTaches;
    private Etat etat;

    public Projet() {
        this.taches = new Tache[100];
        this.nbTaches = 0;
        this.etat = Etat.notRealized;
    }

    public void ajouterTache(Tache tache) {
        this.taches[this.nbTaches] = tache;
        this.nbTaches++;
    }

    public void supprimerTache(int index) {
        for (int i = index; i < this.nbTaches - 1; i++) {
            this.taches[i] = this.taches[i + 1];
        }
        this.taches[this.nbTaches - 1] = null;
        this.nbTaches--;
    }

    public void afficherProjet() {
        System.out.println("Projet :");
        for (int i = 0; i < this.nbTaches; i++) {
            System.out.println(this.taches[i].toString());
        }
    }
}
