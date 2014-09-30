package com.farevee.groceries;

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
    this.type= type;
    this.count=count;
  } // ManyPackages(Package, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
}
