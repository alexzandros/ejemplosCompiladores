package co.edu.colombogermana.compiladores.analizadores;

/**
 *
 * @author carlos
 */
import java.util.ArrayList;

public class AnalizadorLexico {

    public static String[] realizarAnalisis(String sentencia, String[] tokensDelLenguaje)
    {
        ArrayList<String> arregloARetornar = new ArrayList<>();
        arregloARetornar.add(sentencia);
        for (String tokenAAnalizar:tokensDelLenguaje)
        {
           arregloARetornar =  realizaAnalisisUnToken(arregloARetornar, tokenAAnalizar);
        }
       return arregloARetornar.toArray(new String[arregloARetornar.size()]);
    }
    
    public static ArrayList<String> realizaAnalisisUnToken(ArrayList<String> subcadenas, String tokenAAnalizar)
    {
        ArrayList<String> arregloARetornar = new ArrayList<>();
        for (String cadena:subcadenas)
        {
            int indice = 0;
            String[] arregloTemporal = cadena.split("\\" + tokenAAnalizar);
            for (String tokenHallado: arregloTemporal)
            {
                indice++;
                arregloARetornar.add(tokenHallado);
                if (indice < arregloTemporal.length)
                {
                    arregloARetornar.add(tokenAAnalizar);
                }
            }
        }
        return arregloARetornar;
    }
}
