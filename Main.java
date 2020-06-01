import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Multiplier twoValues = new Multiplier();
        System.out.println(twoValues.Multiply(3,4));

        Multiplier fourValues = new Multiplier();
        System.out.println(fourValues.Multiply(3,4,4,4));

        Adder addTwoValues = new Adder();
        System.out.println(addTwoValues.add(1,2));

        ArrayList<BigDecimal> bigDecimals = new ArrayList<BigDecimal>();
        bigDecimals.add(BigDecimal.valueOf(54646));
        bigDecimals.add(BigDecimal.valueOf(645645));
        bigDecimals.add(BigDecimal.valueOf(354.56496));
        bigDecimals.add(BigDecimal.valueOf(45.326760));

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(6);
        integers.add(6);
        integers.add(6);
        integers.add(13);

        Address  onlyCountry = new Address();
        System.out.println(onlyCountry.createAddress("Zimbabwe"));
        Address  everything = new Address();
        System.out.println(onlyCountry.createAddress("Zimbabwe","New York","66613666",
                "lol street","13"));







    }
}
