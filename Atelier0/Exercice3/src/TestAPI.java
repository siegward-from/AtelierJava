public class TestAPI {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.random());
        System.out.println(Math.round(Math.random() * 2 + 1));
        int x1 = 1;
        int x2 = 2;
        System.out.println(Math.max(x1, x2));
        String n1 = "Hello";
        String n2 = "salut";
        if (n2.compareTo(n1) > 0) {
            System.out.println(n1 + "\n" + n2);
        } else {
            System.out.println(n2 + "\n" + n1);
        }
    }
}

