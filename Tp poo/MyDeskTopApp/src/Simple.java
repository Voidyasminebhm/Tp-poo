public class Simple extends Tache {
    private int nbPeriode;
    private String description;

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
}
