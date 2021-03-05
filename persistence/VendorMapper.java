package com.hexaware.MLP335.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.MLP335.model.Vendor;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * VendorMapper class used to fetch Vendor data from database.
 * @author hexware
 */
public class VendorMapper implements ResultSetMapper<Vendor> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Vendor map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
    return new Vendor(rs.getString("VEN_ID"), rs.getString("VEN_NAME"), rs.getString("CUS_ID"));
  }
}