import java.util.GregorianCalendar;

public class Employe extends Personne {

    protected GregorianCalendar dateEmbauche;
    protected int salaire;

    protected Employe(String leNom, String lePrenom, GregorianCalendar laDate,
                      Adresse lAdresse, int salaire, GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse);
        this.salaire = salaire;
        this.dateEmbauche = dateEmbauche;
    }

    public static Employe createEmploye(String leNom, String lePrenom, GregorianCalendar laDate,
                                        Adresse lAdresse, int salaire, GregorianCalendar dateEmbauche) {
        int year = java.time.YearMonth.now().getYear();
        if (year - laDate.getWeekYear() > 16 && year - laDate.getWeekYear() < 65) {
            return new Employe(leNom, lePrenom, laDate, lAdresse, salaire, dateEmbauche);
        } else {
            return null;
        }
    }

    public void augmenterLeSalaire(int pourcent) {
        if (pourcent > 0) {
            salaire += (salaire * pourcent) / 100;
        }
    }

    public int getSalaire() {
        return salaire;
    }

    public int calculAnnuite() {
        return java.time.YearMonth.now().getYear() - dateEmbauche.getWeekYear();
    }

}
