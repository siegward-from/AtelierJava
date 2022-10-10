import org.jetbrains.annotations.NotNull;

import java.util.GregorianCalendar;
import java.util.ArrayList;

public final class Secretaire extends Employe {

    private ArrayList<Manager> managers = new ArrayList<>();

    public Secretaire(String leNom, String lePrenom, GregorianCalendar laDate,
                      Adresse lAdresse, int salaire, GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse, salaire, dateEmbauche);
    }

    public static Secretaire createSecretaire(String leNom, String lePrenom, GregorianCalendar laDate,
                                              Adresse lAdresse, int salaire, GregorianCalendar dateEmbauche) {
        int year = java.time.YearMonth.now().getYear();
        if (year - laDate.getWeekYear() > 16 && year - laDate.getWeekYear() < 65) {
            return new Secretaire(leNom, lePrenom, laDate, lAdresse, salaire, dateEmbauche);
        } else {
            return null;
        }
    }

    public void addManager(Manager manager) {
        if (managers.size() < 5 && !managers.contains(manager)) {
            managers.add(manager);
            this.augmenterLeSalaire(10);
            if (manager.getSecretaire() == null){
                manager.setSecretaire(this);
            } else {
                if (!manager.getSecretaire().equals(this)) {
                    manager.setSecretaire(this);
                }
            }
        }
    }

    public void deleteManager(Manager manager) {
        if (managers.contains(manager)) {
            managers.remove(manager);
            salaire -= 0.1 * salaire;
        }
        if (manager.getSecretaire().equals(this)) {
            manager.deleteSecretaire();
        }
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }
}
