/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
 * вывести на консоль содержимое, дополнить, удалить
 */

package by.epam.jo_05_01_01.main;

import java.util.Scanner;
import by.epam.jo_05_01_01.bean.Directory;
import by.epam.jo_05_01_01.bean.File;
import by.epam.jo_05_01_01.bean.TextFile;

public class Main {

	public static void main(String[] args) {
		
		Directory d = new Directory("C", "Users\\SamIg\\Desktop\\Folder");
		d.create();
		
		File f = new TextFile(d, "File1");
		TextFile tf = new TextFile(new Directory(), "File2");

		f.create();
		tf.create();
		

		f.rename("newFile1");

		tf.delete();		
		tf.viewContent();
		
		
		f.viewContent();
		
		StringBuilder text = new StringBuilder();		
		System.out.print("Введите текст для записи в файл: ");	
		Scanner sc = new Scanner(System.in);	
		if(sc.hasNext()) {
			text.append(sc.nextLine());
		}		
		sc.close();
		
		f.addContent(text);		
		f.viewContent();
		
		System.out.println(tf.getFullPath());
		tf.rename("newFile2");
		System.out.println(tf.getFullPath());
		
		tf.create();
		tf.addContent(text);
		tf.viewContent();
		
		System.out.println(tf.getDirectory().getPath());
	}

}
