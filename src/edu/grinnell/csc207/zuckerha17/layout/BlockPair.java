package edu.grinnell.csc207.zuckerha17.layout;

/**
 * Creates a pair of side-by-side TextBlocks.
 * 
 * @author Harriet Zucker
 * @version 1.1 of September 2014
 */
public class BlockPair
    implements TextBlock
{
  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The TextBlock to duplicate. */
  TextBlock text;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+ 
  /**
   * Create a new pair of blocks.
   * @throws Exception 
   */
  public BlockPair(TextBlock tb) throws Exception
  {
    this.text = tb;
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
    //create new StringBuffer and then fill with both elements next to each other
    StringBuffer output = new StringBuffer(this.text.width() * 2);
    output.append(this.text.row(i));
    output.append(this.text.row(i));
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
   * @throws Exception 
   */
  public int width()
    throws Exception
  {
    return (this.text.width() * 2);
  } // width()
} //class BlockPair
