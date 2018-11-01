package cn.songm.yix.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.songm.common.beans.Entity;

public class Predict extends Entity {

    private static final long serialVersionUID = 6882246972189325919L;

    public static final Map<Integer, Integer> HOURS = new HashMap<>();

    static {
        HOURS.put(0, 1);
        HOURS.put(1, 2);
        HOURS.put(2, 2);
        HOURS.put(3, 3);
        HOURS.put(4, 3);
        HOURS.put(5, 4);
        HOURS.put(6, 4);
        HOURS.put(7, 5);
        HOURS.put(8, 5);
        HOURS.put(9, 6);
        HOURS.put(10, 6);
        HOURS.put(11, 7);
        HOURS.put(12, 7);
        HOURS.put(13, 8);
        HOURS.put(14, 8);
        HOURS.put(15, 9);
        HOURS.put(16, 9);
        HOURS.put(17, 10);
        HOURS.put(18, 10);
        HOURS.put(19, 11);
        HOURS.put(20, 11);
        HOURS.put(21, 12);
        HOURS.put(22, 12);
        HOURS.put(23, 1);
    }

    private Long preId;
    private String matter;
    private Date time;
    private Integer num1;
    private Integer num2;
    private Integer num3;

    public Long getPreId() {
        return preId;
    }

    public void setPreId(Long preId) {
        this.preId = preId;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer getNum3() {
        return num3;
    }

    public void setNum3(Integer num3) {
        this.num3 = num3;
    }

    public int getHour() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(time);
        return HOURS.get(cal.get(Calendar.HOUR_OF_DAY));
    }

    public int getGuaIndexS() {
        int n = num1 % 8;
        if (n == 0)
            return 8;
        return n;
    }

    public int getGuaIndexX() {
        int n = (num2 + num3) % 8;
        if (n == 0)
            return 8;
        return n;
    }

    public int getDongYao() {
        int n = (num1 + num2 + num3 + getHour()) % 6;
        if (n == 0)
            return 6;
        return n;
    }
}
