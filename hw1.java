public class hw1 {

    public static void main(String[] args) {

        // ex 1:

        ///////////////////////////////////////////////

        //ex 2:

        // 
        ////////////////////////////////////////////////////////////////

        //ex 6:

        // int[] a = {1, 2 , 3, 4, 5, 6, 3, 7, 4, 2, 1, 4, 3, 1, 3, 5};

        // System.out.println("the most frequent element is: " + mostFreqElement(a));

        int[] a = {1, 2, 3, 4, 7, 6, 3, 7, 4, 2, 1, 4, 3, 1, 2, 5};


        double[] c = average(a);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + "  ");
        }



        
    }

    ///////////////////////////////////
    //ex 1

    public static void reverseOdd(int[] a) {
        
        int l =a.length;
        int temp = 0;
        int oddI = l - 1;

        for (int i = 0; i < oddI; i++) {

            if (a[i]%2 == 1) {
                for (int j = oddI; j > i; j--) {
                    if (a[j]%2 == 1) {
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                        oddI = j-1;
                        break;
                    }
                }
            }
        }
    }
    ///////////////////////////////////
    //ex 2
    public static void swapMinMax(int[] a) {
        
        int max = a[0];
        int min = a[0];
        int maxI = 0;
        int minI = 0;
        int temp = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxI = i;
                
            } else if(a[i] < min){
                min = a[i];
                minI = i;
                
            }
        }
        temp = a[minI];
        a[minI] = a[maxI];
        a[maxI] = temp;

    }

    
    //////////////////////////////////////////////////
    //ex 3 me

    public static void StoreLeftRight(int[] a){

        int[] odd = new int[a.length];
        int oddC = 0;
        int[] even = new int[a.length];
        int evenC = 0;
        for (int i = 0; i < a.length; i++) {   
            if (a[i]%2 == 0) {
                even[evenC] = a[i];
                evenC++;
            } else {
                odd[oddC] = a[i];
                oddC++;
            }
        }
        for (int i = 0; i < oddC; i++) {
            a[i] = odd[i];
        }
        for (int i = 0; i < evenC; i++) {
            a[oddC + i] = even[i];
        }
    }

    ////////////////////////////////////
    //ex 4

    public static void swapSecMinMax(int[] a) {
        
        int max = -2147483648;
        int maxI = 0;
        int secMax = -2147483648;
        int sMaxI = 0;
        int min = 2147483647;
        int minI = 0;
        int secMin = 2147483647;
        int sMinI = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {

                secMax = max;
                sMaxI = maxI;
                max = a[i];
                maxI = i;
                
            } else if (a[i] > secMax) {
                secMax = a[i];
                sMaxI = i;
                
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secMin = min;
                sMinI = minI;
                min = a[i];
                minI = i;
                
            } else if(a[i] < secMin){
                secMin = a[i];
                sMinI = i;
            }
        }

        int temp = secMax;
        a[sMaxI] = secMin;
        a[sMinI] = temp;


    }

    ///////////////////////////////////////////
    // ex5

    public static int[] intersection(int[] a , int[] b) {
        
        int[] c = new int[a.length];
        int cI = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[cI] = a[i];
                    cI++;
                }
            }
        }
        return c;

    }

    ///////////////////////////////////
    //ex 6

    public static int mostFreqElement(int[] a) {

        int maxFreq = 0;
        int maxFreqE = 0;
        int l = a.length;

        for (int i = 0; i < l; i++) {
            int freq = 0;
            for (int j = 0; j < l; j++) {
              if (a[i] == a[j]) {
                freq++;
              }
            }
            if (freq > maxFreq) {
              maxFreq = freq;
              maxFreqE = a[i];
            }
          }
          return maxFreqE;

        
    }

    ////////////////////////////////////////////
    //ex 7

    public static double[] average(int a[]) {

        int l = a.length;
        double[] b = new double[l];

        b[0] = a[0];
        b[l-1] = a[l-1];

        for (int i = 0; i < l-2; i++) {
            b[i+1] = (a[i]+a[i+1]+a[i+2])/3.0;
        }
        return b;
    }

}