package dao;

import dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mangs on 17. 2. 2.
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate template;

    public List<User> getUserAllList() {
        String query = "SELECT user_id, user_email, user_name FROM user";
        return template.query(query, new UserRowMapper());
    }

    public User getUserInfo(String email) {
        String query = "SELECT user_id, user_email, user_name FROM user WHERE user_email = ?";

        try {
            return template.queryForObject(query, new Object[]{email}, new UserRowMapper());
        }
        catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
