package model;


/**
 * Class CreditAccount
 * Credit account class
 */
public class CreditAccount extends BankAccount {

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
  public CreditAccount () { };
  
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
