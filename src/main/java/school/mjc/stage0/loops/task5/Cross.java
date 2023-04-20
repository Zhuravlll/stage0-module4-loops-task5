package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int y = sideLength / 2; y >= - (sideLength / 2); y--) {
            for (int x = - (sideLength / 2); x <= sideLength / 2; x++) {
                if (sideLength == 0) {
                    break;
                }
                if ((x != 0) && (y != 0)) {
                    System.out.print(" ");
                }
                if (x == 0) {
                    System.out.print("8");
                }
                if ((y == 0) && (x < sideLength / 2)) {
                    System.out.print("8");
                }
                if (x == sideLength/2) {
                    System.out.print("\n");
                }
            }
        }
    }
}
