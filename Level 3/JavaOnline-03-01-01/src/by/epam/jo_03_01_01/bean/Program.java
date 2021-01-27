/*
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

package by.epam.jo_03_01_01.bean;

public class Program {

	public static void main(String[] args) {

        String[] words = {"camelCase"};

        for (String word : words) {

            System.out.println(getSnakeCaseFrom(word));

        }
    }

    private static String getSnakeCaseFrom(String word) {

        char[] chars = word.toCharArray();
        int k = 0;

        for (char ch : chars) {

           if(Character.isUpperCase(ch) || (!Character.isLowerCase(ch)&&!Character.isUpperCase(ch))){
               k++;
           }

        }

        char[] newChars = new char[chars.length + k];

        for(int i = 0, j = 0; i < newChars.length; i++, j++){

            if(Character.isLowerCase(chars[j])){
                newChars[i] = chars[j];
            }
            else {
                newChars[i] = '_';
                chars[j] = Character.toLowerCase(chars[j]);
                newChars[i+1] = chars[j];
                i++;
            }
        }

        word = new String(newChars);

        return word;
    }
}
