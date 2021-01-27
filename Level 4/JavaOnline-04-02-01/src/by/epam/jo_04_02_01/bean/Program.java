package by.epam.jo_04_02_01.bean;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		Text text = new Text();
		text.print();
		System.out.println(text);
		
		List <Word> words = new ArrayList<>();
		words.add(new Word("Я"));
		words.add(new Word("люблю"));
		words.add(new Word("Java!"));
		
		List <Sentence> sentences = new ArrayList<>();
		sentences.add(new Sentence(words));
		sentences.add(new Sentence(words));
		
		text.add(sentences);
		text.print();
		System.out.println(text);
		
		text.setHeader("O моей любви");
		text.print();
		System.out.println(text);
		
		
		List <Word> words2 = new ArrayList<>();
		words2.add(new Word("Ты"));
		List <Sentence> sentences2 = new ArrayList<>();
		sentences2.add(new Sentence(words2));

		System.out.println(sentences.toArray()[0].equals(sentences.toArray()[1]));
		System.out.println(sentences.toArray()[0].equals(sentences2.toArray()[0]));
	}

}
