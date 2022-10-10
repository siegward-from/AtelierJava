public final class DeFacesString extends De {

    private String[] faces;

    public DeFacesString(String nom, String[] faces) {
        deNumber++;
        this.nom = nom;
        this.faces = faces;
        nbFaces = faces.length;
    }

    public void setFaces(String[] faces) {
        this.faces = faces;
        nbFaces = faces.length;
    }

    public String[] getFaces() {
        return faces;
    }
}
