package work_11_12._2;

public class TestAddress {

    public static void main(String[] args) {
        Address address1 = Address.commaSeparator("Россия, 26, Ставрополь, Киевская ул, 10, 2, 44");
        Address address2 = Address.anySeparator("Россия; 26; Ставрополь; Киевская ул; 10; 2; 44");
        Address address3 = Address.anySeparator("Россия 26 Ставрополь Киевская ул 10 2 44");

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
    }
}