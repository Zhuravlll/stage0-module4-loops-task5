package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        int n = 8;
        for (int y = height; y >= 1; y--) {
            for (int x = 1; x <= length; x++) {
                if (((y == 1) || (y == height)) && (x < length)) {
                    System.out.print(n);
                }
                if ((x == 1) && ((y < height) && (y > 1))) {
                    System.out.print(n);
                }
                if ((x == length) && ((y <= height) && (y >= 1))) {
                    System.out.println(n);
                }
                if ((x != 1) && (x != length) && (y < height) && (y > 1)) {
                    System.out.print(" ");
                }
            }
        }
    }
}
