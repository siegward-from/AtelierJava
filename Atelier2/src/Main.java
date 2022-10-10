import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        GregorianCalendar date = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        GregorianCalendar dateEmbc = new GregorianCalendar(2020, Calendar.JANUARY, 1);
        Adresse adresse = new Adresse(1, "1", "11111", "1");
        Employe employe = new Employe("Employe", "1", date, adresse, 1000, date);
        Secretaire secretaire = Secretaire.createSecretaire("Secretaire", "1", date, adresse, 1000, dateEmbc);
        Manager manager = Manager.createManager("Manager", "1", date, adresse, 1000, dateEmbc);

        System.out.println(employe);
        System.out.println("Avant l'augmentation de salaire: " + employe.getSalaire());
        employe.augmenterLeSalaire(10);
        System.out.println("Apres l'augmentation de salaire: " + employe.getSalaire());

        System.out.println(secretaire);
        System.out.println(secretaire.getSalaire());
        System.out.println(manager);
        System.out.println(manager.getSalaire());

        secretaire.addManager(manager);
        for (Manager manager_: secretaire.getManagers()) {
            System.out.println(manager_);
        }
        System.out.println(manager.getSecretaire());
        System.out.println(manager.getSecretaire().getSalaire());

        secretaire.deleteManager(manager);
        for (Manager manager1: secretaire.getManagers()) {
            System.out.println(manager1);
            System.out.println(manager1.getSalaire());
        }
        System.out.println();
        System.out.println(manager.getSecretaire());

    }
}
