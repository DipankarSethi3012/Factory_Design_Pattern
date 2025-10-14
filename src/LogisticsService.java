public class LogisticsService {
//    private LogisticsFactory logisticsFactory = LogisticsFactory.getInstance();

    public void getLogistics(String mode) {
        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
    }

}
