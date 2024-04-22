package flyweight;

import java.awt.Color;
import java.util.HashMap;

public class LapisFactory {

	private static  HashMap<Color, Lapis> lapisCache = new HashMap<>();

    public static Lapis getLapis(Color cor) {
        Lapis lapis = lapisCache.get(cor);

        // Se o lápis da cor especificada já existe, retorná-lo
        if (lapis != null) {
            System.out.println("Reutilizando lápis da cor " + cor);
            return lapis;
        } else {
            // Caso contrário, criar um novo lápis da cor especificada
            System.out.println("Criando um novo lápis da cor " + cor);
            lapis = new LapisImpl(cor);
            lapisCache.put(cor, lapis);
            return lapis;
        }
    }
}
	

