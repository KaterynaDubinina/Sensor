package app.appOperator;

import java.util.Locale;
import java.util.Scanner;

public class SensorView {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getOption() {
        System.out.print("""
                
                \uD83D\uDDA5\uFE0F   Оберіть опцію:
                
                1\uFE0F\u20E3   Ввести показники.
                0\uFE0F\u20E3   Закрити додаток.
                
                """);
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public String[] getData() {
        scanner.useLocale(Locale.US);
        System.out.print("\nВведіть своє ім'я: ");
        String scientistName = scanner.nextLine();
        System.out.print("\nВведіть назву речовини: ");
        String substName = scanner.nextLine();
        System.out.print("Введіть температуру у °C: ");
        String temp = scanner.nextLine();
        System.out.print("Введіть вагу у грамах:    ");
        String weight = scanner.nextLine();
        return new String[]{scientistName, substName, temp, weight};
    }
}

