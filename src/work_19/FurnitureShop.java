package work_19;

public class FurnitureShop {

    public FurnitureShop() {}

    public Furniture buy(int x) {
        switch (x) {
            case (1):
                Chair c = new Chair(3, "Metal", false);
                return c;
            case (2):
                Table t = new Table(1, "Lead", 999);
                return t;
            case (3):
                Locker l = new Locker(4, "Iron", 2, 150);
                return l;
            default:
                System.out.println("All the best, come back again");
                return null;
        }
    }
}