package com.hexaware.MLP335.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.nio.FloatBuffer;
import java.util.List;
import com.hexaware.MLP335.model.Menu;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface MenuDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu")
    @Mapper(MenuMapper.class)
    List<Menu> show();

    @SqlQuery("Select * from Menu where FOOD_ID=:FOOD_ID")
    @Mapper(MenuMapper.class)
    List<Menu> showspecific(@Bind("FOOD_ID")int FOOD_ID);

  @SqlUpdate("INSERT INTO Menu (FOOD_ID,ITEM_NAME,FOOD_PRICE) values (:FOOD_ID, :ITEM_NAME, :FOOD_PRICE)")
  void insert(@Bind("FOOD_ID")int FOOD_ID, @Bind("ITEM_NAME")String ITEM_NAME, @Bind("FOOD_PRICE")float FOOD_PRICE);

  @SqlUpdate("UPDATE Menu SET ITEM_NAME = :ITEM_NAME, FOOD_PRICE = :FOOD_PRICE WHERE FOOD_ID = :FOOD_ID")
  void update(@Bind("FOOD_ID")int FOOD_ID, @Bind("ITEM_NAME")String ITEM_NAME, @Bind("FOOD_PRICE")float FOOD_PRICE);

  @SqlUpdate("DELETE FROM Menu WHERE FOOD_ID = :FOOD_ID")
  void delete(@Bind("FOOD_ID")int FOOD_ID);  
}