public final class DePipe extends De {

    private int borneMinimale = 0;

    public DePipe(String nom, int nbFaces, int borneMinimale) {
        super(nom, nbFaces);
        if (borneMinimale < nbFaces) {
            this.borneMinimale = borneMinimale;
        }
    }

    public DePipe(String nom, int nbFaces) {
        super(nom, nbFaces);
    }

    public DePipe(String nom) {
        super(nom);
    }

    @Override
    public int lancer() {
        return r.nextInt(borneMinimale, nbFaces + 1);
    }

}
