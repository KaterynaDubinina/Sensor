package app;

import app.appOperator.SensorController;

public class App {

    public static void main(String[] args) {
        SensorController controller = new SensorController();
        System.out.println("\uD83D\uDCC8   Це додаток для контролю стану речовин.");
        controller.runApp();
    }
}



