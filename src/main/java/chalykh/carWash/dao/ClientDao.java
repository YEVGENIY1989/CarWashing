package chalykh.carWash.dao;

import chalykh.carWash.domain.Client;

import java.util.List;

public interface ClientDao {

    public void insertNewClient();
    public List<Client> getAll();

}
