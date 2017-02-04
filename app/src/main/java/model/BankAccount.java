package model;


/**
 * Class BankAccount
 */
public class BankAccount extends BaseAccount {

  //
  // Fields
  //

  /**
   * Bank name.
   */
  private String emitentName;
  /**
   * Rule of this account
   */
  private model.AccountRule accountRule;
  
  //
  // Constructors
  //
  public BankAccount () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of emitentName
   * Bank name.
   * @param newVar the new value of emitentName
   */
  private void setEmitentName (String newVar) {
    emitentName = newVar;
  }

  /**
   * Get the value of emitentName
   * Bank name.
   * @return the value of emitentName
   */
  private String getEmitentName () {
    return emitentName;
  }

  /**
   * Set the value of accountRule
   * Rule of this account
   * @param newVar the new value of accountRule
   */
  private void setAccountRule (model.AccountRule newVar) {
    accountRule = newVar;
  }

  /**
   * Get the value of accountRule
   * Rule of this account
   * @return the value of accountRule
   */
  private model.AccountRule getAccountRule () {
    return accountRule;
  }

  //
  // Other methods
  //

}
