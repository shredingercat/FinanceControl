package model;

import java.util.*;


/**
 * Class EntityManager
 * (Dickhead in past.) Manage data store.
 */
abstract public class EntityManager<T extends model.Entity> {

  //
  // Fields
  //

  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   * Set attribute or field
   * @param        fieldName Name of field
   * @param        value Value of field
   */
  public static void set(String fieldName, Object value)
  {
  }


  /**
   * Get value of field
   * @return       Object
   * @param        fieldName Name of field
   */
  public static Object get(String fieldName)
  {
    return null;
  }


  /**
   * Add entity of generic type into database
   * @param        obj Some strange object
   */
  public void add( T  obj)
  {
  }


}
