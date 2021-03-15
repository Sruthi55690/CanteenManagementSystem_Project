package com.hexaware.MLP335.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP335.model.Orders;
import java.time.LocalDate;

/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface OrdersDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Orders")
    @Mapper(OrdersMapper.class)
    List<Orders> show();

    
    @SqlUpdate("INSERT INTO Orders (ORD_ID,ORD_DATE,FOOD_ID,CUS_ID,PRICE) values (:ORD_ID, :ORD_DATE, :FOOD_ID, :CUS_ID, :PRICE)")
    void insert(@Bind("ORD_ID")int ORD_ID, @Bind("ORD_DATE")LocalDate ORD_DATE, @Bind("FOOD_ID") int FOOD_ID ,@Bind("CUS_ID")int CUS_ID,@Bind("PRICE")float PRICE);

    @SqlUpdate("UPDATE Orders SET ORD_DATE = :ORD_DATE, CUS_ID = :CUS_ID WHERE ORD_ID = :ORD_ID")
    void update(@Bind("ORD_ID")int ORD_ID, @Bind("ORD_DATE")LocalDate ORD_DATE, @Bind("FOOD_ID")int FOOD_ID ,@Bind("CUS_ID") int CUS_ID, @Bind("PRICE")float PRICE);

    @SqlUpdate("DELETE FROM Orders WHERE ORD_ID = :ORD_ID")
    void delete(@Bind("ORD_ID")int ORD_ID);  

 
}