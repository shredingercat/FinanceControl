package model;
import java.util.Date;


/**
 * Class CurrencyJournal
 */
public class CurrencyJournal extends Entity {

  //
  // Fields
  //

  /**
   * Date of course
   */
  private java.util.Date date;
  /**
   * Currency from that transfers money
   */
  private model.Currency fromCurrency;
  /**
   * Currency in that transfers money
   */
  private model.Currency toCurrency;
  /**
   * Rate of transfer
   */
  private float rateValue;
  
  //
  // Constructors
  //
  public CurrencyJournal () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of date
   * Date of course
   * @param newVar the new value of date
   */
  private void setDate (java.util.Date newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * Date of course
   * @return the value of date
   */
  private java.util.Date getDate () {
    return date;
  }

  /**
   * Set the value of fromCurrency
   * Currency from that transfers money
   * @param newVar the new value of fromCurrency
   */
  private void setFromCurrency (model.Currency newVar) {
    fromCurrency = newVar;
  }

  /**
   * Get the value of fromCurrency
   * Currency from that transfers money
   * @return the value of fromCurrency
   */
  private model.Currency getFromCurrency () {
    return fromCurrency;
  }

  /**
   * Set the value of toCurrency
   * Currency in that transfers money
   * @param newVar the new value of toCurrency
   */
  private void setToCurrency (model.Currency newVar) {
    toCurrency = newVar;
  }

  /**
   * Get the value of toCurrency
   * Currency in that transfers money
   * @return the value of toCurrency
   */
  private model.Currency getToCurrency () {
    return toCurrency;
  }

  /**
   * Set the value of rateValue
   * Rate of transfer
   * @param newVar the new value of rateValue
   */
  private void setRateValue (float newVar) {
    rateValue = newVar;
  }

  /**
   * Get the value of rateValue
   * Rate of transfer
   * @return the value of rateValue
   */
  private float getRateValue () {
    return rateValue;
  }

  //
  // Other methods
  //

}
