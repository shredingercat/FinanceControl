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

  //
  // Other methods
  //

}
