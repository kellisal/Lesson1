import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.println("Min funktsioon. Sisesta 2 väärtust");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(min(a, b));
        System.out.println("Abs funktsioon. Sisesta 1 väärtus.");
        a = in.nextInt();
        System.out.println(abs(a));
        System.out.println("Negatiivse arvu tagastamine. Sisesta 1 väärtus.");
        a = in.nextInt();
        System.out.println(neg(a));
        System.out.println("Nullile lähima arvu leidmine. Sisesta 3 väärtust.");
        a = in.nextInt();
        b = in.nextInt();
        int c = in.nextInt();
        System.out.println(closestToZero(a, b, c));
        System.out.println("Kas tegu on paarisarvuga? Sisesta 1 väärtus.");
        a = in.nextInt();
        System.out.println(isNumberEven(a));
        System.out.println("Juhul, kui sisestatakse paarisarv, jagatakse sisend kahega. Juhul, kui sisestatakse paaritu arv, siis korrutatakse sisend 3 ja liidetakse 1. Sisesta 1 väärtus");
        a = in.nextInt();
        System.out.println(seq3n(a));
        System.out.println("Tagastab maksimumväärtuse. Sisesta 2 väärtust");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(max(a, b));
        System.out.println("Tagastab maksimumväärtuse. Sisesta 3 väärtust.");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(max(a, b, c));
        System.out.println("Tagastab suurima paarisarvu. Sisesta 2 väärtust.");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(largestPositive(a, b));
        System.out.println("Tagastab suurima paarisarvu. Sisesta 3 väärtust.");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(largestPositive(a, b, c));
        */
        int[] test = {2, 5, 6, 7, 8, 9};
        System.out.println(closestTo(4, test));
    }

    // leia 2 arvu miinimum väärtus
    // Näited:
    // min (3, 5) = 3
    // min (-3, 8) = -3
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO: Leia arvu absoluutväärtus
    // Näited:
    // abs(3) = 3
    // abs(-5) = 5
    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    // TODO: Luua funktsioon, mis tagastab vastava arvu alati negatiivsena
    // Näited:
    // neg(0) = 0
    // neg(-1) = -1
    // neg(8) = -8
    public static int neg(int x) {
        if (x <= 0) {
            return x;
        } else {
            return -x;
        }
    }

    // TODO: Luua funktsioon mis leiab sisend muutujates numbri mis on kõige lähemal 0-ile
    // Näited
    // (-5, -2, 0) -> 0
    // (2, 3, 4) -> 2
    public static int closestToZero(int a, int b, int c) {
        if (abs(a) <= abs(b) && abs(a) <= abs(c)) {
            return a;
        } else if (abs(b) <= abs(a) && abs(b) <= abs(c)) {
            return b;
        } else {
            return c;
        }

    }

    // TODO: Luua funktsioon, mis tagastab kas a on paaris arv
    // Näited
    // isNumberEven(4) = true
    // isNumberEven(1) = false
    public static boolean isNumberEven(int a) {
        return a % 2 == 0;
    }

    // TODO: Luua funktsioon, mis
    // Juhul kui a on paaris arv, siis jaga sisend 2
    // Juhul kui a on paaritu arv, siis korruta sisend 3 ja liida 1
    public static int seq3n(int a) {
        if (isNumberEven(a)) {
            return a / 2;
        } else {
            return a * 3 + 1;
        }
    }

    public static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta suurim paaris arv
    // Kui kumbki arv ei ole paaris siis tagasta 0
    public static int largestPositive(int a, int b) {
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                if (a > b) {
                    return a;
                }
                return b;
            }
            return a;
        } else if (b % 2 == 0) {
            return b;
        } else {
            return 0;
        }
    }

    // TODO tagasta suurim paaris arv
    // Kui kumbki arv ei ole paaris siis tagasta 0
    public static int largestPositive(int a, int b, int c) {
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                if (c % 2 == 0) {
                    if (a > b && a > c) {
                        return a;
                    } else if (b > a && b > c) {
                        return b;
                    } else {
                        return c;
                    }
                } else if (a > b) {
                    return a;
                }
                return b;
            } else if (c % 2 == 0) {
                if (a > c) {
                    return a;
                }
                return c;
            }
            return a;
        } else if (b % 2 == 0) {
            if (c % 2 == 0) {
                if (c > b) {
                    return c;
                }
                return b;
            }
            return b;
        } else if (c % 2 == 0) {
            return c;
        } else {
            return 0;
        }
    }

    public static int closestTo(int nr, int[] test) {
        int h = abs(nr - test[0]);
        int j = test [0];
        for (int i = 0; i < test.length; i++) {
            if (abs(nr - test[i]) < h){
                h = abs(nr - test[i]);
                j = test[i];
            }

        }
        return j;
    }

}
