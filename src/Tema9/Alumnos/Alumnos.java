package Tema9.Alumnos;

/*
Programa que almacene y gestione los Nº expediente y alumnos de la clase.
    Utiliza un HashMap para alamacenar los datos de tus compalñeros de clase.
    a. Indica cuantos alumnos hay
    b. Pide un nº de expediente, si existe muestra el alumno si no muestra el error.
    c. Permite eliminar a un alumno de nuestra lista.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Alumnos {
    static HashMap<Integer, String> alumnos = new HashMap<>();

    public static void inserciones() {
        alumnos.put(324, "Pedro");
        alumnos.put(325, "Mauri");
        alumnos.put(326, "Manu");
        alumnos.put(327, "Anthony");

        System.out.println("Hay, "+ alumnos.size() +" alumnos.");
    }

    public static void pedirExpediente(int ne) {
        if (alumnos.containsKey(ne)) { // También se podría hacer con un get
            System.out.println("Alumno: " + alumnos.get(ne));
        } else {
            System.out.println("No existe este Número de expediente");
        }
    }


    private static void borradoClave(int ne) {
        alumnos.remove(ne);
    }

    private static void borradoValor(String nombre) {
        Iterator claves = alumnos.keySet().iterator();

        String alu = "";
        while (claves.hasNext() && !alu.equalsIgnoreCase(String.valueOf(alumnos))) {
            Integer codigo = (Integer)claves.next();
            alu = alumnos.get(codigo);
            if (alu.equals(alumnos)) {
                alumnos.remove(codigo);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inserciones();
        System.out.println("Introduzca el número de expediente: ");
        int ne = sc.nextInt();
        pedirExpediente(ne);
        borradoValor("Pedro");
        System.out.println(alumnos);
    }

}
