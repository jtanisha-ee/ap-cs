package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 10/23/16.
 */
public class ClockPlay {

    public static String addTimeInSecs(String d, int secs) {
        String hhs = d.substring(0, 2);
        String mms = d.substring(3, 5);
        String sss = d.substring(6, 8);
        int hh = new Integer(hhs);
        int mm = new Integer(mms);
        int ss = new Integer(sss);
        int s = hh*3600 + mm*60 + ss;
        int total = s + secs;
        int nhh = (total/3600)%24;
        int nmm = (total%3600)/60;
        int nss = (total%3600)%60;
        return nhh + ":" + nmm + ":" + nss;
    }

    public static void main(String[] args) {
        String d = "09:38:07";
        System.out.println(addTimeInSecs(d, 15234));
        System.out.println(addTimeInSecs(d, 45489));
        System.out.println(addTimeInSecs(d, 875489));
    }
}
