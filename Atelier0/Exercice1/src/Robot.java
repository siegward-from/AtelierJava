public class Robot {

    private final String link;
    private String name;
    private int orientation;
    private int x;
    private int y;
    private static int RobotsNumber = 0;


    public Robot(String name, int orientation, int x, int y) {
        this.link = "ROB" + ++RobotsNumber;
        this.name = name;
        this.orientation = orientation;
        this.x = x;
        this.y = y;
    }

    public Robot(String name) {
        this(name, 1, 0, 0);
    }

    public void modifierOrientation(int orientation) {
        this.orientation = orientation;
    }

    public void push() {
        switch (orientation) {
            case 1:
                this.y++;
                break;
            case 2:
                this.x++;
                break;
            case 3:
                if (y >= 1) {
                    this.y--;
                }
                break;
            case 4:
                if (x >= 1) {
                    this.x--;
                }
                break;
        }
    }

    public String toString() {
        return String.format("name: %s, link: %s, orientation: %d, x: %d, y: %d", name, link, orientation, x, y);
    }

}
