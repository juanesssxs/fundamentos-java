public class Main {

    public static void ejercicio1() {
        int x = (int) 5.89 + (int) 3.45;
        System.out.println("Resultado: " + x);
    }

    public static void ejercicio2() {
        char c = 'A';
        int asciiValue = (int) c;
        System.out.println("Valor ASCII de 'A': " + asciiValue);
    }

    public static void ejercicio3() {
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println("Valor final después de conversión: " + i);
    }

    public static void ejercicio4() {
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("Número convertido de String: " + number);
    }

    public static void ejercicio5() {
        int result = (int) (char) (byte) -1;
        System.out.println("Resultado de conversión: " + result);
    }

    public static void ejercicio6() {
        char character = (char) 65;
        System.out.println("Carácter correspondiente al número 65: " + character);
    }

    public static void ejercicio7() {
        long longValue = 1000L;
        int intValue = (int) longValue;
        System.out.println("Valor int después de casteo: " + intValue);
    }

    public static void ejercicio8() {
        float f = 3.14f;
        String floatStr = Float.toString(f);
        System.out.println("Número float como String: " + floatStr);
    }

    public static void ejercicio9() {
        int roundedResult = (int) Math.round(3.7);
        System.out.println("Resultado después de redondear y casteo: " + roundedResult);
    }

    public static void ejercicio10() {
        byte b = 50;
        short s = (short) b;
        System.out.println("Valor de short después de conversión: " + s);
    }

    public static void ejercicio11() {
        int x = 10;
        x += 5;
        System.out.println("Valor de x después de +=: " + x);
    }

    public static void ejercicio12() {
        int y = 10; // Suponiendo un valor inicial para y
        y *= (15 + 5);
        System.out.println("Valor de y después de *=: " + y);
    }

    public static void ejercicio13() {
        int a = 15;
        a %= 4;
        System.out.println("Valor de a después de %=: " + a);
    }

    public static void ejercicio14() {
        int x = 10;
        int y = 5;
        x += y;
        System.out.println("Valor de x después de +=: " + x);
    }

    public static void ejercicio15() {
        int x = 7; // Suponiendo un valor inicial para x
        x ^= 2;
        System.out.println("Valor de x después de ^=: " + x);
    }

    public static void ejercicio16() {
        int x = 5;
        int y = ++x;
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void ejercicio17() {
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
    }

    public static void ejercicio18() {
        int count = 10;
        count--;
        System.out.println("Valor de count después de decremento: " + count);
    }

    public static void ejercicio19() {
        int i = 5;
        System.out.println("Resultado de ++i: " + ++i); // Pre-incremento
        i = 5;
        System.out.println("Resultado de i++: " + i++); // Post-incremento
        System.out.println("Valor de i después de i++: " + i);
    }

    public static void ejercicio20() {
        int x = 3;
        x = x++;
        System.out.println("Valor de x después de x = x++: " + x);
    }

    public static void ejercicio21() {
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println("Resultado de la expresión: " + i);
    }

    public static void ejercicio22() {
        double d = 10.5;
        int i = (int) d;
        i++;
        System.out.println("Valor de i después de conversión e incremento: " + i);
    }

    public static void ejercicio23() {
        double d = 5.7;
        int i = (int) d;
        i *= 2;
        System.out.println("Valor de i antes de decremento: " + i);
        System.out.println("Valor de i después de decremento: " + i--);
    }

    public static void ejercicio24() {
        int num = 10;
        double result = (double) num / 2;
        System.out.println("Resultado de la división: " + result);
    }

    public static void ejercicio25() {
        char c = 'X';
        c += 32;
        System.out.println("Carácter después de sumar 32: " + c);
    }

    public static void ejercicio26() {
        long l = 5000L;
        short s = (short) l;
        s *= 3;
        System.out.println("Valor de short después de multiplicación: " + s);
    }

    public static void ejercicio27() {
        int x = 10;
        x += (x++) + (++x);
        System.out.println("Valor de x después de operaciones compuestas: " + x);
    }

    public static void ejercicio28() {
        float f = 3.9f;
        byte b = (byte) f;
        --b;
        System.out.println("Valor de byte después de predecremento: " + b);
    }

    public static void ejercicio29() {
        int i = 257;
        byte b = (byte) i;
        System.out.println("Resultado de casteo a byte: " + b);
    }

    public static void ejercicio30() {
        double d = 7.5;
        int x = (int) d;
        x += 5;
        x++;
        System.out.println("Valor final después de suma e incremento: " + x);
    }
}
