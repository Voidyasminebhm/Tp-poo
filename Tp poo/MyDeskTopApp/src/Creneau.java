import java.time.LocalTime;

public class Creneau {
    private String HeureInitial;
    private String HeureFinale;
    private Tache tacheJ;

    public Creneau(String HeureInitial, String HeureFinale, Tache tacheJ) {
        this.HeureInitial = HeureInitial;
        this.HeureFinale = HeureFinale;
        this.tacheJ = tacheJ;
    }

    public String getHeureInitial() {
        return HeureInitial;
    }

    public void setHeureInitial(String heureInitial) {
        HeureInitial = heureInitial;
    }

    public String getHeureFinale() {
        return HeureFinale;
    }

    public void setHeureFinale(String heureFinale) {
        HeureFinale = heureFinale;
    }

    public Tache getTacheJ() {
        return tacheJ;
    }

    public void setTacheJ(Tache tacheJ) {
        this.tacheJ = tacheJ;
    }

    public long getDureeMinutes() {
        LocalTime debut = LocalTime.parse(HeureInitial);
        LocalTime fin = LocalTime.parse(HeureFinale);
        return java.time.Duration.between(debut, fin).toMinutes();
    }
/* 
    public boolean chevauche(Creneau autreCreneau) {
        LocalTime debut1 = LocalTime.parse(this.HeureInitial);
        LocalTime fin1 = LocalTime.parse(this.HeureFinale);
        LocalTime debut2 = LocalTime.parse(autreCreneau.getHeureInitial());
        LocalTime fin2 = LocalTime.parse(autreCreneau.getHeureFinale());
        return !debut1.isAfter(fin2) && !debut2.isAfter(fin1);
    } */
}
