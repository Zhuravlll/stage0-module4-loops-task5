package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int rowLength = height;
        int resolution = (height - 1 % 2 == 0) ? 1 : 2;
        int count = 1;
        int reverseCount = height;
        int spaces = 0;
        for (int i = 0; i < height; i++) {

            if (rowLength == height) {
                printRow(rowLength, spaces);
                rowLength = rowLength - resolution;
                spaces++;
            } else {
                printRow(rowLength, spaces);
                int k = reverseCount - count;
                if (k > 1) {
                    rowLength = rowLength - resolution;
                    spaces++;
                }
                if (k <= 0) {
                    rowLength = rowLength + resolution;
                    spaces--;
                }
            }

            count++;
            reverseCount--;
            System.out.println();
        }
    }

    private void printRow(int a, int spaces) {
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }
        for (int j = 0; j < a; j++) {
            System.out.print("8");
        }
        for (int s = 0; s < spaces; s++) {
            System.out.print(" ");
        }
    }
}