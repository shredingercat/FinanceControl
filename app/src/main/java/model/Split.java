package model;


/**
 * Class Split
 * Splittind transaction on categories
 */
public class Split extends Entity {

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
  private float sum = 0.0f;
  /**
   * Currency of split
   */
  private model.Currency currency;
  /**
   * account of split
   */
  private model.BaseAccount account;
  /**
   * Comment of operation
   */
  private String comment;
  /**
   * Parent
   */
  private model.Transaction parentTransaction;
  
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

  /**
   * Set the value of currency
   * Currency of split
   * @param newVar the new value of currency
   */
  private void setCurrency (model.Currency newVar) {
    currency = newVar;
  }

  /**
   * Get the value of currency
   * Currency of split
   * @return the value of currency
   */
  private model.Currency getCurrency () {
    return currency;
  }

  /**
   * Set the value of account
   * account of split
   * @param newVar the new value of account
   */
  private void setAccount (model.BaseAccount newVar) {
    account = newVar;
  }

  /**
   * Get the value of account
   * account of split
   * @return the value of account
   */
  private model.BaseAccount getAccount () {
    return account;
  }

  /**
   * Set the value of comment
   * Comment of operation
   * @param newVar the new value of comment
   */
  private void setComment (String newVar) {
    comment = newVar;
  }

  /**
   * Get the value of comment
   * Comment of operation
   * @return the value of comment
   */
  private String getComment () {
    return comment;
  }

  /**
   * Set the value of parentTransaction
   * Parent
   * @param newVar the new value of parentTransaction
   */
  private void setParentTransaction (model.Transaction newVar) {
    parentTransaction = newVar;
  }

  /**
   * Get the value of parentTransaction
   * Parent
   * @return the value of parentTransaction
   */
  private model.Transaction getParentTransaction () {
    return parentTransaction;
  }

  //
  // Other methods
  //

}
