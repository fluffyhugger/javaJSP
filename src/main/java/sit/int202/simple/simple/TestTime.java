package sit.int202.simple.simple;

import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        Date d1 = new Date(1000);
        System.out.println(d1);
        Date d2 = new Date(1000*60*60*24);
        System.out.println(d2);
        System.out.println(System.currentTimeMillis());
        Date toDay = new Date(1693903449834L);
        System.out.println(toDay);
    }
}
