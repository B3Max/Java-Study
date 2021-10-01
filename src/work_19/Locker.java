package work_19;

public class Locker extends Furniture {
    private int numberOfShelves;
    private int height;

    Locker (int leg, String mat, int num, int hei) {
        this.numberOfShelves = num;
        this.numberOfLegs = leg;
        this.material = mat;
        this.height = hei;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public boolean canItFit(int books) {
        if(books <= height / numberOfShelves)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Locker{" +
                "numberOfLegs=" + numberOfLegs +
                ", material='" + material + '\'' +
                ", numberOfShelves=" + numberOfShelves +
                ", height=" + height +
                '}';
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public String getMaterial() {
        return this.material;
    }
}
