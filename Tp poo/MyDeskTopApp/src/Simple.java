public class Simple extends Tache {
    private int nbPeriode;
    private String description;


    public Simple(String nom, String dateLimite, int duree, Categorie categorie, Prioritee priorite ,int nbPeriode , String  description){
        super( nom,  dateLimite,  duree,  categorie,  priorite);
        this.nbPeriode=nbPeriode;
        this.description=description;

    }
    public void SetPeriode(int nbPeriode) {
        this.nbPeriode = nbPeriode;
    }

    public void Evaluer() {
        if (nbPeriode > 0) {
            System.out.println("La tache Simple est en cours de réalisation.");
        } else {
            System.out.println("La tache Simple n'a pas encore commencé.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void afficher(){
        super.afficher();
        System.out.println("nbPeriode : "+nbPeriode);   
        System.out.println("description : "+description);
    }
}
