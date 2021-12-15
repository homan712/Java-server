package School.CityTech.CST3613.piechart;

import School.CityTech.CST3613.loadxml.Property;
import School.CityTech.CST3613.loadxml.SQLExecutable;
import School.CityTech.CST3613.loadxml.SQLUtility;


import java.util.List;

import static School.CityTech.CST3613.loadxml.DBConnection.getConnection;

public class GroupByStateDAO {

    public static List<GroupByState> findAll(){
        String SQL = """
                select state, count(state) as stateCount, sum(netIncome) as sumOfNetIncome
                from properties group by state
                """;

        SQLExecutable<GroupByState> exec = rs -> {
            var groupByState = new GroupByState(
                    rs.getString("state")
                    , rs.getFloat("stateCount")
                    ,rs.getFloat("sumOfNetIncome")
            );

            return groupByState;
        };

        List<GroupByState> list = SQLUtility.findAll(SQL, getConnection(),exec);
        return list;
    }
}
