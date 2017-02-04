package model;
import java.util.Date;


/**
 * Class Transfer
 * Transfer class
 */
public class Transfer {

  //
  // Fields
  //

  /**
   * Date of transfer
   */
  private java.util.Date date;
  /**
   * Account from that transfer money
   */
  private model.BaseAccount fromAccount;
  /**
   * Account to recieve money
   */
  private model.BaseAccount toAccount;
  /**
   * How much money transfers from model.Transfer.fromAccount
   */
  private float fromAccountMoneyValue = .0f;
  /**
   * How much money transfers to model.Transfer.toAccount
   */
  private float toAoountMoneyValue = .0f;
  /**
   * course of this transfer
   */
  private float operationCourse;
  /**
   * Additional info of this transfer
   */
  private String comment;
  
  //
  // Constructors
  //
  public Transfer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of date
   * Date of transfer
   * @param newVar the new value of date
   */
  private void setDate (java.util.Date newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * Date of transfer
   * @return the value of date
   */
  private java.util.Date getDate () {
    return date;
  }

  /**
   * Set the value of fromAccount
   * Account from that transfer money
   * @param newVar the new value of fromAccount
   */
  private void setFromAccount (model.BaseAccount newVar) {
    fromAccount = newVar;
  }

  /**
   * Get the value of fromAccount
   * Account from that transfer money
   * @return the value of fromAccount
   */
  private model.BaseAccount getFromAccount () {
    return fromAccount;
  }

  /**
   * Set the value of toAccount
   * Account to recieve money
   * @param newVar the new value of toAccount
   */
  private void setToAccount (model.BaseAccount newVar) {
    toAccount = newVar;
  }

  /**
   * Get the value of toAccount
   * Account to recieve money
   * @return the value of toAccount
   */
  private model.BaseAccount getToAccount () {
    return toAccount;
  }

  /**
   * Set the value of fromAccountMoneyValue
   * How much money transfers from model.Transfer.fromAccount
   * @param newVar the new value of fromAccountMoneyValue
   */
  private void setFromAccountMoneyValue (float newVar) {
    fromAccountMoneyValue = newVar;
  }

  /**
   * Get the value of fromAccountMoneyValue
   * How much money transfers from model.Transfer.fromAccount
   * @return the value of fromAccountMoneyValue
   */
  private float getFromAccountMoneyValue () {
    return fromAccountMoneyValue;
  }

  /**
   * Set the value of toAoountMoneyValue
   * How much money transfers to model.Transfer.toAccount
   * @param newVar the new value of toAoountMoneyValue
   */
  private void setToAoountMoneyValue (float newVar) {
    toAoountMoneyValue = newVar;
  }

  /**
   * Get the value of toAoountMoneyValue
   * How much money transfers to model.Transfer.toAccount
   * @return the value of toAoountMoneyValue
   */
  private float getToAoountMoneyValue () {
    return toAoountMoneyValue;
  }

  /**
   * Set the value of operationCourse
   * course of this transfer
   * @param newVar the new value of operationCourse
   */
  private void setOperationCourse (float newVar) {
    operationCourse = newVar;
  }

  /**
   * Get the value of operationCourse
   * course of this transfer
   * @return the value of operationCourse
   */
  private float getOperationCourse () {
    return operationCourse;
  }

  /**
   * Set the value of comment
   * Additional info of this transfer
   * @param newVar the new value of comment
   */
  private void setComment (String newVar) {
    comment = newVar;
  }

  /**
   * Get the value of comment
   * Additional info of this transfer
   * @return the value of comment
   */
  private String getComment () {
    return comment;
  }

  //
  // Other methods
  //

}
