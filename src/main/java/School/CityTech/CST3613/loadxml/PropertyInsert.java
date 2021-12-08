package School.CityTech.CST3613.loadxml;

import java.util.List;

public class PropertyInsert {
    //final means no one can change it by mistake from other code.
    private static final String SQL_INSERT = """
            INSERT INTO Properties (id,cost,downPayment,state,percentage,netIncome)
            VALUES (?, ? ,?, ?, ?, ?)
            """;

    public static void process (List<Property> propertyList){
        try (var conn = DBConnection.getConnection();
             var ps = conn.prepareStatement(SQL_INSERT);
        ){
            for(var row: propertyList){
                ps.setString(1, row.getId());
                ps.setFloat(2, row.getCost());
                ps.setFloat(3, row.getDownPayment());
                ps.setString(4, row.getState());
                ps.setFloat(5, row.getPercentage());
                ps.setFloat(6, row.getNetIncome());
                System.out.println(row);
                ps.executeUpdate();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
