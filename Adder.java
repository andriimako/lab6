import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {
    private int a, b;
    private BigDecimal i, e;

    public int add (int a, int b){
        this.a = a;
        this.b = b;
        return a+b;
    }

    public BigDecimal add (BigDecimal i, BigDecimal e){
        this.i = i;
        this.e = e;
        return i.add(e);
    }

    public static BigDecimal add (ArrayList<BigDecimal> bigDecimals) {
        BigDecimal product = BigDecimal.valueOf(0.00);
        for (int i = 0; i < bigDecimals.size(); i++) {
            product = product.add(bigDecimals.get(i));
        }
        return product;
    }

}
