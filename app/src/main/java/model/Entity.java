package model;

import java.util.*;


/**
 * Class Entity
 */
public abstract class Entity {

  //
  // Fields
  //

  /**
   * identificator
   */
  private long id;
  
  //
  // Constructors
  //
  public Entity () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * identificator
   * @param newVar the new value of id
   */
  private void setId (long newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * identificator
   * @return the value of id
   */
  private long getId () {
    return id;
  }

  //
  // Other methods
  //

}
