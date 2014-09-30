package com.farevee.groceries;

public class BulkFood
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The unit of measurement for the weight. */
  Units unit;
  /**
   * The price per unit of the item. */
  int pricePerUnit;
  /**
   * The name of the item. */
  String name;

  /** The inventory of the item. */
  int supply;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 
  /**
   * Create a new bulk item. 
   */
  public BulkFood(String name, Units unit, int pricePerUnit, int supply)
  {
    this.name = name;
    this.unit = unit;
    this.pricePerUnit = pricePerUnit;
    this.supply = supply;
  } // BulkFood(String, Units, int, int)
}
