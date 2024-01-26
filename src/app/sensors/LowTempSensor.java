package app.sensors;

import app.entity.Scientist;
import app.entity.Substance;

public class LowTempSensor extends Sensor {

    private final Scientist scientist;

    public LowTempSensor(Substance substance, Scientist scientist) {
        this.substance = substance;
        this.substance.attach(this);
        this.scientist = scientist;
    }

    @Override
    public void update() {

        System.out.printf("""
                  
                  Дослідник:     %s
                  
                  Речовина:      %s
                  Температура:  %d°C\s
                  Вага:          1 г\s
                  Індикатор:     \u26AA
                
                """, scientist.getScientistName(), substance.getSubstName(), substance.getTemp());

    }
}
