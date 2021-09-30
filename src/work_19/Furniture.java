package work_19;

public abstract class Furniture {
    protected int numberOfLegs;
    protected String material;

    public Furniture() {
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

    @Override
    public String toString() {
        return "Furniture{" +
                "numberOfLegs=" + numberOfLegs +
                ", material='" + material + '\'' +
                '}';
    }
}
