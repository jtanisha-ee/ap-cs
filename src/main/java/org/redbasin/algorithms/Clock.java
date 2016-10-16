package org.redbasin.algorithms;

/**
 * Created by manojjoshi on 10/16/16.
 */
public class Clock {

    public static String addTimeSecs(String time, int secs) {
        String[] timeArr = time.split(":");
        String hhStr = timeArr[0];
        String mmStr = timeArr[1];
        String ssStr = timeArr[2];
        int hh = new Integer(hhStr).intValue();
        int mm = new Integer(mmStr).intValue();
        int ss = new Integer(ssStr).intValue();
        int csecs = hh*3600 + mm*60 + ss;
        int nsecs = csecs + secs;
        int nhh = (nsecs/3600)%24;
        int nmm = (nsecs%3600)/60;
        int nss = (nsecs%3600)%60;
        System.out.println("nsecs = " + nsecs + ", nhh = " + nhh +
                ", nmm = " + nmm + ", nss = " + nss);
        return nhh + ":" + nmm + ":" + nss;
    }

    public static void main(String[] args) {
        System.out.println(addTimeSecs("23:11:13", 145730));
    }
}
