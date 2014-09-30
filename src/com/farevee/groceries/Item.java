package com.farevee.groceries;
/**
 * The item interface.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */public interface Item
{

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Get weight of item
   */
  public Weight getWeight();
  
  /**
   * Get price of item
   */
  public int getPrice();
 
  /**
   * Convert to a string
   */
  public String toString();
 
}//interface Item
