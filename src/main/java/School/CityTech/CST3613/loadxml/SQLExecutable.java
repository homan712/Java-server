package School.CityTech.CST3613.loadxml;

import java.sql.ResultSet;

public interface SQLExecutable <T> {
    T exec(ResultSet rs) throws Exception;

}
