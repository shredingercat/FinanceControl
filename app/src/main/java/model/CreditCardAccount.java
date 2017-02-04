package model;


/**
 * Class CreditCardAccount
 * Credit card account class
 */
public class CreditCardAccount extends CardAccount {

  //
  // Fields
  //

  /**
   * Limit of credit
   */
  private float limit = .0f;
  
  //
  // Constructors
  //
  public CreditCardAccount () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of limit
   * Limit of credit
   * @param newVar the new value of limit
   */
  private void setLimit (float newVar) {
    limit = newVar;
  }

  /**
   * Get the value of limit
   * Limit of credit
   * @return the value of limit
   */
  private float getLimit () {
    return limit;
  }

  //
  // Other methods
  //

}
