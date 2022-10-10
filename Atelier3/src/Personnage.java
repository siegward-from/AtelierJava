public abstract class Personnage {

    protected String nom;
    protected int age;
    protected int position = 0;
    protected Joueur proprietaire;

    Personnage(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void deplacer(int destination, int gain) {
        position = destination;
        proprietaire.modifierPoints(gain);
    }

    public void penaliser(int penalite) {
        proprietaire.modifierPoints(-penalite);
    }

    public String toString() {
        return nom;
    }

    public abstract int positionSouhaitee();
}
