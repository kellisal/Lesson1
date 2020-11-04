import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("fib: " + fibonacci1(6));
        System.out.println(fib2(5));
        //System.out.println(sum(5));
        readFromFile();
    }

    // TODO
    // Fibonacci arv on defineeritud kui
    // fib(n) = fib(n-1) + fib(n-2)
    // Näiteks: 0 1 1 2 3 5 8 13 ...
    // leia nii mitmes arv fibonacci jadas
    // lahenda iteratiivselt
    private static int fibonacci1(int nr) {
        int fib[] = new int[nr];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < nr; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println(fib[i]);
        }
        return fib[nr - 1];
    }

    /*private static int sum(int x) {
        int e = 1;
        for (int i = 0; i <= x; i++) {
            e += i;
            System.out.println(e);
        }
        return e;
    }*/

    // TODO
    // leia nii mitmes arv fibonacci jadas
    // lahenda rekursiivselt
    private static int fib2(int nr) {
        if (nr <= 0) {
            return 0;
        } else if (nr == 1) {
            return 1;
        } else {
            return fib2(nr - 2) + fib2(nr - 1);
        }
    }


    // TODO Prindi välja faili iga teine täht
    public static void readFromFile() throws FileNotFoundException {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }

    // TODO tagasta sisestatud String s tagurpidi
    // Näiteks
    // Sisend = "Tere" / Väljund = "ereT"
    public String reverse(String s) {
        return "";
    }
}

