package edu.grinnell.csc207.zuckerha17.layout;
public class Grid
    implements TextBlock
{

  //+--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The width of the grid. */
  int width;
  /**
   * The height of the grid. */
  int height;
  /**
   * What to fill the grid with.
   */
  char ch;

  //+--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Build a grid with of widthXheight composed of char.
   */
  public Grid(int width, int height, char ch)
  {
    this.width = width;
    this.height = height;
    this.ch = ch;

  } // Grid(int, int, char)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Return the width.
   *@exception Exception
   *              if the width is an invalid int.    
   */
  public int width()
    throws Exception
  {
    return this.width;
  }// width()

  /**
    * Return the height.
    * *@exception Exception
   *              if the height is an invalid int.  
    */
  public int height()
    throws Exception
  {
    return this.height;
  }// height()

  /**
   * Return a string of width copies of ch selected from one row of Grid.
   * @pre 0 < i < height
   */
  public String row(int i)
  {
    //make a stringbuilder to to represent the contents
    StringBuilder output = new StringBuilder();
    //fill the grid with width copies of the item
    for (int count = 0; count < this.width; count++)
      {
        output.append(this.ch);
      }
    return output.toString();
  }// row(int)

}
