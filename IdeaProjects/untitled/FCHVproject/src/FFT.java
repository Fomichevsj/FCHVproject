/**
 * Created by safomichev on 21.06.2017.
 */

import java.util.Scanner;

/*************************************************************************
 *  Compilation:  javac FFT.java
 *  Execution:    java FFT N
 *  Dependencies: Complex.java
 *
 *  Compute the FFT and inverse FFT of a length N complex sequence.
 *  Bare bones implementation that runs in O(N log N) time. Our goal
 *  is to optimize the clarity of the code, rather than performance.
 *
 *  Limitations
 *  -----------
 *   -  assumes N is a power of 2
 *
 *   -  not the most memory efficient algorithm (because it uses
 *      an object type for representing complex numbers and because
 *      it re-allocates memory for the subarray, instead of doing
 *      in-place or reusing a single temporary array)
 *
 *************************************************************************/

public class FFT {

    // compute the FFT of x[], assuming its length is a power of 2
    public static Complex[] fft(Complex[] x) {
        int N = x.length;

        // base case
        if (N == 1) return new Complex[] { x[0] };

        // radix 2 Cooley-Tukey FFT
        if (N % 2 != 0) { throw new RuntimeException("N is not a power of 2"); }

        // fft of even terms
        Complex[] even = new Complex[N/2];
        for (int k = 0; k < N/2; k++) {
            even[k] = x[2*k];
        }
        Complex[] q = fft(even);

        // fft of odd terms
        Complex[] odd  = even;  // reuse the array
        for (int k = 0; k < N/2; k++) {
            odd[k] = x[2*k + 1];
        }
        Complex[] r = fft(odd);

        // combine
        Complex[] y = new Complex[N];
        for (int k = 0; k < N/2; k++) {
            double kth = -2 * k * Math.PI / N;
            Complex wk = new Complex(Math.cos(kth), Math.sin(kth));
            y[k]       = q[k].plus(wk.times(r[k]));
            y[k + N/2] = q[k].minus(wk.times(r[k]));
        }
        return y;
    }

    // display an array of Complex numbers to standard output
    public static void show(Complex[] x, String title) {
        System.out.println(title);
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i].re());
            System.out.print("  + ");
            System.out.println(x[i].im()+ "I");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        Complex[] x = new Complex[N];

        // original data
        double FS = 8000;
        double ts = -1/FS;
        for (int i = 0; i < N; i++) {
            ts = ts + 1/FS;
            System.out.print(ts + " ");
            System.out.println("");
            x[i] = new Complex(i, 0);
            x[i] = new Complex(Math.sin(2*Math.PI*1000*ts)
                                    + 0.5*Math.sin(2*Math.PI*2000*ts + 3*Math.PI/4), 0);
        }
        show(x, "Original x8");

        // FFT of original data
        Complex[] y = fft(x);
        show(y, "y = fft(x)");

        
    }

}
