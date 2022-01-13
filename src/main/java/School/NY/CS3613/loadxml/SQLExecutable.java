package School.NY.CS3613.loadxml;

import java.sql.ResultSet;

public interface SQLExecutable <T> {
    T exec(ResultSet rs) throws Exception;

}
