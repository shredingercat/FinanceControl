package model;

import java.util.*;


/**
 * Class Entity
 */
abstract public class Entity {

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

  /**
   * Clone object
   * @return       model.Entity
   */
  public model.Entity clone()
  {
    model.Entity clone = null;

    return clone;
  }


  /**
   * @return       UUID
   */
  private static UUID generateUUID()
  {
    return UUID.randomUUID();
  }


}
