package School.CityTech.CST3613.loadxml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SQLUtility {
    public static <T> List <T>  findAll(String sql, Connection pConn, SQLExecutable<T> sqlExecutable) {

        try(var conn = pConn;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            var list = new ArrayList<T>();
            while(rs.next()){
               T t =  sqlExecutable.exec(rs);
               list.add(t);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
