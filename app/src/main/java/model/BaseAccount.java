package model;


/**
 * Class BaseAccount
 */
abstract public class BaseAccount {

  //
  // Fields
  //

  private String name;
  /**
   * ??????
   */
  private model.Currency currency;
  /**
   * Account balance
   */
  private float balance = .0f;
  /**
   * Describtion of account
   */
  private String describtion;
  /**
   * Sorting score. Sort by BaseAccount.sortingScore asc then BaseAccount.name asc
   */
  private int sortingScore;
  /**
   * Flag of including this account and transactions on it into reports
   */
  private boolean isReported = true;
  /**
   * Closed/opened state of account
   */
  private boolean isClosed = false;
  
  //
  // Constructors
  //
  public BaseAccount () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of currency
   * ??????
   * @param newVar the new value of currency
   */
  private void setCurrency (model.Currency newVar) {
    currency = newVar;
  }

  /**
   * Get the value of currency
   * ??????
   * @return the value of currency
   */
  private model.Currency getCurrency () {
    return currency;
  }

  /**
   * Set the value of balance
   * Account balance
   * @param newVar the new value of balance
   */
  private void setBalance (Float newVar) {
    balance = newVar;
  }

  /**
   * Get the value of balance
   * Account balance
   * @return the value of balance
   */
  private Float getBalance () {
    return balance;
  }

  /**
   * Set the value of describtion
   * Describtion of account
   * @param newVar the new value of describtion
   */
  private void setDescribtion (String newVar) {
    describtion = newVar;
  }

  /**
   * Get the value of describtion
   * Describtion of account
   * @return the value of describtion
   */
  private String getDescribtion () {
    return describtion;
  }

  /**
   * Set the value of sortingScore
   * Sorting score. Sort by BaseAccount.sortingScore asc then BaseAccount.name asc
   * @param newVar the new value of sortingScore
   */
  private void setSortingScore (int newVar) {
    sortingScore = newVar;
  }

  /**
   * Get the value of sortingScore
   * Sorting score. Sort by BaseAccount.sortingScore asc then BaseAccount.name asc
   * @return the value of sortingScore
   */
  private int getSortingScore () {
    return sortingScore;
  }

  /**
   * Set the value of isReported
   * Flag of including this account and transactions on it into reports
   * @param newVar the new value of isReported
   */
  private void setIsReported (boolean newVar) {
    isReported = newVar;
  }

  /**
   * Get the value of isReported
   * Flag of including this account and transactions on it into reports
   * @return the value of isReported
   */
  private boolean getIsReported () {
    return isReported;
  }

  /**
   * Set the value of isClosed
   * Closed/opened state of account
   * @param newVar the new value of isClosed
   */
  private void setIsClosed (boolean newVar) {
    isClosed = newVar;
  }

  /**
   * Get the value of isClosed
   * Closed/opened state of account
   * @return the value of isClosed
   */
  private boolean getIsClosed () {
    return isClosed;
  }

  //
  // Other methods
  //

}
