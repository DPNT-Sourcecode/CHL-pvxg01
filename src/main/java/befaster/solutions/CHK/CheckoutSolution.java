package befaster.solutions.CHK;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.stream.Stream;

public class CheckoutSolution {
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
                    total = total + 50;
                    aRepeated++;
                    break;
                case "B":
                    total = total + 30;
                    bRepeated++;
                    break;
                case "C":
                    total = total + 20;
                    break;
                case "D":
                    total = total + 15;
                    break;
                default:
                    return -1;

            }
        }
        int discountA = aRepeated % 3;
        int discountB = aRepeated % 2;
        return total - discountA * 20;
    }
}


