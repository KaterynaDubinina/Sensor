package app.appOperator;

import app.entity.Scientist;
import app.entity.Substance;
import app.sensors.HighTempSensor;
import app.sensors.LowTempSensor;

public class SensorController {

    private final SensorView view = new SensorView();

    public void runApp() {
        int option;
        do {
            option = SensorView.getOption();
            switch (option) {
                case 1 -> {
                    String[] data = view.getData();
                    Scientist scientist = getScientist(data);
                    Substance substance = getSubstance(data);

                    int temp = Integer.parseInt(data[2]);
                    System.out.println("\n  \uD83C\uDF21\uFE0F Сенсор \uD83C\uDF21\uFE0F");

                    if (temp > 0) {
                        new HighTempSensor(substance, scientist);
                    } else {
                        new LowTempSensor(substance, scientist);
                    }

                    substance.setTemp(temp);
                }
                case 0 -> System.out.println("\u274E Додаток вимкнено успішно.");
                default -> System.out.println("\u274C   Невірна опція.\n\u2B07\uFE0F   Спробуйте ще.");
            }
        } while (option != 0);
        System.exit(0);
    }

    private static Scientist getScientist(String[] data) {
        return new Scientist(data[0]);
    }

    private static Substance getSubstance(String[] data) {
        return new Substance(data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]));
    }
}