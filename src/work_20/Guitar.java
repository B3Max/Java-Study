package work_20;

public class Guitar implements Priceable {
    String price = "450";

    @Override
    public String getPrice() {
        return price;
    }
}
