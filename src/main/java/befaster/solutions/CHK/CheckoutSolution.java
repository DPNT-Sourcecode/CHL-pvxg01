package befaster.solutions.CHK;

import org.apache.commons.lang3.StringUtils;

public class CheckoutSolution {

    public static final int A_PRICE = 50;

    public static final int B_PRICE = 30;

    public static final int C_PRICE = 20;

    public static final int D_PRICE = 15;

    public static final int E_PRICE = 40;

    public Integer checkout(String skus) {
        if (StringUtils.isBlank(skus)) {
            return 0;
        }
        final String[] allItems = skus.split("(?!^)");

        Integer total = 0;
        int aRepeated = 0;
        int bRepeated = 0;
        for (String item : allItems) {
            switch (item) {
                case "A":
                    total = total + A_PRICE;
                    aRepeated++;
                    break;
                case "B":
                    total = total + B_PRICE;
                    bRepeated++;
                    break;
                case "C":
                    total = total + C_PRICE;
                    break;
                case "D":
                    total = total + D_PRICE;
                    break;
//                case "E":
//                    total = total + E_PRICE;
//                    break;
                default:
                    return -1;

            }
        }
        total = total - aRepeated / 3 * A_PRICE * 4 /10;
        total = total - bRepeated / 2 * B_PRICE * 5 /10;
        return total;
    }
}



