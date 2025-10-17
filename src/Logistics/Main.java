package Logistics;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        LogisticsService logisticsService = new LogisticsService();
        logisticsService.getLogistics("Logistics.Air");
        logisticsService.getLogistics("Logistics.Road");
        logisticsService.getLogistics("Water");
    }
}