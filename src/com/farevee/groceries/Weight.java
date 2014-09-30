package com.farevee.groceries;
/**
 * Fields and constructors for the weight of a given item.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */
public class Weight
{
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The unit of measure.
   */
  Units unit;

  /**
   * The amount.
   */
  int amount;
  
//+--------------+------------------------------------------------
 // | Constructors |
 // +--------------+
  public Weight(Units unit, int amount)
  {
    this.unit=unit;
    this.amount=amount;
  }//Weight(Units, int)
}//class Weight
