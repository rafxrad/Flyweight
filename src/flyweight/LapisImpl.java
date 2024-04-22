package flyweight;

import java.awt.Color;

public class LapisImpl implements Lapis {
	
	private Color cor;

    public LapisImpl(Color cor) {
        this.cor = cor;
        // Simulando uma operação demorada de inicialização
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void desenhar(int x, int y) {
        System.out.println("Desenhando um ponto na cor " + cor + " nas coordenadas (" + x + ", " + y + ")");
    }
}


