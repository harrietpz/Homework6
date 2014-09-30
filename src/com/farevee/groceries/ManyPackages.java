package com.farevee.groceries;

/**
 * Make multiple packages.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */
public class ManyPackages
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * Package type */
  Package type;
  /**
   * The number of packages. */
  int count;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 
  /**
   * Create many packages. 
   */
  public ManyPackages(Package type, int count)
  {
    this.type = type;
    this.count = count;
  } // ManyPackages(Package, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    //add count to the toString method for type
    StringBuffer output = new StringBuffer(this.count);
    output.append(" x ");
    output.append(this.type.name);
    return output.toString();
  }//toString()

  public int getPrice()
  {
    return (this.type.price * this.count);
  }//getPrice()

  public Weight getWeight()
  {
    this.type.weight.amount = (this.type.weight.amount * this.count);
    return this.type.weight;
  }//getWeight()
   //class ManyPackages
}
