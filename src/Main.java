public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        LogisticsService logisticsService = new LogisticsService();
        logisticsService.getLogistics("Air");
        logisticsService.getLogistics("Road");
        logisticsService.getLogistics("Water");
    }
}