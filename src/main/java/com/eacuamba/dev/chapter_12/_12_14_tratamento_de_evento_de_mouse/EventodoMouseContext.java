package com.eacuamba.dev.chapter_12._12_14_tratamento_de_evento_de_mouse;

import javax.swing.*;
import java.awt.*;

public class EventodoMouseContext {
    public static void main(String[] args) {
        EventoDeMouseFrame eventoDeMouseFrame = new EventoDeMouseFrame();

        eventoDeMouseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventoDeMouseFrame.setVisible(true);
        Dimension dimension = new Dimension();
        dimension.setSize(500, 500);
        eventoDeMouseFrame.setMinimumSize(dimension);

    }
}
