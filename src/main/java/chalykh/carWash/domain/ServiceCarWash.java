package chalykh.carWash.domain;

public class ServiceCarWash {

    private int id;
    private String carWashService;
    private int cost;

    public ServiceCarWash( String carWashService, int cost ) {
        this.carWashService = carWashService;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarWashService() {
        return carWashService;
    }

    public void setCarWashService(String carWashService) {
        this.carWashService = carWashService;
    }
}
