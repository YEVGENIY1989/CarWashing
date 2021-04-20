package chalykh.carWash.dao;

import chalykh.carWash.domain.Admin;
import chalykh.carWash.domain.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AdminDaoImp implements AdminDao {

    private final NamedParameterJdbcOperations jdbcOperations;

    public AdminDaoImp(NamedParameterJdbcOperations jdbcOperations){

        this.jdbcOperations = jdbcOperations;

    }

    @Override
    public Admin getById(int id) {
        final Map<String, Object> params = new HashMap<>(1);
        params.put("id", id);
        String query = "select * from admins where id = :id";
        Admin admin = jdbcOperations.queryForObject(query, params, new AdminMapper());
        return admin;
    }

    @Override
    public List<Admin> getAll() {
        String sqlQuery = "select login, password from admins";
        return jdbcOperations.query(sqlQuery, new AdminMapper());

    }


    private static class AdminMapper implements RowMapper<Admin>{


        @Override
        public Admin mapRow(ResultSet resultSet, int i) throws SQLException {


            String login = resultSet.getString("login");
            String password = resultSet.getString("password");
            Admin admin = new Admin(login, password);


            return admin;
        }
    }

}
