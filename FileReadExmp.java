package com.miraclesoft;

import java.io.File;

public class FileReadExmp {

	public static void main(String[] args) {

		File directory = new File("E:\\");
		int fileCount = directory.list().length;
		System.out.println("Files Count:" + fileCount);

	}
}
