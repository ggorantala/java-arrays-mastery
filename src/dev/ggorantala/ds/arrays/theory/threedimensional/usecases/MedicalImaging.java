package dev.ggorantala.ds.arrays.theory.threedimensional.usecases;

import java.util.ArrayList;
import java.util.List;

public class MedicalImaging {
  // Structure: [x][y][z] representing voxels in 3D space
  private int[][][] scanData;

  public void findTumors(int threshold) {
    List<Point3D> suspiciousRegions = new ArrayList<>();

    for (int x = 1; x < scanData.length - 1; x++) {
      for (int y = 1; y < scanData[x].length - 1; y++) {
        for (int z = 1; z < scanData[x][y].length - 1; z++) {
          if (scanData[x][y][z] > threshold) {
            // Check neighboring voxels for cluster detection
            if (isCluster(x, y, z, threshold)) {
              suspiciousRegions.add(new Point3D(x, y, z));
            }
          }
        }
      }
    }
  }

  private boolean isCluster(int x, int y, int z, int threshold) {
    int highValueNeighbors = 0;

    // Check all 26 neighboring voxels
    for (int dx = -1; dx <= 1; dx++) {
      for (int dy = -1; dy <= 1; dy++) {
        for (int dz = -1; dz <= 1; dz++) {
          if (dx == 0 && dy == 0 && dz == 0) continue;

          if (scanData[x + dx][y + dy][z + dz] > threshold) {
            highValueNeighbors++;
          }
        }
      }
    }

    return highValueNeighbors >= 13; // At least half of neighbors
  }

  record Point3D(int x, int y, int z) {

    @Override
    public String toString() {
      return "Point3D(" + x + ", " + y + ", " + z + ")";
    }
  }
}
