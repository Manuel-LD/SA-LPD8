package SA_LPD8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Array original:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + numeros[i]);
        }

        List<Integer> primos = new ArrayList<>();
        List<Integer> noPrimos = new ArrayList<>();

        for (int num : numeros) {
            if (esPrimo(num)) {
                primos.add(num);
            } else {
                noPrimos.add(num);
            }
        }

        int[] nuevoArray = new int[10];
        int index = 0;

        for (int primo : primos) {
            nuevoArray[index++] = primo;
        }

        for (int noPrimo : noPrimos) {
            nuevoArray[index++] = noPrimo;
        }

        System.out.println("Array con los números primos al principio:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + nuevoArray[i]);
        }

        sc.close();
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}