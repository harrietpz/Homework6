package com.farevee.groceries;

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
  }
}
