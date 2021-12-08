package School.CityTech.CST3613.loadxml;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static School.CityTech.CST3613.loadxml.DBConnection.*;
public class SelectProperties {
    public static List<Property> findAll() {
        String sql = "select * from Properties";
        try(var conn = getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            var list = new ArrayList<Property>();
            while(rs.next()){
                //System.out.format("id: %s cost: %s downPayment: %s state: %s percentage: %s netIncome: %s \n"
                var property = new Property(
                         rs.getString("id")
                        , rs.getFloat("cost")
                        ,rs.getFloat("downPayment")
                        , rs.getString("state")
                        , rs.getFloat("percentage")
                        ,rs.getFloat("netIncome"));
                list.add(property);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
