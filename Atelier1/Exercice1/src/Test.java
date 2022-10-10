public class Test {
    public static void main(String[] args) {

        De de1 = new De("De", 3);
        De de2 = new De();
        De de3 = new De("Dee");

        System.out.println(de1);
        System.out.println(de2);
        System.out.println(de3);
        System.out.println(de1.lancer());
        System.out.println(de2.lancer());
        System.out.println(de3.lancer() + "\n");

    }
}


