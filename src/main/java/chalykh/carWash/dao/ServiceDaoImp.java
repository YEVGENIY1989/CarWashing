package chalykh.carWash.dao;

import chalykh.carWash.domain.ServiceCarWash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ServiceDaoImp implements ServiceDao{


    private final NamedParameterJdbcOperations jdbcOperations;

    @Autowired
    public ServiceDaoImp(NamedParameterJdbcOperations jdbcOperations){
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public void insertNewService(ServiceCarWash service) {

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("service", service.getCarWashService());
        params.addValue("cost", service.getCost());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String sqlInsert = "insert into service_list(service, cost)" +
                            "values(:service, :cost)";
        jdbcOperations.update(sqlInsert, params, keyHolder);

    }

    @Override
    public void deleteRowOfNewService(String nameOfService) {


        final Map<String, Object> params = new HashMap<>(1);
        params.put("service", nameOfService);

        String sqlCommand = "delete from service_list where service = :service";
        jdbcOperations.update(sqlCommand,params);

    }

    @Override
    public List<ServiceCarWash> getAll() {
        return null;
    }

    private static class ServiceMapper implements RowMapper<ServiceCarWash>{

        @Override
        public ServiceCarWash mapRow(ResultSet resultSet, int i) throws SQLException {

            int id = resultSet.getInt("id");
            int cost = resultSet.getInt("cost");
            String serviceName = resultSet.getString("service");
            ServiceCarWash service = new ServiceCarWash(serviceName, cost);
            return service;

        }
    }

}
