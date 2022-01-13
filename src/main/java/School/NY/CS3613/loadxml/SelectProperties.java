package School.NY.CS3613.loadxml;

import java.util.List;

public class SelectProperties {
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
            List<Property> list = SQLUtility.findAll(sql, DBConnection.getConnection(),exec);
        return list;
    }
}
