public final class DeFacesInt extends De {

    private int[] faces;

    public DeFacesInt(String nom, int[] faces) {
        deNumber++;
        this.nom = nom;
        this.faces = faces;
        nbFaces = faces.length;
    }

    public void setNbFaces(int[] faces) {
        this.faces = faces;
        nbFaces = faces.length;
    }

    public int[] getFaces() {
        return faces;
    }

    public int lancer() {
        return faces[super.lancer() - 1];
    }
}
