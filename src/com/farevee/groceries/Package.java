package com.farevee.groceries;

/**
 * Making and using a package.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */
public class Package
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /** The price of the item. */
  int price;
  /**
   * The name of the item. */
  String name;

  /** The weight of the item. */
  Weight weight;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 
  /**
   * Create a new package. 
   */
  public Package(String name, Weight weight, int price)
  {
    this.name = name;
    this.weight = weight;
    this.price = price;
  } // Package(String, Weight, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    //append the weight to the name of the package
    StringBuffer output = new StringBuffer();
    output.append(this.weight);
    output.append(" package of ");
    output.append(this.name);
    return output.toString();
  }//toString()

  public int getPrice()
  {
    return this.price;
  }//getPrice()

  public Weight getWeight()
  {
    return this.weight;
  }//getWeight()
}//class Package
