package Programas;
import java.util.Scanner;

public class IMC {
    public static  void main(String[] args) {

        System.out.println("\n IMC \n --------------------");

        Scanner DatoIMC = new Scanner(System.in);

        System.out.println("Altura:");
        double altura = DatoIMC.nextDouble();
        System.out.println("Peso:");
        double peso = DatoIMC.nextDouble();
        DatoIMC.close();

        //PROCESO
        double IMC = peso/(altura*altura);
        System.out.println("IMC: " + IMC);

        if (IMC < 18.5) {
            System.out.println("IMC bajo");
        } else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("IMC peso normal");
        }

        if (IMC >= 25 && IMC < 29.9) {
            System.out.println("IMC obesidad I");
        } else if (IMC >= 30 && IMC < 33.9) {
            System.out.println("IMC peso normal");
        }

        if (IMC >= 35 && IMC < 39.9) {
            System.out.println("IMC obesidad II");
        } else if (IMC >= 40 && IMC < 41.9) {
            System.out.println("IMC peso");
        }

        if (IMC >= 45 && IMC < 49.9) {
            System.out.println("IMC obesidad III");
        } else if (IMC >= 50 && IMC < 59.9) {
            System.out.println("IMC peso");
        }

        if (IMC > 50) {
            System.out.println("IMC obesidad IV");
        }

        //RESPUESTA
        Programas.IMC(180, 40);

    }
}


