package model;


/**
 * Class Split
 * Splittind transaction on categories
 */
public class Split {

  //
  // Fields
  //

  /**
   * Category
   */
  private model.Category category;
  /**
   * sum of split
   */
  private float sum = 0;
  
  //
  // Constructors
  //
  public Split () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of category
   * Category
   * @param newVar the new value of category
   */
  private void setCategory (model.Category newVar) {
    category = newVar;
  }

  /**
   * Get the value of category
   * Category
   * @return the value of category
   */
  private model.Category getCategory () {
    return category;
  }

  /**
   * Set the value of sum
   * sum of split
   * @param newVar the new value of sum
   */
  private void setSum (float newVar) {
    sum = newVar;
  }

  /**
   * Get the value of sum
   * sum of split
   * @return the value of sum
   */
  private float getSum () {
    return sum;
  }

  //
  // Other methods
  //

}
