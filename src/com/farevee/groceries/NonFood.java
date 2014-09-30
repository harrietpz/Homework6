package com.farevee.groceries;

/**
 * Make a non-food item.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */
public class NonFood
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * Name of item */
  String name;
  /**
   * Weight of item */
  Weight weight;
  /**
   * Price of item */
  int price;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 
  /**
   * Make a non-food item. 
   */
  public NonFood(String name, Weight weight, int price)
  {
    this.name = name;
    this.weight = weight;
    this.price = price;
  } // NonFood(String, Weight, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    return this.name;
  }//toString()

  public int getPrice()
  {
    return this.price;
  }//getPrice()

  public Weight getWeight()
  {
    return this.weight;
  }//getWeight()
}//class NonFood
