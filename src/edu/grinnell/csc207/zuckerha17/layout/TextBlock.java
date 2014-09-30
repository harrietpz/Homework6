package edu.grinnell.csc207.zuckerha17.layout;

/**
 * Blocks of text.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.1 of February 2014
 */
public interface TextBlock
{
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   * 
   * @pre i < this.height()
   * @exception Exception
   *              if the row number is invalid.
   */
  public String row(int i)
    throws Exception;

  /**
   * Determine how many rows are in the block.
   * @throws Exception 
   */
  public int height()
    throws Exception;

  /**
   * Determine how many columns are in the block.
   * @throws Exception 
   */
  public int width()
    throws Exception;

} // interface TextBlock
