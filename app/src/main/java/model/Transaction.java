package model;
import java.util.Date;


/**
 * Class Transaction
 * Transaction class
 */
class Transaction {

  //
  // Fields
  //

  /**
   * Contragent of transaction
   */
  private model.Contragent cortragent;
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
  private java.util.List<model.Split> splitting;
  /**
   * Income saldo of account
   */
  private float incomeSaldo = .0f;
  
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
  private void setSplitting (java.util.List<model.Split> newVar) {
    splitting = newVar;
  }

  /**
   * Get the value of splitting
   * List of splitting
   * @return the value of splitting
   */
  private java.util.List<model.Split> getSplitting () {
    return splitting;
  }

  /**
   * Set the value of incomeSaldo
   * Income saldo of account
   * @param newVar the new value of incomeSaldo
   */
  private void setIncomeSaldo (float newVar) {
    incomeSaldo = newVar;
  }

  /**
   * Get the value of incomeSaldo
   * Income saldo of account
   * @return the value of incomeSaldo
   */
  private float getIncomeSaldo () {
    return incomeSaldo;
  }

  //
  // Other methods
  //

}
