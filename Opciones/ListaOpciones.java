package Opciones;

public class ListaOpciones {
    public static void CargarOpciones () {
        String [] ListaDeOpciones = {
                "Calculadora","IMC"
                ,"Login", "Calcular edad",
                "Grados", "opcion 6",
                "opcion 7", "opcion 8",
                "opcion 9", "opcion 10",
        };
    } int columnas = 0;
        for(int i=0; i < ListaOpciones.length; i++) {
        System.out.printf("[d%] %s", i + 1, ListaOpciones[i] );

        for(int j =0;j<13; (ListaOpciones[i].length()); j++){

        }
            System.out.print("");


        if ((i + 1) % 2 == 0) {
            System.out.println("");
        }
    }


}
