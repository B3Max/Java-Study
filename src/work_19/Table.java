package work_19;

public class Table extends Furniture {
    private int maxWeight;

    Table(int leg, String mat, int max) {
        this.maxWeight = max;
        this.numberOfLegs = leg;
        this.material = mat;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public boolean canItHoldUp(int mass) {
        if (mass <= maxWeight)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numberOfLegs=" + numberOfLegs +
                ", material='" + material + '\'' +
                ", maxWeight=" + maxWeight +
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

