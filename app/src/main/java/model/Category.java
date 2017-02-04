package model;


/**
 * Class Category
 * Category class
 */
public class Category {

  //
  // Fields
  //

  /**
   * Name of category
   */
  private String name;
  /**
   * Parent category of category
   */
  private model.Category parent;
  /**
   * Debit sign of category
   */
  private boolean isDebit = false;
  
  //
  // Constructors
  //
  public Category () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * Name of category
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * Name of category
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of parent
   * Parent category of category
   * @param newVar the new value of parent
   */
  private void setParent (model.Category newVar) {
    parent = newVar;
  }

  /**
   * Get the value of parent
   * Parent category of category
   * @return the value of parent
   */
  private model.Category getParent () {
    return parent;
  }

  /**
   * Set the value of isDebit
   * Debit sign of category
   * @param newVar the new value of isDebit
   */
  private void setIsDebit (boolean newVar) {
    isDebit = newVar;
  }

  /**
   * Get the value of isDebit
   * Debit sign of category
   * @return the value of isDebit
   */
  private boolean getIsDebit () {
    return isDebit;
  }

  //
  // Other methods
  //

}
