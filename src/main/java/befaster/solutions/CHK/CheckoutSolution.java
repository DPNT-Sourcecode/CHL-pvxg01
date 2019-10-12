package befaster.solutions.CHK;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static befaster.solutions.CHK.DiscountType.ANOTHER_FREE;
import static befaster.solutions.CHK.DiscountType.DISCOUNTED;
import static befaster.solutions.CHK.DiscountType.MULTIPLE_DISCOUNTS;
import static befaster.solutions.CHK.DiscountType.SAME_FREE;

public class CheckoutSolution {

    /* The price for item A*/
    private static final int A_PRICE = 50;

    /* The price for item B*/
    private static final int B_PRICE = 30;

    /* The price for item C*/
    private static final int C_PRICE = 20;

    /* The price for item D*/
    private static final int D_PRICE = 15;

    /* The price for item E*/
    private static final int E_PRICE = 40;

    /* The price for item F*/
    private static final int F_PRICE = 10;

    /* The price for item G*/
    private static final int G_PRICE = 20;

    /* The price for item H*/
    private static final int H_PRICE = 10;

    /* The price for item I*/
    private static final int I_PRICE = 35;

    /* The price for item J*/
    private static final int J_PRICE = 60;

    /* The price for item K*/
    private static final int K_PRICE = 80;

    /* The price for item L*/
    private static final int L_PRICE = 90;

    /* The price for item M*/
    private static final int M_PRICE = 15;

    /* The price for item N*/
    private static final int N_PRICE = 40;

    /* The price for item O*/
    private static final int O_PRICE = 10;

    /* The price for item P*/
    private static final int P_PRICE = 50;

    /* The price for item Q*/
    private static final int Q_PRICE = 30;

    /* The price for item R*/
    private static final int R_PRICE = 50;

    /* The price for item S*/
    private static final int S_PRICE = 30;

    /* The price for item T*/
    private static final int T_PRICE = 20;

    /* The price for item U*/
    private static final int U_PRICE = 40;

    /* The price for item V*/
    private static final int V_PRICE = 50;

    /* The price for item W*/
    private static final int W_PRICE = 20;

    /* The price for item X*/
    private static final int X_PRICE = 90;

    /* The price for item Y*/
    private static final int Y_PRICE = 10;

    /* The price for item Z*/
    private static final int Z_PRICE = 50;
    public static final String LARGE_DISCOUNT_NUMBER = "largeDiscountNumber";
    public static final String LARGE_DISCOUNT_DEDUCTION = "largeDiscountDeduction";
    public static final String SMALL_DISCOUNT_NUMBER = "smallDiscountNumber";
    public static final String SMALL_DISCOUNT_DEDUCTION = "smallDiscountDeduction";

//    | A    | 50    | 3A for 130, 5A for 200 |
//            | B    | 30    | 2B for 45              |
//            | C    | 20    |                        |
//            | D    | 15    |                        |
//            | E    | 40    | 2E get one B free      |
//            | F    | 10    | 2F get one F free      |
//            | G    | 20    |                        |
//            | H    | 10    | 5H for 45, 10H for 80  |
//            | I    | 35    |                        |
//            | J    | 60    |                        |
//            | K    | 80    | 2K for 150             |
//            | L    | 90    |                        |
//            | M    | 15    |                        |
//            | N    | 40    | 3N get one M free      |
//            | O    | 10    |                        |
//            | P    | 50    | 5P for 200             |
//            | Q    | 30    | 3Q for 80              |
//            | R    | 50    | 3R get one Q free      |
//            | S    | 30    |                        |
//            | T    | 20    |                        |
//            | U    | 40    | 3U get one U free      |
//            | V    | 50    | 2V for 90, 3V for 130  |
//            | W    | 20    |                        |
//            | X    | 90    |                        |
//            | Y    | 10    |                        |
//            | Z    | 50    |

    public Integer checkout(String skus) {
        if (StringUtils.isBlank(skus)) {
            return 0;
        }
        final String[] allItems = skus.split("(?!^)");

        final Map<String, Item> items = new HashMap<>();

        Integer total = 0;
        int aRepeated = 0;
        int bRepeated = 0;
        int eRepeated = 0;
        int fRepeated = 0;
        for (String item : allItems) {
            switch (item) {
                case "A":
                    addItemAndGetUpdatedTotal(items, total, A_PRICE, "A", 5, 50, 3, 20, MULTIPLE_DISCOUNTS, null);
                    break;
                case "B":
                    addItemAndGetUpdatedTotal(items, total, B_PRICE, "B", 0, 0, 2, 15, DISCOUNTED, null);
                    break;
                case "C":
                    addItemAndGetUpdatedTotal(items, total, C_PRICE, "C", 0, 0, 0, 0, null, null);
                    break;
                case "D":
                    addItemAndGetUpdatedTotal(items, total, D_PRICE, "D", 0, 0, 0, 0, null, null);
                    break;
                case "E":
                    addItemAndGetUpdatedTotal(items, total, E_PRICE, "E", 0, 0, 2, 0, ANOTHER_FREE, "B");
                    break;
                case "F":
                    addItemAndGetUpdatedTotal(items, total, F_PRICE, "F", 0, 0, 3, 0, SAME_FREE, null);
                    break;
                case "G":
                    addItemAndGetUpdatedTotal(items, total, G_PRICE, "G", 0, 0, 0, 0, null, null);
                    break;
                case "H":
                    addItemAndGetUpdatedTotal(items, total, H_PRICE, "H", 10, 10, 5, 5, MULTIPLE_DISCOUNTS, null);
                    break;
                case "I":
                    addItemAndGetUpdatedTotal(items, total, I_PRICE, "I", 0, 0, 0, 0, null, null);
                    break;
                case "J":
                    addItemAndGetUpdatedTotal(items, total, J_PRICE, "J", 0, 0, 0, 0, null, null);
                    break;
                case "K":
                    addItemAndGetUpdatedTotal(items, total, K_PRICE, "K", 0, 0, 2, 10, DISCOUNTED, null);
                    break;
                case "L":
                    addItemAndGetUpdatedTotal(items, total, L_PRICE, "L", 0, 0, 0, 0, null, null);
                    break;
                case "M":
                    addItemAndGetUpdatedTotal(items, total, M_PRICE, "M", 0, 0, 0, 0, null, null);
                    break;
                case "N":
                    addItemAndGetUpdatedTotal(items, total, N_PRICE, "N", 0, 0, 3, 0, ANOTHER_FREE, "M");
                    break;
                case "0":
                    addItemAndGetUpdatedTotal(items, total, O_PRICE, "O", 0, 0, 0, 0, null, null);
                    break;
                case "P":
                    addItemAndGetUpdatedTotal(items, total, P_PRICE, "P", 0, 0, 5, 50, DISCOUNTED, null);
                    break;
                case "Q":
                    addItemAndGetUpdatedTotal(items, total, Q_PRICE, "Q", 0, 0, 3, 10, DISCOUNTED, null);
                    break;
                case "R":
                    addItemAndGetUpdatedTotal(items, total, R_PRICE, "R", 0, 0, 3, 0, ANOTHER_FREE, "Q");
                    break;
                case "S":
                    addItemAndGetUpdatedTotal(items, total, S_PRICE, "S", 0, 0, 0, 0, null, null);
                    break;
                case "T":
                    addItemAndGetUpdatedTotal(items, total, T_PRICE, "T", 0, 0, 0, 0, null, null);
                    break;
                case "U":
                    addItemAndGetUpdatedTotal(items, total, U_PRICE, "U", 0, 0, 4, 0, SAME_FREE, null);
                    break;
                case "V":
                    addItemAndGetUpdatedTotal(items, total, V_PRICE, "V", 3, 20, 3, 10, MULTIPLE_DISCOUNTS, null);
                    break;
                case "W":
                    addItemAndGetUpdatedTotal(items, total, W_PRICE, "W", 0, 0, 0, 0, null, null);
                    break;
                case "X":
                    addItemAndGetUpdatedTotal(items, total, X_PRICE, "X", 0, 0, 0, 0, null, null);
                    break;
                case "Y":
                    addItemAndGetUpdatedTotal(items, total, Y_PRICE, "Y", 0, 0, 0, 0, null, null);
                    break;
                case "Z":
                    addItemAndGetUpdatedTotal(items, total, Z_PRICE, "Z", 0, 0, 0, 0, null, null);
                    break;
                default:
                    return -1;

            }
        }
        // Deduct from items with another free item first
        final Set<Item> anotherFreeItems = new HashSet<>();
        items.forEach((k,v) -> {
            if (v.getDiscountType() == ANOTHER_FREE)
            {
                anotherFreeItems.add(v);
            }
        });
        for (Item item : anotherFreeItems)
        {

        }
        for (Map.Entry<String, Item> entry : items.entrySet())
        {
            final Item item = entry.getValue();
            if (item.getDiscountType() == MULTIPLE_DISCOUNTS)
            {

            }
            if (item.getDiscountType() == DISCOUNTED)
            {

            }
            if (item.getDiscountType() == SAME_FREE)
            {

            }
        }

            total = getOffersWithMultiDiscounts(total, aRepeated);
            total = getBAndEDiscount(total, bRepeated, eRepeated);
            total = getFDiscount(total, fRepeated);
        return total;
    }

    private Integer addItemAndGetUpdatedTotal(final Map<String, Item> items, Integer total, Integer price, String itemName,
                                           Integer largeDiscountNumber, Integer largeDiscountDeduction, Integer smallDiscountNumber,
                                           Integer smallDiscountDeduction, DiscountType discountType, String freeItemName)
    {
        total = total + price;

        Item item;
        if (items.get(itemName) != null)
        {
            Item existingItem = items.get(itemName);
            existingItem.addToTotalBought();
            item = existingItem;
        }
        else
        {
            item = new Item();
            item.setName(itemName);
            item.setPrice(price);
            item.addToTotalBought();
            item.setName("A");
            item.setDiscountType(discountType);
            item.setFreeItemName(freeItemName);
            final Map<String, Integer>  discountProperties = new HashMap<>();
            discountProperties.put(LARGE_DISCOUNT_NUMBER, largeDiscountNumber);
            discountProperties.put(LARGE_DISCOUNT_DEDUCTION, largeDiscountDeduction);
            discountProperties.put(SMALL_DISCOUNT_NUMBER, smallDiscountNumber);
            discountProperties.put(SMALL_DISCOUNT_DEDUCTION, smallDiscountDeduction);
        }
        items.put(itemName, item);
        return total;
    }

    private Integer getOffersWithMultiDiscounts(Integer total, Item item)
    {
        if (aRepeated >= 5)
        {
            total = total - aRepeated / 5 * A_PRICE;
            int remainder = aRepeated % 5;
            if (remainder >= 3) {
                total = getDiscount(total, remainder, 3, A_PRICE, 4);
            }
        }
        else
        {
            total = getDiscount(total, aRepeated, 3, A_PRICE, 4);
        }
        return total;
    }

    private Integer getBAndEDiscount(Integer total, int bRepeated, int eRepeated)
    {
        if (eRepeated > 1)
        {
            int divisionNumber = eRepeated / 2 > bRepeated ? bRepeated : eRepeated / 2;
            total = total - divisionNumber * B_PRICE;
            bRepeated = bRepeated - divisionNumber;
            total = getDiscount(total, bRepeated, 2, B_PRICE, 5);
        }
        else if (bRepeated > 1)
        {
            total = getDiscount(total, bRepeated, 2, B_PRICE, 5);
        }
        return total;
    }

    private Integer getAnotherDiscountedForFree(Integer total, int bRepeated, int eRepeated)
    {
        if (eRepeated > 1)
        {
            int divisionNumber = eRepeated / 2 > bRepeated ? bRepeated : eRepeated / 2;
            total = total - divisionNumber * B_PRICE;
            bRepeated = bRepeated - divisionNumber;
            total = getDiscount(total, bRepeated, 2, B_PRICE, 5);
        }
        else if (bRepeated > 1)
        {
            total = getDiscount(total, bRepeated, 2, B_PRICE, 5);
        }
        return total;
    }

    private Integer getFDiscount(Integer total, int fRepeated)
    {
        total = total - fRepeated / 3 * F_PRICE;
        return total;
    }

    private int getDiscount(Integer total, int repeats, int division, int price, int discountNumber)
    {
        return total - repeats / division * price * discountNumber / 10;
    }
}
