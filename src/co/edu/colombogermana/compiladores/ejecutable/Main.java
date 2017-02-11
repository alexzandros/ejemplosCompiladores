/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.colombogermana.compiladores.ejecutable;

/**
 *
 * @author carlos
 */
import co.edu.colombogermana.compiladores.analizadores.AnalizadorLexico;

public class Main {
    public static void main(String[] args) {
        String sentencia = "a=23-45+12";
        String[] simbolos = {"+","-","*","/","="};
        String[] resultadoAnalisisLexico = AnalizadorLexico.realizarAnalisis(sentencia, simbolos);
        for (String elemento: resultadoAnalisisLexico)
        {
            System.out.println(elemento);
        }
    }
    
}
