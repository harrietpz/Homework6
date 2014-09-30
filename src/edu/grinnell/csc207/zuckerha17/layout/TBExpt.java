package edu.grinnell.csc207.zuckerha17.layout;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.2 of September 2014
 */
public class TBExpt
{
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
    throws Exception
  {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    BoxedBlock box5 = new BoxedBlock(new Grid(7, 3, '*'));
    TBUtils.print(pen,box5);
    
    TextBlock block = 
        new VComposition(new TextLine("Hello"), new TextLine("Goodbye"));
      TextBlock block2 = new TruncatedBlock(block, 3);
      TBUtils.print(pen, block);
      TBUtils.print(pen, block2);
      
    TextBlock block3 =
        new VComposition(new TextLine("Hello"), new TextLine("Goodbyee"));
    TextBlock block4 = new BoxedBlock(new CenteredBlock(block3, 11));
    TBUtils.print(pen, block4);

    TextBlock top = new CenteredBlock(new TextLine("Hello"), 11);
    TextBlock bottom = new CenteredBlock(new TextLine("Goodbyee"), 11);
    TextBlock tb = new BoxedBlock(new VComposition(top, bottom));
    TBUtils.print(pen, tb);

    TextBlock block5 =
        new VComposition(new TextLine("Hello"), new TextLine("Goodbye"));
    TextBlock block6 = new BlockPair(block5);
    TBUtils.print(pen, block6);

    TextBlock tb3 = new VComposition(new TextLine("Hello"), new TextLine("Goodbye"));
    TextBlock tb4 = new RightJustified(tb3,50);
    TBUtils.print(pen, tb4);
    
    TextLine tb1 = new TextLine("Hello");
    TextLine tb2 = new TextLine("World");
    TextBlock compound =
        new BoxedBlock(
                       new CenteredBlock(
                                         new BoxedBlock(
                                                        new CenteredBlock(
                                                                          new VComposition(
                                                                                           tb1,
                                                                                           tb2),
                                                                          7)),
                                         15));
    pen.println("ORIGINAL");
    TBUtils.print(pen, compound);
    tb2.setContents("Someone");
    pen.println("UPDATED");
    TBUtils.print(pen, compound);
    //tb1.setContents("Nice to meet you,");
    //pen.println("RE-UPDATED");
    //TBUtils.print(pen, compound);
    pen.close();
  } // main(String[])

} // class TBExpt
