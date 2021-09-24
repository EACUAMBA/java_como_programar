package chapter_12._12_14_tratamento_de_evento_de_mouse;

import sun.java2d.loops.DrawRect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventoDeMouseFrame extends JFrame {
    private final Color mouseColor;
    private final JPanel mousePane;
    private final JLabel statusBar;

    public EventoDeMouseFrame(){
        this.setTitle("Manipulando os eventos do mouse...");

        this.mouseColor = new Color(237, 253, 246);

        this.mousePane = new JPanel();
        DrawArea painel = new DrawArea();
        painel.setBackground(new Color(23, 212, 127));
        this.add(painel, BorderLayout.CENTER);

        this.statusBar = new JLabel("Mouse fora do painel");
        this.add(this.statusBar, BorderLayout.SOUTH);

        MouseEventsHanndler mouseEventsHanndler = new MouseEventsHanndler(painel);
        mouseEventsHanndler.setStatusbar(this.statusBar);
        painel.addMouseListener(mouseEventsHanndler);
        painel.addMouseMotionListener(mouseEventsHanndler);




    }

    private class MouseEventsHanndler implements MouseListener, MouseMotionListener {

        private JLabel statusbar;
        private DrawArea x;

        public void setStatusbar(JLabel statusbar){this.statusbar = statusBar;}

        public MouseEventsHanndler(DrawArea x){
            this.x = x;
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            this.statusbar.setText(String.format("Clicaste no ponto  %d w x %d h", e.getX(), e.getY()));
            this.x.x1 = e.getX();
            this.x.y1 = e.getY();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            this.statusbar.setText(String.format("Pressionanste no ponto  %d w x %d h", e.getX(), e.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            this.statusbar.setText(String.format("Paraste de pressionar no ponto  %d w x %d h", e.getX(), e.getY()));
            this.x.x2 = e.getX();
            this.x.y2 = e.getY();

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            this.statusbar.setText(String.format("Entraste na area do painel a partir do ponto  %d w x %d h", e.getX(), e.getY()));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            this.statusbar.setText(String.format("Saiste da area dop painel apartir do ponto  %d w x %d h", e.getX(), e.getY()));
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            this.statusbar.setText(String.format("Pressionaste o mouse e moves pressionado, estas no ponto  %d w x %d h", e.getX(), e.getY()));

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            this.statusbar.setText(String.format("Moveste o mouse no ponto  %d w x %d h", e.getX(), e.getY()));

        }
    }
}

class DrawArea extends JPanel{
    public int x1, y1, x2, y2;
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.setColor(new Color(237, 253, 246));
        g.drawRect(x1, y1, x2, y2);
    }
}
