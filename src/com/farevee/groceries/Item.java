package com.farevee.groceries;
public interface Item
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
