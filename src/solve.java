import java.util.Scanner;

public class solve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione un ejercicio:");
            System.out.println("1. Casteo - Operación con casteo explícito");
            System.out.println("2. Casteo - Conversión de char a int");
            System.out.println("3. Casteo - Conversión de double a long y luego a int");
            System.out.println("4. Casteo - Conversión de String a int");
            System.out.println("5. Casteo - Conversión de byte a int a través de char");
            System.out.println("6. Casteo - Conversión del número 65 a char");
            System.out.println("7. Casteo - Asignación de long a int sin casteo explícito");
            System.out.println("8. Casteo - Conversión de float a String");
            System.out.println("9. Casteo - Uso de Math.round y casteo");
            System.out.println("10. Casteo - Conversión de byte a short");
            System.out.println("11. Operadores de Asignación - Valor después de += ");
            System.out.println("12. Operadores de Asignación - Simplificación con operador de asignación compuesta");
            System.out.println("13. Operadores de Asignación - Valor después de %=");
            System.out.println("14. Operadores de Asignación - Expresión equivalente a x = x + y");
            System.out.println("15. Operadores de Asignación - Operación con XOR (^)");
            System.out.println("16. Incremento y Decremento - Valor de x e y después de preincremento");
            System.out.println("17. Incremento y Decremento - Impresión de a++ y a");
            System.out.println("18. Incremento y Decremento - Código para decrementar count en 1");
            System.out.println("19. Incremento y Decremento - Diferencia entre ++i y i++");
            System.out.println("20. Incremento y Decremento - Valor de x después de x = x++");
            System.out.println("21. Ejercicios Combinados - Resultado de expresión compleja");
            System.out.println("22. Ejercicios Combinados - Conversión de double a int y luego incremento");
            System.out.println("23. Ejercicios Combinados - Impresión de i-- después de multiplicar por 2");
            System.out.println("24. Ejercicios Combinados - Expresión con casteo y asignación compuesta para dividir");
            System.out.println("25. Ejercicios Combinados - Resultado de sumar 32 a un char");
            System.out.println("26. Ejercicios Combinados - Conversión de long a short y multiplicación");
            System.out.println("27. Ejercicios Combinados - Valor de x después de operaciones compuestas");
            System.out.println("28. Ejercicios Combinados - Casteo de float a byte y predecremento");
            System.out.println("29. Ejercicios Combinados - Resultado de byte después de casteo");
            System.out.println("30. Ejercicios Combinados - Expresión que convierte double a int, suma 5 e incrementa");
            System.out.println("0. Salir");

            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Main.ejercicio1();
                    break;
                case 2:
                    Main.ejercicio2();
                    break;
                case 3:
                    Main.ejercicio3();
                    break;
                case 4:
                    Main.ejercicio4();
                    break;
                case 5:
                    Main.ejercicio5();
                    break;
                case 6:
                    Main.ejercicio6();
                    break;
                case 7:
                    Main.ejercicio7();
                    break;
                case 8:
                    Main.ejercicio8();
                    break;
                case 9:
                    Main.ejercicio9();
                    break;
                case 10:
                    Main.ejercicio10();
                    break;
                case 11:
                    Main.ejercicio11();
                    break;
                case 12:
                    Main.ejercicio12();
                    break;
                case 13:
                    Main.ejercicio13();
                    break;
                case 14:
                    Main.ejercicio14();
                    break;
                case 15:
                    Main.ejercicio15();
                    break;
                case 16:
                    Main.ejercicio16();
                    break;
                case 17:
                    Main.ejercicio17();
                    break;
                case 18:
                    Main.ejercicio18();
                    break;
                case 19:
                    Main.ejercicio19();
                    break;
                case 20:
                    Main.ejercicio20();
                    break;
                case 21:
                    Main.ejercicio21();
                    break;
                case 22:
                    Main.ejercicio22();
                    break;
                case 23:
                    Main.ejercicio23();
                    break;
                case 24:
                    Main.ejercicio24();
                    break;
                case 25:
                    Main.ejercicio25();
                    break;
                case 26:
                    Main.ejercicio26();
                    break;
                case 27:
                    Main.ejercicio27();
                    break;
                case 28:
                    Main.ejercicio28();
                    break;
                case 29:
                    Main.ejercicio29();
                    break;
                case 30:
                    Main.ejercicio30();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            System.out.println(); // Línea en blanco para mejor legibilidad

        } while (opcion != 0);

        scanner.close();
    }
}

