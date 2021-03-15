package com.hexaware.MLP335.persistence;
//import java.lang.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.MLP335.model.Orders;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
import java.time.LocalDate;
/**
 * OrdersMapper class used to fetch Orders data from database.
 * @author hexware
 */
public class OrdersMapper implements ResultSetMapper<Orders> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Orders map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
    return new Orders(rs.getInt("ORD_ID"), rs.getDate("ORD_DATE").toLocalDate(), rs.getInt("FOOD_ID"), rs.getInt("CUS_ID"), rs.getFloat("PRICE"));
  }
}