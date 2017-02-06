package model;


/**
 * Class User
 */
public class User {

  //
  // Fields
  //

  /**
   * Nickname of user
   */
  private String nickname;
  /**
   * Hash of password
   */
  private String passwordhash;
  /**
   * Currency of account
   */
  private model.Currency homeCurrency;
  
  //
  // Constructors
  //
  public User () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nickname
   * Nickname of user
   * @param newVar the new value of nickname
   */
  private void setNickname (String newVar) {
    nickname = newVar;
  }

  /**
   * Get the value of nickname
   * Nickname of user
   * @return the value of nickname
   */
  private String getNickname () {
    return nickname;
  }

  /**
   * Set the value of passwordhash
   * Hash of password
   * @param newVar the new value of passwordhash
   */
  private void setPasswordhash (String newVar) {
    passwordhash = newVar;
  }

  /**
   * Get the value of passwordhash
   * Hash of password
   * @return the value of passwordhash
   */
  private String getPasswordhash () {
    return passwordhash;
  }

  /**
   * Set the value of homeCurrency
   * Currency of account
   * @param newVar the new value of homeCurrency
   */
  private void setHomeCurrency (model.Currency newVar) {
    homeCurrency = newVar;
  }

  /**
   * Get the value of homeCurrency
   * Currency of account
   * @return the value of homeCurrency
   */
  private model.Currency getHomeCurrency () {
    return homeCurrency;
  }

  //
  // Other methods
  //

}
