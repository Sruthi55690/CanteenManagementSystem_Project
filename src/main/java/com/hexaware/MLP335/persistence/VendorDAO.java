package com.hexaware.MLP335.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP335.model.Vendor;

/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface VendorDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Vendor")
    @Mapper(VendorMapper.class)
    List<Vendor> show();

  @SqlUpdate("INSERT INTO Vendor (VEN_ID,VEN_NAME,CUS_ID) values (:VEN_ID, :VEN_NAME, :CUS_ID)")
  void insert(@Bind("VEN_ID")int VEN_ID, @Bind("VEN_NAME")String VEN_NAME, @Bind("CUS_ID") int CUS_ID);

  @SqlUpdate("UPDATE Vendor SET VEN_NAME = :VEN_NAME, percent = :percentage,CUS_ID = :CUS_ID WHERE VEN_ID = :VEN_ID")
  void update(@Bind("VEN_ID")int VEN_ID, @Bind("VEN_NAME")String VEN_NAME, @Bind("CUS_ID") int CUS_ID);

  @SqlUpdate("DELETE FROM Vendor WHERE VEN_ID = :VEN_ID")
  void delete(@Bind("VEN_ID")int VEN_ID);  
}