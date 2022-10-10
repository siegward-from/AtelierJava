public final class DeMemoire extends De {

    private int valeur = -1;

    public DeMemoire(String nom, int nbFaces) {
        super(nom, nbFaces);
    }

    public DeMemoire(String nom) {
        super(nom);
    }

    public DeMemoire() {
        super();
    }

    @Override
    public int lancer() {
        int result = super.lancer();
        while (result == valeur) {
            result = super.lancer();
        }
        valeur = result;
        return result;
    }

    public int getValeur() {
        return valeur;
    }
}
