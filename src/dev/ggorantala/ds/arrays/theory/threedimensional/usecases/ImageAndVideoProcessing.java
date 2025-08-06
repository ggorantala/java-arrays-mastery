package dev.ggorantala.ds.arrays.theory.threedimensional.usecases;

public class ImageAndVideoProcessing {
  // Structure: [width][height][colorChannel]
  private int[][][] imageData;

  public void convertToGrayscale(int[][][] colorImage) {
    int width = colorImage.length;
    int height = colorImage[0].length;

    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        // Extract RGB values
        int r = colorImage[x][y][0];
        int g = colorImage[x][y][1];
        int b = colorImage[x][y][2];

        // Calculate grayscale value
        int gray = (int) (0.299 * r + 0.587 * g + 0.114 * b);

        // Apply to all channels
        colorImage[x][y][0] = gray;
        colorImage[x][y][1] = gray;
        colorImage[x][y][2] = gray;
      }
    }
  }
}
