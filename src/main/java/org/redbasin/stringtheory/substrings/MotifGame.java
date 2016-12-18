package org.redbasin.stringtheory.substrings;

/**
 * Created by manojjoshi on 9/25/16.
 */
public class MotifGame {

    public static void main(String[] args) {
        String s = "0bfxlmtzfxlmt90lzfxlm3";

        String motif = "fxlm"; // looking for known patterns
        int n = s.length();
        int k = motif.length();
        int r = 0;
        double d = 0.02; // tune this ratio over time
        int motifIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // extracted ith char of str
            char mchar = motif.charAt(motifIndex); // extracted motifIndexth char of motif
            if (mchar == c) { // found a specific char in motif
                if (motifIndex > (k - 1)) // not done with fxlm
                    motifIndex++; // increment index in motif
                else { // found the entire pattern
                    r++;   // increment number of repeats
                    motifIndex = 0; // reset index back to f
                }
            }
        }

        double ratio = (double) r / (k * n);
        System.out.println("n = " + n);
        System.out.println("r = " + r);
        System.out.println("ratio = " + ratio);
        if (ratio > d) {
            System.out.println(motif + " is a pattern");
        }
    }
}
