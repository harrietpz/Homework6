package edu.grinnell.csc207.zuckerha17.layout;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * A few simple experiments with our utilities.
 */
public class MathExpt
{
  public static void main(String[] args)
    throws Exception
  {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    for (int i = 2; i < 10; i++)
      {
        double root = MathUtils.squareRoot(i);
        pen.println("The square root of " + i + " seems to be " + root);
        pen.println(root + "^2 = " + (root * root));
      } // for i
    // Print some square roots.
    double thing = 3.5;
    pen.println(MathUtils.squareRoot(new Float(2.3)));
    pen.println(MathUtils.squareRoot(new Double(2.3)));
    pen.println(MathUtils.squareRoot(new BigInteger("4")));
    pen.println(MathUtils.squareRoot(new BigDecimal("2.5")));
    pen.println(MathUtils.squareRoot(thing));
    pen.close();
  } // main(String[])
} // class MathExpt
