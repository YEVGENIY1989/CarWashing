package chalykh.carWash.dao;

import chalykh.carWash.domain.ServiceCarWash;

import java.util.List;

public interface ServiceDao {

    public void insertNewService(ServiceCarWash service);
    public void deleteRowOfNewService(String nameOfService);
    public List<ServiceCarWash> getAll();

}
