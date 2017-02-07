package model;


/**
 * Class Budget
 * Budget for watching spends and manage it
 */
public class Budget extends BaseAccount{

  //
  // Fields
  //

  /**
   * Kind of butget
   */
  private model.ButgetKinds kind;
  /**
   * Limit of spending / Sum of accumulate
   */
  private float limit = .0f;
  
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
   * Set the value of kind
   * Kind of butget
   * @param newVar the new value of kind
   */
  private void setKind (model.ButgetKinds newVar) {
    kind = newVar;
  }

  /**
   * Get the value of kind
   * Kind of butget
   * @return the value of kind
   */
  private model.ButgetKinds getKind () {
    return kind;
  }

  /**
   * Set the value of limit
   * Limit of spending / Sum of accumulate
   * @param newVar the new value of limit
   */
  private void setLimit (float newVar) {
    limit = newVar;
  }

  /**
   * Get the value of limit
   * Limit of spending / Sum of accumulate
   * @return the value of limit
   */
  private float getLimit () {
    return limit;
  }

  //
  // Other methods
  //

}
