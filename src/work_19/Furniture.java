package work_19;

public abstract class Furniture {
    protected int numberOfLegs;
    protected String material;

    public Furniture() {}

    public abstract void setMaterial(String material);
    public abstract void setNumberOfLegs(int numberOfLegs);
    public abstract int getNumberOfLegs();
    public abstract String getMaterial();

    @Override
    public String toString() {
        return "Furniture{" +
                "numberOfLegs=" + numberOfLegs +
                ", material='" + material + '\'' +
                '}';
    }
}
