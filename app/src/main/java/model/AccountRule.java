package model;


/**
 * Class AccountRule
 * Rule of account class
 */
public class AccountRule {

  //
  // Fields
  //

  /**
   * Day of pay transaction
   */
  private int dayOfPay = 1;
  /**
   * Day of calc of statement
   */
  private int dayOfCalc = 1;
  /**
   * Interest rate of account soldo
   */
  private float interestRate = .0f;
  /**
   * Subaccount of interest state
   */
  private model.BaseAccount interestAccount;
  /**
   * Count of days of grace period
   */
  private int gracePeriodDays = 0;
  
  //
  // Constructors
  //
  public AccountRule () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of dayOfPay
   * Day of pay transaction
   * @param newVar the new value of dayOfPay
   */
  private void setDayOfPay (int newVar) {
    dayOfPay = newVar;
  }

  /**
   * Get the value of dayOfPay
   * Day of pay transaction
   * @return the value of dayOfPay
   */
  private int getDayOfPay () {
    return dayOfPay;
  }

  /**
   * Set the value of dayOfCalc
   * Day of calc of statement
   * @param newVar the new value of dayOfCalc
   */
  private void setDayOfCalc (int newVar) {
    dayOfCalc = newVar;
  }

  /**
   * Get the value of dayOfCalc
   * Day of calc of statement
   * @return the value of dayOfCalc
   */
  private int getDayOfCalc () {
    return dayOfCalc;
  }

  /**
   * Set the value of interestRate
   * Interest rate of account soldo
   * @param newVar the new value of interestRate
   */
  private void setInterestRate (float newVar) {
    interestRate = newVar;
  }

  /**
   * Get the value of interestRate
   * Interest rate of account soldo
   * @return the value of interestRate
   */
  private float getInterestRate () {
    return interestRate;
  }

  /**
   * Set the value of interestAccount
   * Subaccount of interest state
   * @param newVar the new value of interestAccount
   */
  private void setInterestAccount (model.BaseAccount newVar) {
    interestAccount = newVar;
  }

  /**
   * Get the value of interestAccount
   * Subaccount of interest state
   * @return the value of interestAccount
   */
  private model.BaseAccount getInterestAccount () {
    return interestAccount;
  }

  /**
   * Set the value of gracePeriodDays
   * Count of days of grace period
   * @param newVar the new value of gracePeriodDays
   */
  private void setGracePeriodDays (int newVar) {
    gracePeriodDays = newVar;
  }

  /**
   * Get the value of gracePeriodDays
   * Count of days of grace period
   * @return the value of gracePeriodDays
   */
  private int getGracePeriodDays () {
    return gracePeriodDays;
  }

  //
  // Other methods
  //

}
