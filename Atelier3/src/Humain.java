public class Humain extends Personnage {

    private int nbDeplacements = 0;
    private int niveau = 1;

    Humain(String nom, int age) {
        super(nom, age);
    }

    public void deplacer(int destination, int gain) {
        nbDeplacements++;
        if (nbDeplacements >= 6) {
            niveau = 3;
        } else if (nbDeplacements >= 4) {
            niveau = 2;
        }
        position = destination;
        proprietaire.modifierPoints(gain);
    }

    public int positionSouhaitee() {
        return position + niveau * nbDeplacements;
    }

    public String toString() {
        return "Humain " + super.toString();
    }


}
