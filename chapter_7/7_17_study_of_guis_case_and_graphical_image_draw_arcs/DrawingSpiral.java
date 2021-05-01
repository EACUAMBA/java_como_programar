import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;
import java.util.ArrayList;

public class DrawingSpiral extends JPanel {
    private final SecureRandom sr = new SecureRandom();
    private int numeroDeArcos;

    public DrawingSpiral(int numeroDeArcos) {
        this.setBackground(Color.BLACK);
        this.numeroDeArcos = numeroDeArcos;
    }

    class Arco {
        int pontoDeCordenadaX, pontoDeCordenadaY, comprimentoDoRectangulo, alturaDoRectangulo, grauInicialDoDesenho, comprimentoDoArcoEmGraus;

        public Arco(int pontoDeCordenadaX, int pontoDeCordenadaY, int comprimentoDoRectangulo, int alturaDoRectangulo, int grauInicialDoDesenho, int comprimentoDoArcoEmGraus) {
            this.pontoDeCordenadaX = pontoDeCordenadaX;
            this.pontoDeCordenadaY = pontoDeCordenadaY;
            this.comprimentoDoRectangulo = comprimentoDoRectangulo;
            this.alturaDoRectangulo = alturaDoRectangulo;
            this.comprimentoDoArcoEmGraus = comprimentoDoArcoEmGraus;
            this.grauInicialDoDesenho = grauInicialDoDesenho;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ArrayList<Arco> arcos = new ArrayList<>();
        int nextPositionX = this.getWidth() / 2; //Pegando o centro do JPanel na Horizontal
        int nextPositionY = this.getHeight() / 2; //Pegando o centro do JPanel na vertical
        int comprimentoDoRectangulo = 1; //Definindo o comprimento inicial do retactulo onde o arco será desenhado
        int alturaDoRectangulo = 1; //Definindo a altura inicial do retactulo onde o arco será desenhado
        int grauInicialDoDesenho = 0; //Definindo o grau inicial onde começara-se a desenhar. Lembra do circulo de angulo 360 isso
        int comprimentoDoArcoEmGraus = -180; // Definindo o tamanho do angulo e a direcao do desenho, esquerda para direita ou inverso.

        for (int i = 1; i <= numeroDeArcos; i++) { // Percorrendo o numero de graficos que a pessoa definiu para desenhar.
            Arco arco; //Criando uma variavel do tipo Arco.

            if ((i % 2) == 0) { //Verificando se é o arco superior ou inferior há desenhar agora, sedo par será o de cima e impar o de baixo
                //par parte de cima
                arco = new Arco(
                        nextPositionX,
                        nextPositionY,
                        comprimentoDoRectangulo,
                        alturaDoRectangulo,
                        grauInicialDoDesenho,
                        comprimentoDoArcoEmGraus
                );//Definindo os atributor do objecto arco

                nextPositionX = nextPositionX - alturaDoRectangulo; //Definindo a proxima posicao do clip(pincel) onde vai desenhar. Sera dada pela diferenca entre a posicai a atual e o comprimeito do rectangulo
                nextPositionY = nextPositionY - alturaDoRectangulo / 2; // Definindo a proxima posicao do pincel nos eixos dos Ys = será dada pela diferenca da posicao actual pela metade da altura actual

                grauInicialDoDesenho = 0; // Definindo o proximo inicio do arco, 0 inicia no lado direito
                comprimentoDoArcoEmGraus = -180; // definindo o tamanho e a direcao, sendo agora a direcao horaria
            } else {
                //impar parte de baixo
                arco = new Arco(
                        nextPositionX,
                        nextPositionY,
                        comprimentoDoRectangulo,
                        alturaDoRectangulo,
                        grauInicialDoDesenho,
                        comprimentoDoArcoEmGraus
                );//Definindo os atributor do objecto arco

                nextPositionY = nextPositionY - alturaDoRectangulo /2; // Definindo a proxima posicao no eixo dos Y que sera dada pela diferenca entre a posicao anterior e a metade da altura
                //Aposicao no X fica a mesma.

                grauInicialDoDesenho = 180; //Definindo onde o desenha iniciara no circulo angular
                comprimentoDoArcoEmGraus = -180; // Definindo a direcao e o tamanho do arco.
            }
            comprimentoDoRectangulo = comprimentoDoRectangulo * 2 ; //Fazendo o crescimento exponencial do comprimendo do rectangulo
            alturaDoRectangulo = (alturaDoRectangulo * 2 );
            arcos.add(arco); //Adicionando o arco no array;
        }
        for (Arco arco : arcos) { //Imprimindo...
            g.setColor(new Color(sr.nextInt(255), sr.nextInt(255), sr.nextInt(255)));
            g.drawArc(arco.pontoDeCordenadaX, arco.pontoDeCordenadaY, arco.comprimentoDoRectangulo, arco.alturaDoRectangulo, arco.grauInicialDoDesenho, arco.comprimentoDoArcoEmGraus);
        }
    }
}
