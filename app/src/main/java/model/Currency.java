package model;


/**
 * Class Currency
 * Currency class
 */
public class Currency {

  //
  // Fields
  //

  /**
   * Name of currency
   */
  private String name;
  /**
   * ISO 4217 code
   */
  private String ISOCode;
  /**
   * Currency simbol
   */
  private String symbol;
  /**
   * Frequency digits count
   */
  private int freqCount = 2;
  /**
   * Frequency sign
   */
  private String commaSign = ".";
  /**
   * Group delimiter
   */
  private String groupSign = " ";
  
  //
  // Constructors
  //
  public Currency () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * Name of currency
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * Name of currency
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of ISOCode
   * ISO 4217 code
   * @param newVar the new value of ISOCode
   */
  private void setISOCode (String newVar) {
    ISOCode = newVar;
  }

  /**
   * Get the value of ISOCode
   * ISO 4217 code
   * @return the value of ISOCode
   */
  private String getISOCode () {
    return ISOCode;
  }

  /**
   * Set the value of symbol
   * Currency simbol
   * @param newVar the new value of symbol
   */
  private void setSymbol (String newVar) {
    symbol = newVar;
  }

  /**
   * Get the value of symbol
   * Currency simbol
   * @return the value of symbol
   */
  private String getSymbol () {
    return symbol;
  }

  /**
   * Set the value of freqCount
   * Frequency digits count
   * @param newVar the new value of freqCount
   */
  private void setFreqCount (int newVar) {
    freqCount = newVar;
  }

  /**
   * Get the value of freqCount
   * Frequency digits count
   * @return the value of freqCount
   */
  private int getFreqCount () {
    return freqCount;
  }

  /**
   * Set the value of commaSign
   * Frequency sign
   * @param newVar the new value of commaSign
   */
  private void setCommaSign (String newVar) {
    commaSign = newVar;
  }

  /**
   * Get the value of commaSign
   * Frequency sign
   * @return the value of commaSign
   */
  private String getCommaSign () {
    return commaSign;
  }

  /**
   * Set the value of groupSign
   * Group delimiter
   * @param newVar the new value of groupSign
   */
  private void setGroupSign (String newVar) {
    groupSign = newVar;
  }

  /**
   * Get the value of groupSign
   * Group delimiter
   * @return the value of groupSign
   */
  private String getGroupSign () {
    return groupSign;
  }

  //
  // Other methods
  //

}
