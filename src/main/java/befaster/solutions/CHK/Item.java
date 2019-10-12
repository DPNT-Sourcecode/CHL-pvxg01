package befaster.solutions.CHK;

import java.util.Map;

public class Item
{
    /* The name for the item*/
    private String name;

    /* The price*/
    private int price;

    /* The total bought for the item*/
    private int totalBought;

    /* The name of the free item offere for this item*/
    private String freeItemName;

    /* The discount type for this item*/
    private DiscountType discountType;

    /* A map containing discount details for this item*/
    private Map<String, Integer> discountProperties;

    /**
     * Gets price.
     *
     * @return the price
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(int price)
    {
        this.price = price;
    }

    /**
     * Gets total bought.
     *
     * @return the total bought
     */
    public int getTotalBought()
    {
        return totalBought;
    }

    /**
     * Sets total bought.
     */
    public void addToTotalBought()
    {
        this.totalBought++;
    }

    /**
     * Sets total bought.
     *
     * @param totalBought the total bought
     */
    public void setTotalBought(int totalBought)
    {
        this.totalBought = totalBought;
    }

    /**
     * Gets free item name.
     *
     * @return the free item name
     */
    public String getFreeItemName()
    {
        return freeItemName;
    }

    /**
     * Sets free item name.
     *
     * @param freeItemName the free item name
     */
    public void setFreeItemName(String freeItemName)
    {
        this.freeItemName = freeItemName;
    }

    /**
     * Gets discount type.
     *
     * @return the discount type
     */
    public DiscountType getDiscountType()
    {
        return discountType;
    }

    /**
     * Sets discount type.
     *
     * @param discountType the discount type
     */
    public void setDiscountType(DiscountType discountType)
    {
        this.discountType = discountType;
    }

    /**
     * Gets discount properties.
     *
     * @return the discount properties
     */
    public Map<String, Integer> getDiscountProperties()
    {
        return discountProperties;
    }

    /**
     * Sets discount properties.
     *
     * @param discountProperties the discount properties
     */
    public void setDiscountProperties(Map<String, Integer> discountProperties)
    {
        this.discountProperties = discountProperties;
    }
}
