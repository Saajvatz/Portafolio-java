// importar del nombrePaquete.nombrePaquete

import Interfazgrafica.Banner;
import Opciones.ListaOpciones;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import


//importar denombreLibreria.nombrePaquete.nombreClase
import java.util.Scanner;


//metodo main
public class Main {
    public static void main(String[] args) {
        Banner.mensaje();
        ListaOpciones.CargarOpciones();

        System.out.println(Math.max(50, 100));
        /*
        *@Scanner crear un objeto
        * @@System imprime en consola un mensaje
        * @int almacena el valor del scanner (intOpcional) en formato int (numero entero )
        * @nextInt() convierte la salida del Scanner en un numero entero
        * */
        Scanner intOpcion = new Scanner(System.in);
        System.out.println("[?]:");
        int opcion = intOpcion.nextInt();
        System.out.println("---------------------------------------------------");

        //CARGAR OPCION DE USUARIO
        switch (opcion){
            case 1:
                System.out.println("opcion 1");
                break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                    case 3:
                        System.out.println("opcion 3");
                        break;
                        case 4:
                            System.out.println("opcion 4");
                            break;
                            case 5:
                                System.out.println("opcion 5");
                                break;
                                case 6:
                                    System.out.println("opcion 6");
                                    break;
                                    case 7:
                                        System.out.println("opcion 7");
                                        break;
                                        case 8:
                                            System.out.println("opcion 8");
                                            break;
                                            case 9:
                                                System.out.println("opcion 9");
                                                break;
                                                case 10:
                                                    System.out.println("opcion 10");
                                                    break;
             s
        }























    }
}