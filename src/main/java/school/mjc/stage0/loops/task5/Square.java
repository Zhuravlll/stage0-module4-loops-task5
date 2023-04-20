package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        int n = 8;
        for (int y = sideLength; y >= 1; y--) {
            for (int x = 1; x <= sideLength; x++) {
                if (((y == 1) || (y == sideLength)) && (x < sideLength)) {
                    System.out.print(n);
                }
                if ((x == 1) && ((y < sideLength) && (y > 1))) {
                    System.out.print(n);
                }
                if ((x == sideLength) && ((y <= sideLength) && (y >= 1))) {
                    System.out.println(n);
                }
                if ((x != 1) && (x != sideLength) && (y < sideLength) && (y > 1)) {
                    System.out.print(" ");
                }
            }
        }
    }
}