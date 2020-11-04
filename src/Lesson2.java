import java.util.Scanner;

// TODO, lisa siia klassi eelmises tunnis tehtud abs() meetod
// TODO anna konsoolilt sisseloetud number funktsioonile ette ja prindi välja väljund
public class Lesson2 {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        //System.out.println(abs(n));
        //calculateArray(7);
        //reverseOrder();
        multiplyingTable(6, 7);
    }

    // Leia arvu absoluutväärtus
    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    private static void sampleTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // TODO prindi välja x esimest paaris arvu
    // Näide:
    // Sisend 5
    // Väljund 2 4 6 8 10
    private static void calculateArray(int x) {
        for (int i = 2; i <= x * 2; i = i + 2) {
            System.out.println(i);
        }
    }

    // TODO loe konsoolist sisse 10 täisarvu
    // TODO trüki varem sisestatud arvud välja vastupidises järjekorras
    private static void reverseOrder() {
        Scanner scanner = new Scanner(System.in);
        int[] jada = new int[4];
        for (int i = 0; i < jada.length; i++) {
            jada[i] = scanner.nextInt();
        }
        for (int i = 3; i >= 0; i = i - 1) {
            System.out.println(jada[i]);
        }
    }

    // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrg
    // näiteks x = 3 y = 3
    // väljund:
    // 1 2 3
    // 2 4 6
    // 3 6 9
    private static void multiplyingTable(int x, int y) {
        for (int e = 1; e <= y; e++) {
            for (int i = 1; i <= x; i++) {
                System.out.print(i * e + " ");
            }
            System.out.println();
        }
    }
}
