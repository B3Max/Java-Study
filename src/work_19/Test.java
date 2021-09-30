package work_19;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Furniture f = new Chair(4, "Wood", true);
        System.out.println(f.getMaterial());
        f.setMaterial("Plastic");
        Chair c = (Chair) f;
        System.out.println(c.getSpin());
        System.out.println(c.spin());
        System.out.println(c.getMaterial());
        c.setNumberOfLegs(5);
        System.out.println(c.getNumberOfLegs());
        c.setSpin(false);
        System.out.println(c.spin());

        FurnitureShop shop = new FurnitureShop();
        Table t = (Table) (shop.buy(2));
        //Table t = new Table(4,"Wood",50);
        System.out.println(t.canItHoldUp(65));
        t.setMaxWeight(100);
        System.out.println(t.canItHoldUp(65));
        System.out.println(t.getMaxWeight());
        System.out.println(t);

        Locker l = (Locker) (shop.buy(3));
        //Locker l = new Locker(1,"Wood",4, 210);
        System.out.println(l.canItFit(65));
        System.out.println(l.getHeight());
        System.out.println(l.getNumberOfShelves());
        l.setHeight(200);
        l.setNumberOfShelves(3);
        System.out.println(l.canItFit(65));
        System.out.println(l);
    }
}
