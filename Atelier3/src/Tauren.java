public class Tauren extends Personnage {

    private int taille;

    Tauren(String nom, int age, int taille) {
        super(nom, age);
        this.taille = taille;
    }

    public int positionSouhaitee() {
        return (int) (position + (Math.random() * (taille - 1) + 1));
    }

    public String toString() {
        return "Tauren " + super.toString();
    }
}
