 /*
      Дана строка, содержащая следующий текст (xml-документ):
      
		<notes>
		 <note id = "1">
		 <to>Вася</to>
		 <from>Света</from>
		 <heading>Напоминание</heading>
		 <body>Позвони мне завтра!</body>
		 </note>
		 <note id = "2">
		 <to>Петя</to>
		 <from>Маша</from>
		 <heading>Важное напоминание</heading>
		 <body/>
		 </note>
		</notes>
	
	Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
	тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
	нельзя.
*/

package by.epam.jo_03_03_02.bean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {

	 public static void main(String[] args) {

	       String str = "<notes>\n" +
	                "             <note id = \"1\">\n" +
	                "                 <to>Вася</to>\n" +
	                "                 <from>Света</from>\n" +
	                "                 <heading>Напоминание</heading>\n" +
	                "                 <body>Позвони мне завтра!!</body>\n" +
	                "             </note>\n" +
	                "                 <note id = \"2\">\n" +
	                "                 <to>Петя</to>\n" +
	                "                 <from>Маша</from>\n" +
	                "                 <heading>Важное напоминание</heading>\n" +
	                "                 <body/>\n" +
	                "             </note>\n" +
	                "</notes>";
	        analyzer(str);

	    }

	    private static void analyzer(String str) {

			String[] tegs = str.split("\n");

			Pattern p1 = Pattern.compile("<[^/]{1,}>"); 
			Pattern p2 = Pattern.compile("</.{1,}>");
			Pattern p3 = Pattern.compile("<[^/]{1,}/>.*");
			Pattern p4 = Pattern.compile("(?<=>)([\\s\\S]*?)(?=<)");

			for (String teg : tegs) {
				Matcher m1 = p1.matcher(teg);

				while (m1.find()) {
					System.out.println(m1.group() + " - Открывающийся тег");
				}

				Matcher m4 = p4.matcher(teg);
				while (m4.find()) {
					System.out.println(m4.group() + " - Содержимое тега");
				}

				Matcher m2 = p2.matcher(teg);
				while (m2.find()) {
					System.out.println(m2.group() + " - Закрывающийся тег");
				}

				Matcher m3 = p3.matcher(teg);
				while (m3.find()) {
					System.out.println(m3.group() + " - Тег без тела");
				}

			}
		}
	}
