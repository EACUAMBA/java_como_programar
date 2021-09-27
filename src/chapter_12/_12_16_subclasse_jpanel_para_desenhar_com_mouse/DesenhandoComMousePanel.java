package chapter_12._12_16_subclasse_jpanel_para_desenhar_com_mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class DesenhandoComMousePanel extends JPanel {

    private final java.util.List<Point> pointList;

    public DesenhandoComMousePanel(){
        this.pointList = new ArrayList<>();
        this.setOpaque(false);
        this.addMouseMotionListener(
                new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent e) {
                        super.mouseDragged(e);
                        DesenhandoComMousePanel.this.pointList.add(e.getPoint());
                        DesenhandoComMousePanel.this.updateUI();
                    }
                }
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        for (Point point: this.pointList)
            g.drawOval(point.x, point.y, 2, 2);

    }
}
