// Èç çàäàííîãî ÷èñëà âû÷ëè ñóììó åãî öèôğ. Èç ğåçóëüòàòà âíîâü âû÷ëè ñóììó åãî öèôğ è ò.ä. Ñêîëüêî òàêèõ
// äåéñòâèé íàäî ïğîèçâåñòè, ÷òîáû ïîëó÷èëñÿ íóëü? Äëÿ ğåøåíèÿ çàäà÷è èñïîëüçîâàòü äåêîìïîçèöèş.
package by.epam.jo_02_04_17.bean;

public class Program {

	public static void main(String[] args) {

	       int N = 125682;

	       int q = getQ(N);

	       System.out.println("Êîëè÷åñòâî äåéñòâèé =" + q);
	    }

	    private static int getQ(int N) {
	        int n = N;

	        int q = 0;

	        do{
	            q++;
	            n -= getSum(n);

	        }while (n != 0);

	        return q;
	    }

	    private static int getSum(int N) {

	        int sum = 0;
	        int num = N;

	        while (num / 10 > 0){
	           sum += num % 10;
	           num = (num - num % 10) /10;
	        }

	        sum += num % 10;

	        return sum;
	    }
}
