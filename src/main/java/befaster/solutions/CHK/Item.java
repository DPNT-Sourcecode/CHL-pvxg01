package befaster.solutions.CHK;

public class Item
{
    /* The name for the item*/
    private String name;

    /* The price*/
    private int price;

    /* The total bought for the item*/
    private int totalBought;

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
     *
     * @param totalBought the total bought
     */
    public void addToTotalBought(int totalBought)
    {
        this.totalBought++;
    }
}

