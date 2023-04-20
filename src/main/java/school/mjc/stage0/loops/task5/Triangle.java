package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int a, b;
        for(a = 0; a < cathetusLength; a++) {
            for(b = 0; b <= a; b++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}