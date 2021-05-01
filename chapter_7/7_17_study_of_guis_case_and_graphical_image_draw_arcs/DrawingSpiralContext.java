import javax.swing.*;

public class DrawingSpiralContext {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        DrawingSpiral drawingSpiral;
        int arcos;
        do {
            String resposta = JOptionPane.showInputDialog("Number of arcs you want me to create\nSize: ");
            arcos = Integer.parseInt(resposta==null || resposta.equals("") ? "0" : resposta);
        } while (arcos < 1);
        drawingSpiral = new DrawingSpiral(arcos);
jFrame.setLocation(200, 200);
        jFrame.setSize(500, 500);
        jFrame.setTitle("Desenhando uma espiral...");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(drawingSpiral);
        jFrame.setVisible(true);
    }
}

