package com.sq.app.lamb.bisupplier;

/**
 * @Author fanht
 * @Description
 * @Date 2020/12/9 下午8:44
 * @Version 1.0
 */

public class Gps {

    private String X;

    private String Y;

    public Gps(String x, String y) {
        X = x;
        Y = y;
    }

    public String getX() {
        return X;
    }

    public void setX(String x) {
        X = x;
    }

    public String getY() {
        return Y;
    }

    public void setY(String y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "Gps{" +
                "X='" + X + '\'' +
                ", Y='" + Y + '\'' +
                '}';
    }
}
