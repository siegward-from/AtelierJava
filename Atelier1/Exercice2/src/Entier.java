public class Entier {

    protected int valeur = 0;
    protected int borneMinimale;
    protected int borneMaximale;

    public Entier(int valeur, int borneMinimale, int borneMaximale) {
        this.borneMinimale = borneMinimale;
        this.borneMaximale = borneMaximale;
        if (valeur > borneMinimale && valeur < borneMaximale) {
            this.valeur = valeur;
        }
    }

    public Entier(int borneMinimale, int borneMaximale) {
        this(0, borneMinimale, borneMaximale);
    }

    public void increment() {
        if (valeur > borneMinimale) {
            valeur--;
        }
    }

    public void increment(int n) {
        if ((valeur - n) >= borneMinimale) {
            valeur -= n;
        }
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return String.format("%d (%d, %d)", valeur, borneMaximale, borneMaximale);
    }

    public boolean equals(Entier number) {
        return valeur == number.valeur;
    }
}
