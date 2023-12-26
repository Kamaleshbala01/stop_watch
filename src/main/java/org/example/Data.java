package org.example;

public class Data {
    private static long startTime,endTime,milliseconds = 0;
    private static boolean start;

    public static boolean isStart() {
        return start;
    }

    public static void setStart(boolean start) {
        Data.start = start;
    }

    public static long getMilliseconds() {
        return milliseconds;
    }

    public static long getStartTime() {
        return startTime;
    }

    public static void setStartTime(long startTime) {
        Data.startTime = startTime;
    }

    public static void setMilliseconds(long milliseconds) {
        Data.milliseconds = milliseconds;
    }

    public static long getEndTime() {
        return endTime;
    }

    public static void setEndTime(long endTime) {
        Data.endTime = endTime;
    }
}
