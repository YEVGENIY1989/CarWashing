package chalykh.carWash.domain;

public class Client {

    private int id;
    private String timeOfService;
    private ServiceCarWash typeOfService;
    private String dateOfService;


    public Client(String timeOfService, String dateOfService) {
        this.timeOfService = timeOfService;
        this.dateOfService = dateOfService;
    }

    public ServiceCarWash getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(ServiceCarWash typeOfService) {
        this.typeOfService = typeOfService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeOfService() {
        return timeOfService;
    }

    public void setTimeOfService(String timeOfService) {
        this.timeOfService = timeOfService;
    }



    public String getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(String dateOfService) {
        this.dateOfService = dateOfService;
    }

    @Override
    public String toString() {
        return "Client{" +
                "timeOfService='" + timeOfService + '\'' +
                ", dateOfService='" + dateOfService + '\'' +
                '}';
    }
}
