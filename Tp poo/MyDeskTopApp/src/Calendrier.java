public class Calendrier {
    //private Jour[] jours;
    private int nbFait;
    private int nbGood;
    private int nbVeryGood;

    public void verification() {}
    public void ajouterCreneau () {}
    public void ajouterTache () {}

    public void MessageC () {
        if ( nbFait == 5 );
        if ( nbGood == 5 );
        if ( nbVeryGood == 5 );
    }

    public int getnbFait() {
        return this.nbFait;
    }

    public int getnbGood () {
        return this.nbGood;
    }

    public int getnbVeryGood () {
        return this.nbVeryGood;
    }

    
    public void setnbGood (int nb) {
        this.nbGood= nb;
    }

    public void setnbVeryGood (int nb) {
        this.nbVeryGood= nb;
    }

    public void setnbFait (int nb) {
        this.nbFait= nb;
    }
}
