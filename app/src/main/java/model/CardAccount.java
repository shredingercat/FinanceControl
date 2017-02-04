package model;


/**
 * Class CardAccount
 * Bank card account class
 */
abstract public class CardAccount extends BankAccount {

  //
  // Fields
  //

  /**
   * Full card number
   */
  private String cardNomber;
  /**
   * Month embossed on card
   */
  private int validThrowMonth = 1;
  /**
   * Year embossed on card
   */
  private int validThrowYear = 01;
  /**
   * Name of cardholder, if embossed
   */
  private String cardholdersName;
  /**
   * Type of paysystem of this card
   */
  private model.BankCardTypes cardPaySystem;
  
  //
  // Constructors
  //
  public CardAccount () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of cardNomber
   * Full card number
   * @param newVar the new value of cardNomber
   */
  private void setCardNomber (String newVar) {
    cardNomber = newVar;
  }

  /**
   * Get the value of cardNomber
   * Full card number
   * @return the value of cardNomber
   */
  private String getCardNomber () {
    return cardNomber;
  }

  /**
   * Set the value of validThrowMonth
   * Month embossed on card
   * @param newVar the new value of validThrowMonth
   */
  private void setValidThrowMonth (int newVar) {
    validThrowMonth = newVar;
  }

  /**
   * Get the value of validThrowMonth
   * Month embossed on card
   * @return the value of validThrowMonth
   */
  private int getValidThrowMonth () {
    return validThrowMonth;
  }

  /**
   * Set the value of validThrowYear
   * Year embossed on card
   * @param newVar the new value of validThrowYear
   */
  private void setValidThrowYear (int newVar) {
    validThrowYear = newVar;
  }

  /**
   * Get the value of validThrowYear
   * Year embossed on card
   * @return the value of validThrowYear
   */
  private int getValidThrowYear () {
    return validThrowYear;
  }

  /**
   * Set the value of cardholdersName
   * Name of cardholder, if embossed
   * @param newVar the new value of cardholdersName
   */
  private void setCardholdersName (String newVar) {
    cardholdersName = newVar;
  }

  /**
   * Get the value of cardholdersName
   * Name of cardholder, if embossed
   * @return the value of cardholdersName
   */
  private String getCardholdersName () {
    return cardholdersName;
  }

  /**
   * Set the value of cardPaySystem
   * Type of paysystem of this card
   * @param newVar the new value of cardPaySystem
   */
  private void setCardPaySystem (model.BankCardTypes newVar) {
    cardPaySystem = newVar;
  }

  /**
   * Get the value of cardPaySystem
   * Type of paysystem of this card
   * @return the value of cardPaySystem
   */
  private model.BankCardTypes getCardPaySystem () {
    return cardPaySystem;
  }

  //
  // Other methods
  //

}
