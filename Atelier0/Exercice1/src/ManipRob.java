public class ManipRob {

    public static void main(String[] args) {
        Robot rob1 = new Robot("Toto", 3, 10, 20);
        Robot rob2 = new Robot("Titi");
        System.out.println(rob1);
        System.out.println(rob2 + "\n");

        rob1.push();
        rob2.push();
        System.out.println(rob1);
        System.out.println(rob2 + "\n");

        rob1.modifierOrientation(1);
        rob2.modifierOrientation(3);
        System.out.println(rob1);
        System.out.println(rob2 + "\n");

        rob1.push();
        rob2.push();
        System.out.println(rob1);
        System.out.println(rob2);
    }

}