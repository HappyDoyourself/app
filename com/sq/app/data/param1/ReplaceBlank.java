package com.sq.app.data.param1;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/12 4:27 PM
 * @Version 1.0
 */
public class ReplaceBlank {

    /**请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */
    private static String replaceBlank(String str){
        System.out.println(str.replaceAll(" ","%20"));

        str = str.replaceAll(" ","%20");
        return str;
    }

    public static void main(String[] args) {
        String str = "we are aaa";
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.toString());
        str = replaceBlank(str);

        System.out.println("result:" + str);
    }
}
