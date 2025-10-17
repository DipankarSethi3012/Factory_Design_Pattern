package Logistics;

public class LogisticsService {
//    private Logistics.LogisticsFactory logisticsFactory = Logistics.LogisticsFactory.getInstance();

    public void getLogistics(String mode) {
        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
    }

}
