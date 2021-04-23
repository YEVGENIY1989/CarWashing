package chalykh.carWash.domain;

public class Client {

    private int id;
    private String timeOfService;
    private String typeOfService;
    private String dateOfService;


    public Client(String timeOfService, String typeOfService, String dateOfService) {
        this.timeOfService = timeOfService;
        this.typeOfService = typeOfService;
        this.dateOfService = dateOfService;
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

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(String dateOfService) {
        this.dateOfService = dateOfService;
    }
}
