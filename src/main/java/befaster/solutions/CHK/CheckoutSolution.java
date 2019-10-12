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

    public Integer checkout(String skus)
    {
        if (StringUtils.isBlank(skus))
        {
            return 0;
        }
        final String[] allItems = skus.split("(?!^)");

        final Map<String, Item> items = new HashMap<>();

        Integer total = 0;
        for (String item : allItems) {
            switch (item) {
                case "A":
                    total = addItemAndGetUpdatedTotal(items, total, A_PRICE, "A", 5, 50, 3, 20, MULTIPLE_DISCOUNTS, null);
                    break;
                case "B":
                    total = addItemAndGetUpdatedTotal(items, total, B_PRICE, "B", 0, 0, 2, 15, DISCOUNTED, null);
                    break;
                case "C":
                    total = addItemAndGetUpdatedTotal(items, total, C_PRICE, "C", 0, 0, 0, 0, null, null);
                    break;
                case "D":
                    total = addItemAndGetUpdatedTotal(items, total, D_PRICE, "D", 0, 0, 0, 0, null, null);
                    break;
                case "E":
                    total = addItemAndGetUpdatedTotal(items, total, E_PRICE, "E", 0, 0, 2, 0, ANOTHER_FREE, "B");
                    break;
                case "F":
                    total = addItemAndGetUpdatedTotal(items, total, F_PRICE, "F", 0, 0, 3, 0, SAME_FREE, null);
                    break;
                case "G":
                    total = addItemAndGetUpdatedTotal(items, total, G_PRICE, "G", 0, 0, 0, 0, null, null);
                    break;
                case "H":
                    total = addItemAndGetUpdatedTotal(items, total, H_PRICE, "H", 10, 10, 5, 5, MULTIPLE_DISCOUNTS, null);
                    break;
                case "I":
                    total = addItemAndGetUpdatedTotal(items, total, I_PRICE, "I", 0, 0, 0, 0, null, null);
                    break;
                case "J":
                    total = addItemAndGetUpdatedTotal(items, total, J_PRICE, "J", 0, 0, 0, 0, null, null);
                    break;
                case "K":
                    total = addItemAndGetUpdatedTotal(items, total, K_PRICE, "K", 0, 0, 2, 10, DISCOUNTED, null);
                    break;
                case "L":
                    total = addItemAndGetUpdatedTotal(items, total, L_PRICE, "L", 0, 0, 0, 0, null, null);
                    break;
                case "M":
                    total = addItemAndGetUpdatedTotal(items, total, M_PRICE, "M", 0, 0, 0, 0, null, null);
                    break;
                case "N":
                    total = addItemAndGetUpdatedTotal(items, total, N_PRICE, "N", 0, 0, 3, 0, ANOTHER_FREE, "M");
                    break;
                case "0":
                    total = addItemAndGetUpdatedTotal(items, total, O_PRICE, "O", 0, 0, 0, 0, null, null);
                    break;
                case "P":
                    total = addItemAndGetUpdatedTotal(items, total, P_PRICE, "P", 0, 0, 5, 50, DISCOUNTED, null);
                    break;
                case "Q":
                    total = addItemAndGetUpdatedTotal(items, total, Q_PRICE, "Q", 0, 0, 3, 10, DISCOUNTED, null);
                    break;
                case "R":
                    total = addItemAndGetUpdatedTotal(items, total, R_PRICE, "R", 0, 0, 3, 0, ANOTHER_FREE, "Q");
                    break;
                case "S":
                    total = addItemAndGetUpdatedTotal(items, total, S_PRICE, "S", 0, 0, 0, 0, null, null);
                    break;
                case "T":
                    total = addItemAndGetUpdatedTotal(items, total, T_PRICE, "T", 0, 0, 0, 0, null, null);
                    break;
                case "U":
                    total = addItemAndGetUpdatedTotal(items, total, U_PRICE, "U", 0, 0, 4, 0, SAME_FREE, null);
                    break;
                case "V":
                    total = addItemAndGetUpdatedTotal(items, total, V_PRICE, "V", 3, 20, 3, 10, MULTIPLE_DISCOUNTS, null);
                    break;
                case "W":
                    total = addItemAndGetUpdatedTotal(items, total, W_PRICE, "W", 0, 0, 0, 0, null, null);
                    break;
                case "X":
                    total = addItemAndGetUpdatedTotal(items, total, X_PRICE, "X", 0, 0, 0, 0, null, null);
                    break;
                case "Y":
                    total = addItemAndGetUpdatedTotal(items, total, Y_PRICE, "Y", 0, 0, 0, 0, null, null);
                    break;
                case "Z":
                    total = addItemAndGetUpdatedTotal(items, total, Z_PRICE, "Z", 0, 0, 0, 0, null, null);
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
            total = getAnotherDiscountedForFree(total, item.getDiscountProperties().get(SMALL_DISCOUNT_NUMBER),
                    item.getTotalBought(), items.get(item.getFreeItemName()), items);
            // Already calculated to total, so remove from map
            items.remove(item.getName());
        }
        for (Map.Entry<String, Item> entry : items.entrySet())
        {
            final Item item = entry.getValue();
            if (item.getDiscountType() == MULTIPLE_DISCOUNTS)
            {
                total = getOffersWithMultiDiscounts(total, item);
            }
            if (item.getDiscountType() == DISCOUNTED)
            {
                total = calculateDiscount(total, item.getTotalBought(), item.getDiscountProperties().get(SMALL_DISCOUNT_NUMBER),
                        item.getDiscountProperties().get(SMALL_DISCOUNT_DEDUCTION));
            }
            if (item.getDiscountType() == SAME_FREE)
            {
                total = getSameFree(total, item);
            }
        }
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
            item.setDiscountProperties(discountProperties);
        }
        items.put(itemName, item);
        return total;
    }

    private Integer getOffersWithMultiDiscounts(Integer total, Item item)
    {
        int largeDiscountNumber = item.getDiscountProperties().get(LARGE_DISCOUNT_NUMBER);
        int largeDiscountDeduction = item.getDiscountProperties().get(LARGE_DISCOUNT_DEDUCTION);
        int smallDiscountNumber = item.getDiscountProperties().get(SMALL_DISCOUNT_NUMBER);
        int smallDiscountDeduction = item.getDiscountProperties().get(SMALL_DISCOUNT_DEDUCTION);
        int totalBought = item.getTotalBought();
        if (totalBought >= largeDiscountNumber)
        {
            total = total - totalBought / largeDiscountNumber * largeDiscountDeduction;
            int remainder = totalBought % largeDiscountNumber;
            // Now calculate the remainder in the smaller discount
            if (remainder >= smallDiscountNumber)
            {
                total = calculateDiscount(total, remainder, smallDiscountNumber, smallDiscountDeduction);
            }
        }
        else
        {
            total = calculateDiscount(total, totalBought, smallDiscountNumber, smallDiscountDeduction);
        }
        return total;
    }

    private Integer getAnotherDiscountedForFree(Integer total, int numberToGetFree, int totalNonFreeBought, Item freeItem, Map<String, Item> totalItems)
    {
        if (freeItem != null)
        {
            int freeItemTotal = freeItem.getTotalBought();
            if (totalNonFreeBought >= numberToGetFree)
            {
                int divisionNumber = totalNonFreeBought / numberToGetFree > freeItemTotal ? freeItemTotal : totalNonFreeBought / numberToGetFree;
                total = total - divisionNumber * freeItem.getPrice();
                // Remove discounted from total
                freeItem.setTotalBought(freeItemTotal - totalNonFreeBought / numberToGetFree);
                totalItems.put(freeItem.getName(), freeItem);
            }
        }
        return total;
    }

    private Integer getSameFree(Integer total, Item item)
    {
        total = total - item.getTotalBought() / item.getDiscountProperties().get(SMALL_DISCOUNT_NUMBER) * item.getPrice();
        return total;
    }

    private int calculateDiscount(Integer total, int totalPerItem, int discountNumber, int discountPrice)
    {
        return total - totalPerItem / discountNumber * discountPrice;
    }
}




