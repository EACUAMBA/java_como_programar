package com.eacuamba.java_como_programar.chapter_15._15_3_using_classes_and_nio_interfaces_to_get_directory_and_archives_information;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("%n%s", "Enter the file or directory name: ");
		Path path = Paths.get(scanner.nextLine());

		if (Files.exists(path)) {
			System.out.printf("%n%s absolute path.", path.isAbsolute() ? "Is an" : "Is not an");
			System.out.printf("%n%s file.", Files.isDirectory(path) ? "Is not a" : "Is a");
			System.out.printf("%nLast modified was at %s.", Files.getLastModifiedTime(path));
			System.out.printf("%nPath %s.", path);
			System.out.printf("%nAbsolute path: %s.", path.toAbsolutePath());
			System.out.printf("%n%s bytes.", Files.size(path));
			System.out.printf("%nRoot node: %s%n", path.getRoot());
		
		if(Files.isDirectory(path)) {
			DirectoryStream<Path> paths = Files.newDirectoryStream(path);
			for(Path temporaryPath : paths) {
				System.out.printf("%n%s.", temporaryPath);
				System.out.printf("%n%s bytes.", Files.size(temporaryPath));
			}
		}
		}else {
			System.err.printf("%n%s", "File or directory does not exist.");
		}
		scanner.close();
	}
}
