/*
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */

package by.epam.jo_03_03_01.bean;

public class Program {

	 public static void main(String[] args) {

	        String str =  "fgnfg.\nxfn. fhhbgbf dgdg rdgggdgrgd g. dhh?\ngjggj. jgg.\nkhkh!";
	        char ch = 'g';

	        System.out.println("отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по\r\n"
	        		+ "алфавиту.");
	        System.out.println("===================================================================================");
	        System.out.println(thirdMethod(str, ch));
	        System.out.println();
	        System.out.println();
	        System.out.println("В каждом предложении отсортировать слова по длине");
	        System.out.println("=================================================");
	        System.out.println(secondMethod(str));
	        System.out.println();
	        System.out.println();
	        System.out.println("Отсортировать абзацы по количеству предложений");
	        System.out.println("==================================================");
	        System.out.println(firstMethod(str));
	    }

	    private static String thirdMethod(String str, char ch) { 
	                                                              
	        StringBuilder newStr1 = new StringBuilder(str);
	        String[] sentences1 = str.split("[?!.]");

	        StringBuilder newSentence1 = new StringBuilder();

	        for (String sentence:
	                sentences1) {

	            String[] words = sentence.trim().split("\\s");

	            for(int i = 0; i < words.length-1; i++){
	                for(int j = i+1; j < words.length; j++){

	                    int q = 0;
	                    for (int k = 0; k < words[i].length(); k++) {
	                        if (words[i].charAt(k) == ch) {
	                            q++;
	                        }
	                    }

	                    int q2 = 0;
	                    for (int k2 = 0; k2 < words[j].length(); k2++) {
	                        if (words[j].charAt(k2) == ch) {
	                            q2++;
	                        }
	                    }

	                    if (q2 > q){
	                        String temp = words[i];
	                        words[i] = words[j];
	                        words[j] = temp;

	                    }else if(q2 == q){

	                        if (words[j].toLowerCase().compareTo(words[i].toLowerCase()) < 0) {

	                            String temp = words[j];
	                            words[j] = words[i];
	                            words[i] = temp;

	                        }
	                    }
	                }
	            }


	            if(words[0].length() > 0) {
	                newSentence1.append(words[0]);
	            }

	            for (int i = 1; i < words.length; i++){

	                if(words[i].length() > 0){
	                newSentence1.append(" ");
	                newSentence1.append(words[i]);}

	            }


	            int start = newStr1.indexOf(sentence.trim());
	            int end = start + sentence.trim().length();

	            newStr1.replace(start, end, newSentence1.toString());

	            newSentence1.setLength(0);
	        }

	        return newStr1.toString();
	    }

	    private static String secondMethod(String str) {

	        StringBuilder newStr = new StringBuilder(str);

	        String[] sentences = str.split("[?!.]");

	        StringBuilder newSentence = new StringBuilder();

	        for (String sentence:
	             sentences) {

	            String[] words = sentence.trim().split("\\s");

	            for(int i = 0; i < words.length-1; i++){
	                for(int j = i+1; j < words.length; j++){
	                    if(words[i].length() > words[j].length()){
	                        String temp = words[i];
	                        words[i] = words[j];
	                        words[j] = temp;
	                    }
	                }
	            }

	            for (String word : words) {

	                if (word.length() > 0) {

	                    if (newSentence.length() > 0) {

	                        newSentence.append(" ");
	                    }

	                    newSentence.append(word);
	                }

	            }


	            int start = newStr.indexOf(sentence.trim());
	            int end = start + sentence.trim().length();

	            newStr.replace(start, end, newSentence.toString());

	            newSentence.setLength(0);
	        }

	        return newStr.toString();
	    }


	    private static String firstMethod(String str) {

	        String[] paragraphs = str.trim().split("\\n");

	        StringBuilder newStr = new StringBuilder();

	        String regex = "([?!.])";

	        for(int i = 0; i < paragraphs.length-1; i++){

	            for(int j = i+1; j < paragraphs.length; j++){

	                if(paragraphs[j].trim().split(regex).length > paragraphs[i].trim().split(regex).length){

	                    String temp = paragraphs[i];
	                    paragraphs[i] = paragraphs[j];
	                    paragraphs[j] = temp;
	                }
	            }
	        }

	        for (String par:
	             paragraphs) {
	            newStr.append(par);
	            newStr.append("\n");
	        }

	        return newStr.toString();
	    }
}
