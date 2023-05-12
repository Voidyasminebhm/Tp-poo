public class Categorie {
    private String nom;
    private String couleur;

    public Categorie (String nom , String color){
        this.nom = nom ;
        this.couleur=color;
    }

    public String getNom () {
        return this.nom;
    }

    public String getCouleur () {
        return this.couleur;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public void setCouleur (String couleur) {
        this.couleur = couleur;
    }
}