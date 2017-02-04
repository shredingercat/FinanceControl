package model;


/**
 * Class Contragent
 */
public class Contragent {

  //
  // Fields
  //

  /**
   * Name of contragent
   */
  private String name;
  /**
   * Identification number of contragetn (INN, etc)
   */
  private String identNo;
  
  //
  // Constructors
  //
  public Contragent () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * Name of contragent
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * Name of contragent
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of identNo
   * Identification number of contragetn (INN, etc)
   * @param newVar the new value of identNo
   */
  private void setIdentNo (String newVar) {
    identNo = newVar;
  }

  /**
   * Get the value of identNo
   * Identification number of contragetn (INN, etc)
   * @return the value of identNo
   */
  private String getIdentNo () {
    return identNo;
  }

  //
  // Other methods
  //

}
