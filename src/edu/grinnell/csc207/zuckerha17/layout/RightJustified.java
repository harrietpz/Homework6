package edu.grinnell.csc207.zuckerha17.layout;

/**
 * The vertical composition of two text blocks.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */
public class RightJustified
    implements TextBlock
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The TextBlock to truncate. */
  TextBlock text;
  /**
   * The desired width. */
  int width;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 
  /**
   * Create a new truncated block of the specified width.
   * @throws Exception 
   */
  public RightJustified(TextBlock tb, int width) throws Exception
  {
    if (this.width < tb.width())
      {
        this.text = tb;
        this.width = width;
      }
  } // RightJustified(TextBlock, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Get the ith row of the block.
   * @throws Exception 
   */
  public String row(int i)
    throws Exception
  {
    int spacing = this.width - this.text.width();
    //set spacing after the item
    StringBuffer output = new StringBuffer(this.width);
    for (int count = 0; count < this.width; count++)
      {
        output.append(" ");
      } //for loop to create spaces
    output.replace(spacing, this.text.width() + spacing, this.text.row(i));
    return output.toString();
  } // row(int)

  /**
   * Determine how many rows are in the block.
   * @throws Exception 
   */
  public int height()
    throws Exception
  {
    return this.text.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.width;
  } // width()
} //class RightJustified
