package model;


/**
 * Class Budget
 * Budget for watching spends and manage it
 */
public class Budget {

  //
  // Fields
  //

  /**
   * Category limitition
   */
  private model.Category category;
  /**
   * Sum of limit
   */
  private float sum = .0f;
  
  //
  // Constructors
  //
  public Budget () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of category
   * Category limitition
   * @param newVar the new value of category
   */
  private void setCategory (model.Category newVar) {
    category = newVar;
  }

  /**
   * Get the value of category
   * Category limitition
   * @return the value of category
   */
  private model.Category getCategory () {
    return category;
  }

  /**
   * Set the value of sum
   * Sum of limit
   * @param newVar the new value of sum
   */
  private void setSum (float newVar) {
    sum = newVar;
  }

  /**
   * Get the value of sum
   * Sum of limit
   * @return the value of sum
   */
  private float getSum () {
    return sum;
  }

  //
  // Other methods
  //

}
