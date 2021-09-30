package work_20;

//import java.text.NumberFormat;
//import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        //Locale usa = new Locale("en", "US");
        //NumberFormat fmt1 = NumberFormat.getCurrencyInstance(usa);

        Amp a = new Amp();
        Strap s = new Strap();
        Guitar g = new Guitar();
        RockAndRoll r = new RockAndRoll();
        // Работает только с числами
        /*
        System.out.println("Your first amp: " + fmt1.format(a.getPrice()));
        System.out.println("Your first strap: " + fmt1.format(s.getPrice()));
        System.out.println("Your first guitar: " + fmt1.format(g.getPrice()));
        System.out.println("Rock & Roll: " + fmt1.format(r.getPrice()));
        */
        System.out.println("Your first amp: $" + a.getPrice());
        System.out.println("Your first strap: $" + s.getPrice());
        System.out.println("Your first guitar: $" + g.getPrice());
        System.out.println("Rock & Roll: " + r.getPrice());
        System.out.println("There are some things money can't buy, for everything else there's Mastercard");
    }
}
