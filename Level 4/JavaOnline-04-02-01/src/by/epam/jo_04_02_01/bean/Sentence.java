package by.epam.jo_04_02_01.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sentence implements Serializable{

	private static final long serialVersionUID = 26228190398261110L;
		
	private List <Word> sentence;
	
	public Sentence() {
		this(new ArrayList <Word>());
	}
	
	public Sentence(List <Word> sentence) {
		this.sentence = sentence;
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [sentence=" + sentence + "]";
	}

}
