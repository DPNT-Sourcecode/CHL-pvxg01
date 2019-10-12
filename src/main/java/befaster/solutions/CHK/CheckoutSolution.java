package befaster.solutions.CHK;

import org.apache.commons.lang3.StringUtils;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if (StringUtils.isBlank(skus)) {
            return 0;
        }
        final String[] allItems = skus.split("(?!^)");

        Integer total = 0;
        for (String item : allItems) {
            switch (item) {
                case "A":
                    total = total + 50;
                    break;
                case "B":
                    total = total + 30;
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

        return total;
    }
}

