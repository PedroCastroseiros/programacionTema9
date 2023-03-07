package Tema9.Agenda;

import java.util.ArrayList;
import java.util.Scanner;

/*
Se va a implementar una agenda telefónica de contactos.
Un contacto está definido por un nombre y un teléfono (No es necesario de validar). Un contacto es igual a otro cuando sus nombres son iguales.
Una agenda de contactos está formada por un conjunto de contactos

La agenda se podrá crear de dos formas, indicándole el tamaño o con un tamaño por defecto (10)
Métodos:
    • anhadirContacto(Contacto c): Añade un contacto a la agenda, si no se pueden meter más a la agenda se indicará por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
    • existeContacto(Conctacto c): indica si el contacto pasado existe o no.
    • listarContactos(): Lista toda la agenda
    • buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
    • eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
    • agendaLlena(): indica si la agenda está llena.
    • huecosLibres(): indica cuántos contactos más podemos meter.
Crea un menú con opciones por consola para probar todas estas funcionalidades.
 */

import static Tema9.Agenda.Contacto.telefono;

import static Tema9.Agenda.Contacto.nombre;

public class Agenda  {

    private final int TAMANHO;
    Contacto c;

    ArrayList<Contacto> Lista;

    public Agenda(int tamanho) {
        TAMANHO = tamanho;
    }

    public void anhadirContacto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nuevo contacto, nombre: ");
        nombre = sc.next();

        System.out.println("Introduzca el número de teléfono: ");
        telefono = sc.nextInt();

        if (nombre.equals(Lista)){
            System.out.println("Este contacto ya existe.");
        }  else {
            Lista.add(c);
        }
    }
    public void existeContacto() {

    }


    public void listarContactos() {

    }


    public void buscaContacto() {

    }


    public void eliminarContacto() {

    }


    public void agendaLlena() {

    }


    public void huecosLibres() {

    }


    public void Menu() {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nLista de Enteros");
            System.out.println("[1] Agregar contacto");
            System.out.println("[2] Comprobar contacto");
            System.out.println("[3] Listar agenda");
            System.out.println("[4] Buscar contacto");
            System.out.println("[5] Eliminar contacto");
            System.out.println("[6] Capacidad agenda");
            System.out.println("[7] Huecos libres");
            System.out.println("[8] Salir\n");
            System.out.print("Ingrese opcion (1-8): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    anhadirContacto();
                    break;
                case 2:
                    existeContacto();
                    break;
                case 3:
                    listarContactos();
                    break;
                case 4:
                    buscaContacto();
                    break;
                case 5:
                    eliminarContacto();
                    break;
                case 6:
                    agendaLlena();
                    break;
                case 7:
                    huecosLibres();
                    break;

            }
        } while (opcion != 8);





    }
}
