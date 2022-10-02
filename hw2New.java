public class hw2New {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();

        a.add(10);
        a.add(3);
        a.add(66);
        a.add(8);
        a.add(10);
        a.add(2);
        a.add(77);
        a.add(9);
        a.add(50);

        LinkedList b = new LinkedList();

        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(3);
        b.add(7);
        b.add(4);
        b.add(2);
        b.add(1);
        b.add(4);
        b.add(3);
        b.add(1);
        b.add(3);
        b.add(5);

        a.display("a");
        removeBeforeMin(a);
        a.display("after");
        //b.display("b");
        //average(b).display("mf");

    }

    // ex 1
    public static void reverseOdd(LinkedList a) {
        int l = a.size();
        int temp = 0;
        int oddI = l - 1;

        for (int i = 0; i < oddI; i++) {

            if (((int) a.get(i)) % 2 == 1) {
                for (int j = oddI; j > i; j--) {
                    if (((int) a.get(j)) % 2 == 1) {
                        temp = ((int) a.get(j));
                        a.set(j, a.get(i));
                        a.set(i, temp);
                        oddI = j - 1;
                        break;
                    }
                }
            }
        }
    }

    // ex 2
    public static void swapMinMax(LinkedList a) {
        int temp = a.max();
        a.set(a.indexOf(a.max()), a.min());
        a.set(a.indexOf(a.min()), temp);
    }

    // ex 3
    public static void StoreLeftRight(LinkedList a) {
        int i = 0;
        int s = a.size();
        while (i < s) {
            if ((a.get(i) % 2) == 0) {
                a.insertAtBack(a.get(i));
                a.delete(i);
                s--;
            } else {
                i++;
            }
        }
    }

    //ex 4
    public static void swapSecMinMax(LinkedList a) {
        LinkedList b = new LinkedList();
        for (int i = 0; i < a.size(); i++)
            b.add(a.get(i));
        b.delete(a.indexOf(a.max()));
        b.delete(a.indexOf(a.min()));
        int smax = a.indexOf(b.max());
        int smin = a.indexOf(b.min());
        a.set(smax, b.min());
        a.set(smin, b.max());
    }

    //ex 5
    public static LinkedList inter(LinkedList a , LinkedList b) {
        LinkedList c = new LinkedList();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) == b.get(j)) {
                    c.add(a.get(i));
                }
            }
        }
        return c;
    }

    //ex 6
    public static int mostFreq(LinkedList a) {
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

    //ex 7
    public static LinkedList average(LinkedList a) {
        LinkedList avg = new LinkedList();
        for (int i = 0; i < a.size() - 2; i++) {
            avg.add((a.get(i) + a.get(i+1) + a.get(i+2))/3);
        }
        avg.insertAtFront(a.get(0));
        avg.insertAtBack(a.get(a.size()-1));
        return avg;
    }

    //ex 10
    public static void insertAfterMax(LinkedList a , int d) {
        a.insertAtPosition(d, (a.indexOf(a.max()) + 1));
    }

    //ex 11
    public static void insertBeforeMin(LinkedList a , int d) {
        a.insertAtPosition(d, (a.indexOf(a.min())));
    }

    //ex 12
    public static void removeMax(LinkedList a) {
        a.delete(a.indexOf(a.max()));
    }

    //ex 13
    public static void removeBeforeMin(LinkedList a) {
        a.delete((a.indexOf(a.min())) - 1);
    }

}