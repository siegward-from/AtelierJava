import java.util.ArrayList;

public class Joueur {

    private String nom;
    private String code;
    private int nbPoints = 0;
    private ArrayList<Personnage> listePersos = new ArrayList<Personnage>();
    private static int nbJoueurs = 0;

    Joueur(String nom) {
        this.nom = nom;
        code = "J" + ++nbJoueurs;
    }

    private void ajouterPersonnage(Personnage personnage) {
        listePersos.add(personnage);
    }

    public void modifierPoints(int nb) {
        if (nbPoints + nb < 0) {
            nbPoints = 0;
        } else {
            nbPoints += nb;
        }
    }

    public boolean peutJouer() {
        return listePersos.size() > 0;
    }

    public String toString() {
        if (listePersos.size() == 0) {
            return String.format("%s %s(%d points) avec aucun personnage", code, nom, nbPoints);
        }
        return String.format("%s %s(%d points) avec %d personnages", code, nom, nbPoints, listePersos.size());
    }

    public ArrayList<Personnage> getListePersos() {
        return listePersos;
    }
}
