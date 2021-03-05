package com.hexaware.MLP335.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
/**
 * FOOD_ID to store FOOD_ID.
 */
  private String FOOD_ID;
  private String ITEM_NAME;
  private int FOOD_PRICE;

  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param FOOD_ID to initialize food id.
 * used to get details through constructor.
 */
  public Menu(final String FOOD_ID,final String ITEM_NAME,final int FOOD_PRICE) {

    this.FOOD_ID = FOOD_ID;
    this.ITEM_NAME=ITEM_NAME;
    this.FOOD_PRICE=FOOD_PRICE;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu menu = (Menu) obj;
    if (Objects.equals(FOOD_ID, menu.FOOD_ID)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(FOOD_ID);
  }
    /**
     * @return this food ID.
     */
  public final String getFOOD_ID() {
    return FOOD_ID;
  }
  public final String getITEM_NAME() {
    return ITEM_NAME;
  }
  public final int getFOOD_PRICE() {
    return FOOD_PRICE;
  }
    /**
     * @param FOOD_ID gets the food id.
     */
  public final void setFOOD_ID(final String FOOD_ID) {
    this.FOOD_ID = FOOD_ID;
  }
  public final void setITEM_NAME(final String ITEM_NAME) {
    this.ITEM_NAME = ITEM_NAME;
  }
  public final void setFoddPrice(final int FOOD_PRICE) {
    this.FOOD_PRICE = FOOD_PRICE;
  }
}