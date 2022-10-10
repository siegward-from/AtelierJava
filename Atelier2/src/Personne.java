import java.util.GregorianCalendar;
import java.util.Calendar;

public class Personne {
    private String nom;
    private String prenom;
    private Adresse adresse = ADRESSE_INCONNUE;
    private final GregorianCalendar dateNaissance;
    private static int personneNumber = 0;
    private static final Adresse ADRESSE_INCONNUE = null;

    /**
     * Constructeur de Personne
     *
     * @param leNom    le nom de la personne
     * @param lePrenom le prénom de la personne
     * @param laDate   la date de naissance de la personne
     * @param lAdresse l'adresse de la personne
     */
    public Personne(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse) {
        nom = leNom.toUpperCase();
        prenom = lePrenom;
        dateNaissance = laDate;
        adresse = lAdresse;
        personneNumber++;
    }

    /**
     * Constructeur de Personne
     *
     * @param leNom       le nom de la personne
     * @param lePrenom    le prénom de la personne
     * @param j           le jour de naissance
     * @param m           le mois de naissance
     * @param a           l'année de naissance
     * @param numero      le n° de la rue
     * @param rue         la rue
     * @param code_postal le code postal de l'adresse
     * @param ville       la ville ou la personne habite
     */
    public Personne(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville) {
        this(leNom, lePrenom, new GregorianCalendar(a, m, j), new Adresse(numero, rue, code_postal, ville));
    }

    /**
     * Accesseur
     *
     * @return retourne le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return personneNumber
     */
    public static int getPersonneNumber() {
        return personneNumber;
    }

    /**
     * Accesseur
     *
     * @return retourne le prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Accesseur
     *
     * @return retourne la date de naissance
     */
    public GregorianCalendar getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Accesseur
     *
     * @return retourne l'adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param a l'adresse
     */
    public void setAdresse(Adresse a) {
        adresse = a;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        String result = "\nNom : " + nom + "\n"
                + "PrŽnom : " + prenom + "\n" +
                "NŽ(e) le : " + dateNaissance.get(Calendar.DAY_OF_MONTH) +
                "-" + dateNaissance.get(Calendar.MONTH) +
                "-" + dateNaissance.get(Calendar.YEAR) + "\n" +
                "Adresse : " +
                adresse.toString();
        return result;
    }

    public boolean plusAgee(Personne personne1, Personne personne2) {
        return personne1.getDateNaissance().compareTo(personne2.getDateNaissance()) == -1;
    }

    public boolean plusAgee(Personne personne) {
        return this.getDateNaissance().compareTo(personne.getDateNaissance()) == -1;
    }

    public boolean equals(Personne personne) {
        return  this.getNom().equals(personne.getNom()) &&
                this.getPrenom().equals(personne.getPrenom()) &&
                this.getDateNaissance().equals(personne.getDateNaissance());
    }
}
