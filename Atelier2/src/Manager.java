import java.util.GregorianCalendar;

public class Manager extends Employe {

    private Secretaire secretaire;

    private Manager(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse,
                    int salaire, GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse, salaire, dateEmbauche);
        this.augmenterLeSalaire(5 * this.calculAnnuite());
    }

    public static Manager createManager(String leNom, String lePrenom, GregorianCalendar laDate,
                                        Adresse lAdresse, int salaire, GregorianCalendar dateEmbauche) {
        int year = java.time.YearMonth.now().getYear();
        if (year - laDate.getWeekYear() > 16 && year - laDate.getWeekYear() < 65) {
            return new Manager(leNom, lePrenom, laDate, lAdresse, salaire, dateEmbauche);
        } else {
            return null;
        }
    }

    public void setSecretaire(Secretaire secretaire) {
        if (secretaire.getManagers().contains(this)) {
            this.secretaire = secretaire;
        } else {
            this.secretaire = secretaire;
            this.secretaire.addManager(this);
        }
    }

    public void deleteSecretaire() {
        if (secretaire.getManagers().contains(this)) {
            secretaire.deleteManager(this);
        } else {
            secretaire = null;
        }
    }

    public Secretaire getSecretaire() {
        return secretaire;
    }
}
