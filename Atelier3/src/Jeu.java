import java.util.ArrayList;

public class Jeu {
    private String titre;
    private int nbEtapes;
    private int nbObstacles;
    private int scoreMax;
    private ArrayList<Joueur> listeJouers;
    private Case[] cases = new Case[50];
    private final static int NB_CASES = 50;
    private final static int NB_JOUER_MAX = 6;

    Jeu(String titre, int nbEtapes, int nbObstacles) {
        this.titre = titre;
        this.nbEtapes = nbEtapes;
        this.nbObstacles = nbObstacles;
    }

    public void ajouteJouer(Joueur joueur) {
        listeJouers.add(joueur);
    }

    public ArrayList<Personnage> tousLesPerso() {
        ArrayList<Personnage> result = new ArrayList<Personnage>();
        for (Joueur jouer: listeJouers) {
            for(Personnage perso: jouer.getListePersos()) {
                result.add(perso);
            }
        }
        return result;
    }

    public void initialiserCases() {
        for (int i = 0; i < 50; i++) {
            int randomNumber = (int) Math.random() * 50;
            if (randomNumber % 5 == 0) {
                cases[i] = new Case(new Obstacle(randomNumber * 2), randomNumber);
            }
            cases[i] = new Case(randomNumber);
        }
    }

    public void lancerJeu() {

    }


}
