import java.util.Collections;
import java.util.LinkedList;

public class hw2 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();

        a.add(1);
        a.add(3);
        a.add(66);
        a.add(8);
        a.add(10);
        a.add(2);
        a.add(77);
        a.add(9);
        a.add(50);
        a.add(66);
        a.add(2);


        LinkedList<Integer> b = new LinkedList<>();

        b.add(10);
        b.add(13);
        b.add(2);
        b.add(18);
        b.add(100);
        b.add(66);
        b.add(71);
        b.add(9);
        b.add(51);


        System.out.println("original");
        System.out.println(a + " " + b);

        System.out.println("result");
        System.out.println(intersection(a , b));



    }

    //////////////////////////////////////////////////////
    //ex 1:
    public static void reverseOdd(LinkedList<Integer> a) {
        
        int l =a.size();
        int temp = 0;
        int oddI = l - 1;

        for (int i = 0; i < oddI; i++) {

            if (((int) a.get(i)) % 2 == 1) {
                for (int j = oddI; j > i; j--) {
                    if (((int) a.get(j))%2 == 1) {
                        temp = ((int) a.get(j));
                        a.set(j, a.get(i));
                        a.set(i, temp);
                        oddI = j-1;
                        break;
                    }
                }
            }
        }
    }

    //////////////////////////////////////////////
    //ex 2:
    public static void swapMinMax(LinkedList<Integer> a) {

        int max = (int) Collections.max(a);
        int maxI = a.indexOf(max);
        int min = (int) Collections.min(a);
        int minI = a.indexOf(min);
        int temp = max;
        a.set(maxI, min);
        a.set(minI, temp);
  
    }

    ///////////////////////////////////////////////
    //ex 3:
    public static LinkedList<Integer> StoreLeftRight(LinkedList<Integer> a) {

        LinkedList<Integer> b = new LinkedList<>();

        for (int i = 0; i < a.size(); i++) {
            
            if (((int) a.get(i)) % 2 == 1) {
                b.addFirst(a.get(i));
            } else {
                b.addLast(a.get(i));
            }
        }
        return b;
    }

    /////////////////////////////////////////////////////////////////////////////////////
    //ex 4:
    public static LinkedList<Integer> swapSecMinMax(LinkedList<Integer> a) {

        LinkedList<Integer> b = (LinkedList<Integer>) a.clone();

        int max = Collections.max(a);
        b.remove(a.indexOf(max));
        int secMax = Collections.max(b);

        int min = Collections.min(a);
        b.remove(a.indexOf(min));
        int secMin = Collections.min(b);

        int temp = secMax;
        a.set(a.indexOf(secMax), secMin);
        a.set(a.indexOf(secMin), temp);

        return a;
    }

    ///////////////////////////////////////////////////////////////////////
    //ex 5:

    public static LinkedList<Integer> intersection(LinkedList<Integer> a , LinkedList<Integer> b) {

        LinkedList<Integer> c = new LinkedList<>();

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) == b.get(j)) {
                    c.add(a.get(i));
                }
            }
        }

        return c;
    }

    ////////////////////////////////////////////////////////////////////////////////////
    //ex 6:
    public static int mostFErq(LinkedList<Integer> a) {

        int mostFreqE = 0;
        int mostFreq = 0;

        for (int i = 0; i < a.size(); i++) {
            int freq = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) == a.get(j)) {
                    freq++;
                }
            }
            if (freq > mostFreq) {
                mostFreq = freq;
                mostFreqE = a.get(i);
            }
        }

        return mostFreqE;
        
    }


}