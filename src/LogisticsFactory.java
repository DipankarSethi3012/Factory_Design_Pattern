public class LogisticsFactory {

    private LogisticsFactory() {}

    private static class Holder {
        private static LogisticsFactory instance = new LogisticsFactory();
    }

    public static LogisticsFactory getInstance() {
        return Holder.instance;
    }

    public static Logistics getLogistics(String mode) {

        if(mode.equalsIgnoreCase("Air")) {
            return new Air();
        }
        else if (mode.equalsIgnoreCase("Road")) {
            return new Road();
        }

        throw new IllegalArgumentException("No such Modifier:" + mode);
    }
}
