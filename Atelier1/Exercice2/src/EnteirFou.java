import java.util.Random;

public class EnteirFou extends Entier {

    private int niveauDeFolie;
    static private Random randomNumber = new Random();

    public EnteirFou(int valeur, int borneMinimale, int borneMaximale, int niveauDeFolie) {
        super(valeur, borneMinimale, borneMaximale);
        this.niveauDeFolie = niveauDeFolie;
    }

    @Override
    public void increment() {
        valeur += randomNumber.nextInt(niveauDeFolie);
    }

    @Override
    public void increment(int n) {
        valeur += randomNumber.nextInt(niveauDeFolie) + n;
    }

}
