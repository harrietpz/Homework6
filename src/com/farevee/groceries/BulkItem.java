package com.farevee.groceries;

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
    this.food= food;
    this.unit=unit;
    this.amount=amount;
  } // BulkItem(BulkFood, Units, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    StringBuffer output= new StringBuffer();
    output.append(this.amount);
    output.append(" of ");
    output.append(this.food);
    return output.toString();
  }
  public int getPrice()
  {
    return this.;
  }
  public Weight getWeight()
  {
    return this.weight;
  }
}
