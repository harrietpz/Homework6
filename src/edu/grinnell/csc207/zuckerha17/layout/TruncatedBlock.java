package edu.grinnell.csc207.zuckerha17.layout;

public class TruncatedBlock
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
   */
  public TruncatedBlock(TextBlock tb, int width)
  {
    this.text = tb;
    this.width = width;
  } // TruncatedBlock(TextBlock, int)

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
    return text.row(i).substring(0, this.width);
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
} // class TruncatedBlock