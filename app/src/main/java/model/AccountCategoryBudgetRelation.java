package model;


/**
 * Class AccountCategoryBudgetRelation
 */
public class AccountCategoryBudgetRelation extends Entity {

  //
  // Fields
  //

  /**
   * Account of relation
   */
  private model.BaseAccount account;
  /**
   * Butget of relation
   */
  private model.Budget budget;
  /**
   * Category of relation
   */
  private model.Category category;
  
  //
  // Constructors
  //
  public AccountCategoryBudgetRelation () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of account
   * Account of relation
   * @param newVar the new value of account
   */
  private void setAccount (model.BaseAccount newVar) {
    account = newVar;
  }

  /**
   * Get the value of account
   * Account of relation
   * @return the value of account
   */
  private model.BaseAccount getAccount () {
    return account;
  }

  /**
   * Set the value of budget
   * Butget of relation
   * @param newVar the new value of budget
   */
  private void setBudget (model.Budget newVar) {
    budget = newVar;
  }

  /**
   * Get the value of budget
   * Butget of relation
   * @return the value of budget
   */
  private model.Budget getBudget () {
    return budget;
  }

  /**
   * Set the value of category
   * Category of relation
   * @param newVar the new value of category
   */
  private void setCategory (model.Category newVar) {
    category = newVar;
  }

  /**
   * Get the value of category
   * Category of relation
   * @return the value of category
   */
  private model.Category getCategory () {
    return category;
  }

  //
  // Other methods
  //

}
