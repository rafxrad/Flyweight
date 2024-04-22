package flyweight;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        LapisFactory fabricaLapis = new LapisFactory();

		        // Desenhando alguns pontos com diferentes cores de lápis
		        Lapis lapisVermelho = LapisFactory.getLapis(Color.RED);
		        lapisVermelho.desenhar(10, 10);

		        Lapis lapisAzul = LapisFactory.getLapis(Color.BLUE);
		        lapisAzul.desenhar(20, 20);

		        // Desenhando mais pontos com a mesma cor de lápis
		        Lapis lapisVermelhoNovo = LapisFactory.getLapis(Color.RED);
		        lapisVermelhoNovo.desenhar(30, 30);
		        
		        Lapis lapisAzulNovo = LapisFactory.getLapis(Color.BLUE);
		        lapisAzulNovo.desenhar(40, 30);
		        
		        Lapis lapisLaranja = LapisFactory.getLapis(Color.ORANGE);
		        lapisLaranja.desenhar(30, 20);
		    }
	}

