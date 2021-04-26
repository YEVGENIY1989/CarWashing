package chalykh.carWash.dao;


import chalykh.carWash.domain.Client;
import chalykh.carWash.domain.ServiceCarWash;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {

    private final NamedParameterJdbcOperations jdbcOperations;

    public ClientDaoImpl(NamedParameterJdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    public void insertNewClient() {

    }


    @Override
    public List<Client> getAll() {
        String sqlCommand = "select timeOfService, dataOfService from client";
        List<Client> clientList = jdbcOperations.query(sqlCommand, new ClientMapper());
        return clientList;
    }


    private static class ClientMapper implements RowMapper<Client>{

        @Override
        public Client mapRow(ResultSet resultSet, int i) throws SQLException {

            String date = resultSet.getString("dataOfService");
            String time = resultSet.getString("timeOfService");
            Client client = new Client(time, date);

            return client;
        }
    }


}
