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
        int eRepeated = 0;
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
                case "E":
                    total = total + E_PRICE;
                    eRepeated++;
                    break;
                default:
                    return -1;

            }
        }
        if (aRepeated >= 5)
        {
            total = total - aRepeated / 5 * A_PRICE;
            int remainder = aRepeated % 5;
            if (remainder >= 3)
            {
                total = getTotalByThree(total, remainder);
            }
        }
        else
        {
            total = getTotalByThree(total, aRepeated);
            if (eRepeated > 1)
            {
                int divisionNumber = eRepeated / 2 > bRepeated ? bRepeated : eRepeated / 2;
                total = total - divisionNumber * B_PRICE;
            }
            else if (bRepeated > 1)
            {
                total = total - bRepeated / 2 * B_PRICE * 5 / 10;
            }
        }

        return total;
    }

    private int getTotalByThree(Integer total, int aRepeated)
    {
        return total - aRepeated / 3 * A_PRICE * 4 / 10;
    }
}


