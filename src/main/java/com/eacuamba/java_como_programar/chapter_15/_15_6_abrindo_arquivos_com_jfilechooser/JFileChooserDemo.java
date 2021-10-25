/*
* Copyright 
* Aos Jul 10, 2021
* Autor(Edilson Alexandre Cuamba)
* Thunder Mozambique
* 2021
* User(Edilson A. Cuamba)
*/

package com.eacuamba.java_como_programar.chapter_15._15_6_abrindo_arquivos_com_jfilechooser;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -787937128343035367L;
	private JTextArea textArea;
	
	public JFileChooserDemo () throws IOException{
		super("JFileChooser Demo"); // Inserindo no contrutor do JFrame o nome do painel desktop
		this.textArea = new JTextArea(); //Criando uma instancia de JTextArea()
		this.add(new JScrollPane(textArea)); // Adicionando um JScrollPane() ao Jframe e encapsulando um JTextArea no JScrollPane. JFrame <- JScrollPane <- JTextArea
		analyzePath();
	}
	
	public void analyzePath() throws IOException{
		
		Path path = this.obterFichheiroOuDirectorioSelecionado();
		 StringBuilder sb = new StringBuilder() ;
		 
		if(path != null && Files.exists(path)) {
			
			 sb.append(String.format("%s%s%n", path.toString(), ": "));
			 sb.append(String.format("%n%s%s", Files.isDirectory(path) ? "Is": "Is not", " a directory."));
			 sb.append(String.format("%n%s%s", path.isAbsolute() ? "Is" : "Is not"," a absolute path."));
			 
			 Date date =  new Date(Files.getLastModifiedTime(path).toMillis());
			 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "MZ"));
			 sb.append(String.format("%n%s%s", "Last modified: ", simpleDateFormat.format(date)));
			 sb.append(String.format("%n%s%s", "Size: ", Files.size(path)));
			 sb.append(String.format("%n%s%s", "Path: ", path.toString()));
			 sb.append(String.format("%n%s%s%n", "Absolute path: ", path.toAbsolutePath().toString()));
			 
			 if(Files.isDirectory(path)) {
				 sb.append(String.format("%n%s%n", "Directory contents:"));
				 
				 DirectoryStream<Path> insidePathList  = Files.newDirectoryStream(path);
				 for (Path path2 : insidePathList) {
					sb.append(String.format("%s - %s%n", path2, Files.size(path2)));
				}
			 }else {
				 sb.append(String.format("%n%s%n", "Selecionaste um arquivo!"));
			 }
			 
		}else {
			System.err.println("Arquivo n�o existe!");
		}
		this.textArea.setText(sb.toString());
		
	}
	
	public Path obterFichheiroOuDirectorioSelecionado() {
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		jFileChooser.setMultiSelectionEnabled(false);
		
		int result = jFileChooser.showOpenDialog(this);
		
		if(result == JFileChooser.CANCEL_OPTION) {
			System.err.println("Cancelaste. Terminando o programa.");
			System.exit(0);
		}
		
		return jFileChooser.getSelectedFile().toPath();
	}
}
