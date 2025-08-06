package dev.ggorantala.ds.arrays.theory.threedimensional.usecases;

public class ClimateDataAnalyzer {
  // Structure: [latitude][longitude][timeIndex]
  private double[][][] temperatureData;

  public double calculateRegionalAverage(
      int latStart, int latEnd, int lonStart, int lonEnd, int timeIndex) {
    double sum = 0;
    int count = 0;

    for (int lat = latStart; lat <= latEnd; lat++) {
      for (int lon = lonStart; lon <= lonEnd; lon++) {
        sum += temperatureData[lat][lon][timeIndex];
        count++;
      }
    }

    return sum / count;
  }

  public void identifyHeatWaves() {
    int timePeriods = temperatureData[0][0].length;

    for (int t = 1; t < timePeriods - 1; t++) {
      for (int lat = 0; lat < temperatureData.length; lat++) {
        for (int lon = 0; lon < temperatureData[lat].length; lon++) {
          double current = temperatureData[lat][lon][t];
          double previous = temperatureData[lat][lon][t - 1];
          double next = temperatureData[lat][lon][t + 1];

          if (current > 35 && previous > 35 && next > 35) {
            System.out.printf("Heat wave detected at [%d,%d] time %d\n", lat, lon, t);
          }
        }
      }
    }
  }
}
