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
  /**
   * Account using for treatment of interests sum
   */
  private model.BankAccount interestAccount;
  
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

  /**
   * Set the value of interestAccount
   * Account using for treatment of interests sum
   * @param newVar the new value of interestAccount
   */
  private void setInterestAccount (model.BankAccount newVar) {
    interestAccount = newVar;
  }

  /**
   * Get the value of interestAccount
   * Account using for treatment of interests sum
   * @return the value of interestAccount
   */
  private model.BankAccount getInterestAccount () {
    return interestAccount;
  }

  //
  // Other methods
  //

}
