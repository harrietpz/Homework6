package com.farevee.tests;

import com.farevee.groceries.BulkContainer;
import com.farevee.groceries.BulkFood;
import com.farevee.groceries.BulkItem;
import com.farevee.groceries.ManyPackages;
import com.farevee.groceries.NonFood;
import com.farevee.groceries.Package;
import com.farevee.groceries.Units;
import com.farevee.groceries.Weight;

public class ShoppingExpts
{
  public static void main(String[] args)
  {
 // The store has 20 pounds of bananas, priced at 50 cents per pound
    BulkFood bananas = new BulkFood("bananas", Units.POUNDS, 50, 20);
    // The store has 200 grams of saffron, priced at 1000 cents per gram
    BulkFood saffron = new BulkFood("saffron", Units.GRAMS, 1000, 200);

    // The customer adds three pounds of bananas to the cart
    cart.addItem(new BulkItem(bananas, Units.POUNDS, 3);

    // The customer adds a jar of 3 grams of saffron to the cart
    cart.addItem(new BulkContainer("jar", saffron, Units.GRAMS, 3);

    // The customer adds a bag of 1 gram of saffron to the cart
    cart.addItem(new BulkItem(saffron, Units.GRAMS, 1);

    // The customer adds a can opener to the cart, priced $3.489.
    cart.addItem(new NonFood("can opener", new Weight(Units.OUNCES, 2), 349);

    // The customer adds a box of oreos to the cart
    cart.addItem(new Package("oreos", new Weight(Units.OUNCES, , 12), 399);

    // The customer adds five 6oz packages of macncheez to the cart, each 
    // priced at 77 cents.
    cart.addItem(new ManyPackages(new Package("macncheez", 
        new Weight(Units.OUNCES, 6), 77), 5)); 
  }
}
