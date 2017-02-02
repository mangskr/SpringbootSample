package dao;

import dto.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by mangs on 17. 2. 2.
 */
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();

        user.setUserId(rs.getLong("user_id"));
        user.setUserEmail(rs.getString("user_email"));
        user.setUserName(rs.getString("user_name"));

        return user;
    }
}
