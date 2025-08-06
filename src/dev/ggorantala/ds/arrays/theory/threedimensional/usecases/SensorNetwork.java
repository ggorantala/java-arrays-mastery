package dev.ggorantala.ds.arrays.theory.threedimensional.usecases;

public class SensorNetwork {
    private static final int TEMPERATURE = 0;
    private static final int HUMIDITY = 1;
    private static final int PRESSURE = 2;
    // Structure: [sensorId][timeSlot][metricType]
    private double[][][] sensorReadings;

    public void detectAnomalies(int sensorId) {
        int timeSlots = sensorReadings[sensorId].length;

        for (int t = 1; t < timeSlots; t++) {
            double tempChange = Math.abs(
                sensorReadings[sensorId][t][TEMPERATURE] -
                    sensorReadings[sensorId][t-1][TEMPERATURE]
            );

            if (tempChange > 10) {
                System.out.printf("Temperature anomaly detected at sensor %d, time %d\n",
                    sensorId, t);
            }
        }
    }
}