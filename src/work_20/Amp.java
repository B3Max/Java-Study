package work_20;

public class Amp implements Priceable {
    String price = "200";

    @Override
    public String getPrice() {
        return price;
    }
}
