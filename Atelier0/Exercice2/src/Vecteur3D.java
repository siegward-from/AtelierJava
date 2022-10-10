public class Vecteur3D {

    private float x;
    private float y;
    private float z;

    public Vecteur3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vecteur3D() {
        this(0, 0, 0);
    }

    public String toString() {
        return "<" + x + ", " + y + ", " + z + ">";
    }

    public double norme() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public float produitScalaire(Vecteur3D vecteur) {
        return x * vecteur.x + y * vecteur.y + z * vecteur.z;
    }

    static public float produitScalaire(Vecteur3D vecteur1, Vecteur3D vecteur2) {
        return vecteur1.x * vecteur2.x + vecteur1.y * vecteur2.y + vecteur1.z * vecteur2.z;
    }

    public Vecteur3D somme(Vecteur3D vecteur) {
        return new Vecteur3D(x + vecteur.x, y + vecteur.y, z + vecteur.z);
    }

    static public Vecteur3D somme(Vecteur3D vecteur1, Vecteur3D vecteur2) {
        return new Vecteur3D(vecteur1.x + vecteur2.x, vecteur1.y + vecteur2.y, vecteur1.z + vecteur2.z);
    }

}
