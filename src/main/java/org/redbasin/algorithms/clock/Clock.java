package org.redbasin.algorithms.clock;

/**
 * Created by manojjoshi on 10/16/16.
 */
public class Clock {

    public static String getTime(int secs) {
        int nhh = (secs/3600)%24;
        int nmm = (secs%3600)/60;
        int nss = (secs%3600)%60;
        return nhh + ":" + nmm + ":" + nss;
    }

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

    public static int getHH(String time) {
        String hhs = time.substring(0, 2);
        return new Integer(hhs).intValue();
    }

    public static int getMM(String time) {
        String mms = time.substring(3, 5);
        return new Integer(mms).intValue();
    }

    public static int getSS(String time) {
        String sss = time.substring(6, 8);
        return new Integer(sss).intValue();
    }

    public static int getSecs(int hh, int mm, int ss) {
        return hh*60*60 + mm*60 + ss;
    }

    public static String addHHMMSS(String time1, String time2) {
        int hh1 = getHH(time1);
        int mm1 = getMM(time1);
        int ss1 = getSS(time1);
        int hh2 = getHH(time2);
        int mm2 = getMM(time2);
        int ss2 = getSS(time2);
        int secs1 = getSecs(hh1, mm1, ss1);
        int secs2 = getSecs(hh2, mm2, ss2);
        int secs3 = secs1 + secs2;
        return getTime(secs3);
    }

    public static String diffHHMMSS(String time1, String time2) {
        int hh1 = getHH(time1);
        int mm1 = getMM(time1);
        int ss1 = getSS(time1);
        int hh2 = getHH(time2);
        int mm2 = getMM(time2);
        int ss2 = getSS(time2);
        int secs1 = getSecs(hh1, mm1, ss1);
        int secs2 = getSecs(hh2, mm2, ss2);
        int secs3 = Math.abs(secs1 - secs2);
        return getTime(secs3);
    }

    /**
     * Returns true if time1 occurs before time2, returns false if it is equal or time1 occurs after time2
     * @param time1
     * @param time2
     * @return
     */
    public static boolean lesser(String time1, String time2) {
        int hh1 = getHH(time1);
        int mm1 = getMM(time1);
        int ss1 = getSS(time1);
        int hh2 = getHH(time2);
        int mm2 = getMM(time2);
        int ss2 = getSS(time2);
        if (hh1 < hh2) return true;
        if (hh1 > hh2) return false;
        if (mm1 < mm2) return true;
        if (mm1 > mm2) return false;
        if (ss1 < ss2) return true;
        if (ss1 > ss2) return false;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(lesser("12:15:17", "12:17:15"));
        //System.out.println(addTimeSecs("23:11:13", 145730));
        System.out.println(addHHMMSS("11:23:16", "06:44:22"));
        System.out.println(addHHMMSS("11:23:16", "16:44:22"));
        System.out.println(diffHHMMSS("11:23:16", "06:44:22"));
        System.out.println(diffHHMMSS("11:23:16", "16:44:22"));
    }

    /**
     * Created by manojjoshi on 10/23/16.
     */
    public static class ClockPlay {

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
}
