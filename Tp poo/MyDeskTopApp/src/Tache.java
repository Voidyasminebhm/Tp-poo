

abstract  class Tache {
    private String nom ;
    private String dateLimite;
    private int duree;
    private int nbPeriode = 1;
    private Categorie categorie;
    private Etat etat = Etat.notRealized;
    private Prioritee priorite = Prioritee.Low;

    public void changerEtat(Etat etat) {
        this.etat = etat;
    }

    public int getDuree(){
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

  

    public void Decomposer() {
        
    }

    public void setTaches() {
        
    }

    public void Evaluer() {
        
    }

    public void SetPeriode(int nbPeriode) {
        
    }

    
}
