import java.util.Random;

public class De {

    protected int nbFaces = 6;
    protected String nom;
    protected static int deNumber = 0;
    protected static Random r = new Random();
    public static final int NB_FACES_MIN = 3;
    public static final int NB_FACES_MAX = 120;
    public static final int NB_FACES_DEFAUT = 6;
    public static final String NOM_DEFAUT = "De";

    public De(String nom, int nbFaces) {
        deNumber++;
        this.nom = nom;
        if (nbFaces >= NB_FACES_MIN && nbFaces <= NB_FACES_MAX) {
            this.nbFaces = nbFaces;
        } else {
            System.err.println("Le nombre de faces doit être entre 3 et 120");
        }
    }

    public De(String nom) {
        this(nom, NB_FACES_DEFAUT);
    }

    public De() {
        this(NOM_DEFAUT, NB_FACES_DEFAUT);
        nom += deNumber;
    }

    protected void setNbFaces(int nbFaces) {
        if (nbFaces >= NB_FACES_MIN && nbFaces <= NB_FACES_MAX) {
            this.nbFaces = nbFaces;
        } else {
            System.err.println("Le nombre de faces doit être entre 3 et 120");
        }
    }

    public int lancer() {
        return r.nextInt(nbFaces) + 1;
    }

    public int lancer(int nbFois) {
        int result = 0;
        int tryNumber;
        for (int i = 0; i < nbFois; i++) {
            tryNumber = this.lancer();
            if (tryNumber == nbFaces) {
                return tryNumber;
            } else if (tryNumber > result) {
                result = tryNumber;
            }
        }
        return result;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public String getNom() {
        return nom;
    }

    public static int getDeNumber() {
        return deNumber;
    }

    @Override
    public String toString() {
        return nom + " (" + nbFaces + " faces)";
    }
}
