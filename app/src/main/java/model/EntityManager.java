package model;

import java.util.*;


/**
 * Class EntityManager
 * (Dickhead in past.) Manage data store.
 */
public class EntityManager {

  //
  // Fields
  //

  static private model.DB db;
  
  //
  // Constructors
  //
  public EntityManager () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Get the value of db
   * @return the value of db
   */
  private model.DB getDb () {
    return db;
  }

  //
  // Other methods
  //

  /**
   * Get all pairs name-value of object.
   * @return       Map<String, Object>
   */
  public static Map<String, Object> get()
  {
    return null;
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
   * Set pairs name-value of object
   * @param        fields Set pairs name-value of object.
   */
  public static void set(Map<String, Object> fields)
  {
  }


  /**
   * Set value or field
   * @param        fieldName Name of field
   * @param        value Value of field
   */
  public static void set(String fieldName, Object value)
  {
  }


  /**
   * Add/edit object of generic type into database
   * @param        obj
   */
  public static void save(model.Entity obj)
  {
  }


  /**
   * Add/edit objects of generic type into database
   * @param        save
   */
  public static void save(Map<Long, Entity> save)
  {
  }


  /**
   * Remove object from database
   * @param        id Identificator of database object
   */
  public static void delete(Long id)
  {
  }


  /**
   * Remove objects from database by IDs
   * @param        ids
   */
  public static void delete(List<Long> ids)
  {
  }


}
