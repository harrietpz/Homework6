package com.farevee.groceries;

/**
 * Make a bulk food item.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */
public class BulkItem
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * Bulk item to use */
  BulkFood food;
  /**
   * The unit of the item. */
  Units unit;
  /**
   * The amount of the item. */
  int amount;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 
  /**
   * Create a new item. 
   */
  public BulkItem(BulkFood food, Units unit, int amount)
  {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  } // BulkItem(BulkFood, Units, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    //append the amount and unit and name of object to create the info
    StringBuffer output = new StringBuffer();
    output.append(this.amount);
    output.append(this.unit);
    output.append(" of ");
    output.append(this.food);
    return output.toString();
  }//toString()

  public int getPrice()
  {
    return (this.amount * this.food.pricePerUnit);
  }//getPrice()

  public Weight getWeight()
  {
    Weight item = new Weight(this.unit, this.amount);
    return item;
  }//getWeight()
}//class BulkItem
