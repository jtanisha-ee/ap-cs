package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 9/25/16.
 */
public class FindingMotifs {

    /**
     * Look for a known pattern
     * As r = repeats increases, the chance of motif increases
     * As n = length of string increases, the chance of motif decreases
     * As k = length of motif increases, the chance of motif decreases
     * Hence the ratio r/(k*n) is used in this code.
     * @param s
     * @return
     */
    public static boolean isPattern(String s, String motif) {
        int n = s.length();
        int k = motif.length();
        int motifIndex = 0;
        int r = 0;  // number of repeats of pattern
        double d = 0.03;  // tune this parameter over time

        if (k < 4) return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // fetch ith char in
            char mchar = motif.charAt(motifIndex); // fetch motifIndexth char in motif
            if (c == mchar) {  // compare char extracted from s with the current motif char
                if (motifIndex == (k-1)) { // make sure you have not reached the end of motif
                    r++;  // this pattern is repeated one more time
                    motifIndex = 0; // reset the motifIndex back to 0
                } else {  // not reached end of motif
                    motifIndex++; // advance ahead to check next char in motif
                }
            }
        }
        System.out.println("numRepeats = " + r);
        double ratio = (double)r/(k*n);
        System.out.println("ratio = " + ratio);
        if (ratio > d) {  // if ratio larger than magic no, then it must be a pattern
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "a091de786g91de3058791de3";
        String m = "91de";

        System.out.println(m + " is a pattern? " + isPattern(s, m));

    }
}
