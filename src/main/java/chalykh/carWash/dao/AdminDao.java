package chalykh.carWash.dao;

import chalykh.carWash.domain.Admin;

import java.util.List;

public interface AdminDao {

    public Admin getById(int id);
    public List<Admin> getAll();

}
