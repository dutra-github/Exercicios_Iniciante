package exercicios.praticos.orientado.a.objetos.testes;

import java.util.HashMap;
public class PalavraComMaisLetrasRepetidas {

    public static int contarLetrasRepetidas(String palavra) {
        HashMap<Character, Integer> mapa = new HashMap<>();
        int contagem = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            mapa.put(letra, mapa.getOrDefault(letra, 0) + 1);
        }

        for (int valor : mapa.values()) {
            if (valor > 1) {
                contagem += valor;
            }
        }

        return contagem;
    }

    public static String encontrarPalavraComMaisLetrasRepetidas(String entrada) {
        String[] palavras = entrada.split("\\s+");
        HashMap<Integer, String> mapa = new HashMap<>();
        int contagemMaxima = 0;

        for (String palavra : palavras) {
            int contagem = contarLetrasRepetidas(palavra);
            if (contagem > 0) {
                mapa.put(contagem, palavra);
                contagemMaxima = Math.max(contagemMaxima, contagem);
            }
        }

        return mapa.get(contagemMaxima);
    }

    public static void main(String[] args) {
        String entrada = "qual é a palavra com mais paraparaparaparapara cataratas letras repetidas paralelepipedo";
        String palavra = encontrarPalavraComMaisLetrasRepetidas(entrada);
        System.out.println("Palavra com maior numero de letras repetidas: " + palavra);
    }
}