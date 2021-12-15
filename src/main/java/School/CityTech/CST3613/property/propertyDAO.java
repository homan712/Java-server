package School.CityTech.CST3613.property;

import School.CityTech.CST3613.loadxml.Property;
import School.CityTech.CST3613.loadxml.SQLExecutable;
import School.CityTech.CST3613.loadxml.SQLUtility;

import java.util.List;

import static School.CityTech.CST3613.loadxml.DBConnection.getConnection;

public class propertyDAO {
    final static String sql = "select * from Properties";
    public static List<Property> findAll(){
        SQLExecutable<Property> exec = rs -> {
            var property = new Property(
                    rs.getString("id")
                    , rs.getFloat("cost")
                    ,rs.getFloat("downPayment")
                    , rs.getString("state")
                    , rs.getFloat("percentage")
                    ,rs.getFloat("netIncome"));
            return property;
        };
        List<Property> list = SQLUtility.findAll(sql, getConnection(),exec);
    return list;
}
}
