public class Test {

    public static void main(String[] args) {

        Vecteur3D vecteur1 = new Vecteur3D(3, 2, 5);
        Vecteur3D vecteur2 = new Vecteur3D(1, 2, 3);

        System.out.println("v1 = " + vecteur1);
        System.out.printf("Norme de v1 = %.2f \n", vecteur1.norme());
        System.out.println("v2 = " + vecteur2);
        System.out.printf("Norme de v2 = %.2f \n", vecteur2.norme());
        System.out.println("v1 + v2 = " + vecteur1.somme(vecteur2));
        System.out.println("v1.v2 = " + vecteur1.produitScalaire(vecteur2));

    }
}