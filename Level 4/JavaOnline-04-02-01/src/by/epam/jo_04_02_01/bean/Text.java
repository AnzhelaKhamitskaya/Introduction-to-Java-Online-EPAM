package by.epam.jo_04_02_01.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Text implements Serializable {

	private static final long serialVersionUID = -1486499549649797056L;

	private String header;
	private List<Sentence> text;

	public Text() {
		this("", new ArrayList<Sentence>());
	}

	public Text(List<Sentence> text) {
		this("", text);
	}
	
	public Text(String header, List<Sentence> text) {
		this.header = header;
		this.text = text;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}
	
	public void add(List <Sentence> sentences) {
       this.text.addAll(sentences);
	}

	public void print() {
		System.out.println(header);	
		for(Sentence sentence: getText()) {
			for(Word word: sentence.getSentence()) {
				System.out.print(word.getWord() + " ");
			}
		}
		System.out.println();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [header=" + header + ", text=" + text + "]";
	}
	
}
