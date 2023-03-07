package Tema9.Ej3_Sintesis_Char;

import java.util.Scanner;
import java.util.Stack;

public class Ej3_Sintesis_Char {
    Stack<Character> pila = new Stack<>();

    public static void main(String[] args) {
        Ej3_Sintesis_Char obj = new Ej3_Sintesis_Char();
        obj.rellenarPila();
        obj.mostrarPila();
    }

    public void rellenarPila(){
        Scanner sc = new Scanner(System.in);
        String leido;
        System.out.println("Introduzca cadenas de caracteres (Pulse Enter para salir)");
        do{
            leido = sc.nextLine();
            if(!leido.equals("")){
                pila.push(leido.charAt(0));
            }
        }while(!leido.equals(""));
    }
    public void mostrarPila() {
        int tamanho = pila.size();
        for (int i = 0; i <= tamanho - 1; i++) {
            System.out.println("Cadena " + (tamanho - 1 - i) + ": " + pila.pop());
        }
    }
}
