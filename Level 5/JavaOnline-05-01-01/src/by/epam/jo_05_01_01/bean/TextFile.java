package by.epam.jo_05_01_01.bean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile extends File {
	
	public TextFile() {
		super();
	}
	
	public TextFile(Directory directory, String name) {
		super(directory, name, Extension.txt);
	}
	
	@Override
	public void viewContent() {
		
			try (FileReader fr = new FileReader(getThis())){
				int i = -1;
				while((i = fr.read()) != -1) {
					System.out.print((char)i);
				}
				
				System.out.println();
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void addContent(StringBuilder text) {
		try (FileWriter fw = new FileWriter(getThis(), true)){
			fw.write(text.toString());			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
