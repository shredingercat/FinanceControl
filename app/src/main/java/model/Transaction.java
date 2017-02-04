package model;
import java.util.Date;
import java.util.List;


/**
 * Class Transaction
 * Transaction class
 */
class Transaction {

  //
  // Fields
  //

  /**
   * Account of transaction
   */
  private model.BaseAccount account;
  /**
   * Contragent of transaction
   */
  private model.Contragent cortragent;
  /**
   * Currency of transaction
   */
  private model.Currency currency;
  /**
   * date of operation
   */
  private java.util.Date date;
  /**
   * Transaction's additional information.
   */
  private String comment;
  /**
   * List of splitting
   */

  private List<Split> splitting;
  
  //
  // Constructors
  //
  public Transaction () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of account
   * Account of transaction
   * @param newVar the new value of account
   */
  private void setAccount (model.BaseAccount newVar) {
    account = newVar;
  }

  /**
   * Get the value of account
   * Account of transaction
   * @return the value of account
   */
  private model.BaseAccount getAccount () {
    return account;
  }

  /**
   * Set the value of cortragent
   * Contragent of transaction
   * @param newVar the new value of cortragent
   */
  private void setCortragent (model.Contragent newVar) {
    cortragent = newVar;
  }

  /**
   * Get the value of cortragent
   * Contragent of transaction
   * @return the value of cortragent
   */
  private model.Contragent getCortragent () {
    return cortragent;
  }

  /**
   * Set the value of currency
   * Currency of transaction
   * @param newVar the new value of currency
   */
  private void setCurrency (model.Currency newVar) {
    currency = newVar;
  }

  /**
   * Get the value of currency
   * Currency of transaction
   * @return the value of currency
   */
  private model.Currency getCurrency () {
    return currency;
  }

  /**
   * Set the value of date
   * date of operation
   * @param newVar the new value of date
   */
  private void setDate (java.util.Date newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * date of operation
   * @return the value of date
   */
  private java.util.Date getDate () {
    return date;
  }

  /**
   * Set the value of comment
   * Transaction's additional information.
   * @param newVar the new value of comment
   */
  private void setComment (String newVar) {
    comment = newVar;
  }

  /**
   * Get the value of comment
   * Transaction's additional information.
   * @return the value of comment
   */
  private String getComment () {
    return comment;
  }

  /**
   * Set the value of splitting
   * List of splitting
   * @param newVar the new value of splitting
   */
  private void setSplitting (List<model.Split> newVar) {
    splitting = newVar;
  }

  /**
   * Get the value of splitting
   * List of splitting
   * @return the value of splitting
   */
  private List<model.Split> getSplitting () {
    return splitting;
  }

  //
  // Other methods
  //

}
