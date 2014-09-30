package com.farevee.groceries;

/**
 * Make a specific container for a BulkItem.
 * Extends BulkItem.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */
public class BulkContainer
    extends BulkItem
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * Name of container */
  String container;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 
  /**
   * Create a container. 
   */
  public BulkContainer(BulkFood food, Units unit, int amount, String container)
  {
    super(food, unit, amount);
    this.container = container;
  } // BulkContainer(String)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    //append the name of the container to the toString of food
    StringBuffer output = new StringBuffer(container);
    output.append(this.food.toString());
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
}//class BulkContainer
