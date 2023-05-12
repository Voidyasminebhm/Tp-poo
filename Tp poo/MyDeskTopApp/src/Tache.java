abstract class Tache {

    private String nom;
    private String dateLimite;
    private long duree;
    private int nbPeriode = 1;
    private Categorie categorie;
    private Etat etat = Etat.notRealized;
    private Prioritee priorite = Prioritee.Low;

    public Tache(){

    }
    public Tache(String nom, String dateLimite, int duree, Categorie categorie, Prioritee priorite) {
        this.nom = nom;
        this.dateLimite = dateLimite;
        this.duree = duree;
        this.categorie = categorie;
        this.priorite = priorite;
    }

    public void changerEtat(Etat etat) {
        this.etat = etat;
    }

    public long getDuree() {
        return this.duree;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Date limite: " + dateLimite);
        System.out.println("Durée: " + duree);
        System.out.println("Catégorie: " + categorie.getNom());
        System.out.println("État: " + etat);
        System.out.println("Priorité: " + priorite);
    }

    public void decomposer() {

    }

    public void setTaches() {

    }

    public void evaluer() {

    }

    public void setPeriode(int nbPeriode) {
        this.nbPeriode = nbPeriode;
    }
}
