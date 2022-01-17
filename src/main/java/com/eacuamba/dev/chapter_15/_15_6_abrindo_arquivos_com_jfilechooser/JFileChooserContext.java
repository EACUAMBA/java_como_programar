/*
* Copyright 
* Aos Jul 10, 2021
* Autor(Edilson Alexandre Cuamba)
* Thunder Mozambique
* 2021
* User(Edilson A. Cuamba)
*/

package com.eacuamba.dev.chapter_15._15_6_abrindo_arquivos_com_jfilechooser;

import java.io.IOException;

public class JFileChooserContext {
	public static void main(String[] args) {
		try {
			JFileChooserDemo jFileChooserDemo = new JFileChooserDemo();
			jFileChooserDemo.setSize(500, 500);
			jFileChooserDemo.setDefaultCloseOperation(JFileChooserDemo.EXIT_ON_CLOSE);
			jFileChooserDemo.setVisible(true);
		}catch (IOException ioException) {
			System.err.println("Error ao executar!");
			ioException.printStackTrace();
		}
	}
}
