package com.farevee.shopping;

public class Cart
{
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public void addItem(Item)
  {
  }

  public int getPrice()
  {
    return (this.amount * this.food.pricePerUnit);
  }

  public Weight getWeight()
  {
    Weight item = new Weight(this.unit, this.amount);
    return item;
  }
}
