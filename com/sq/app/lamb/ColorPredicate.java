package com.sq.app.lamb;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author fanht
 * @Description
 * @Date 2020/8/4 上午10:59
 * @Version 1.0
 */
public class ColorPredicate {

    private static final String RED = "红色";

    /*@Override
    public boolean test(Product product) {
        return RED.equals(product.getColor());
    }*/




    public List<Product> filterProductByPredicate(List<Product> list, MyPredicate<Product> mp){
        List<Product> prods = new ArrayList<>();
        for (Product prod : list){
            if (mp.test(prod)){
                prods.add(prod);
            }
        }
        return prods;
    }

    /**
     * 匿名内部类 颜色比较
     */
    public  void test2(){
        List<Product> list  = new ArrayList<>();
        filterProductByPredicate(list, new MyPredicate<Product>() {
            @Override
            public boolean test(Product product) {
                return RED.equals(product.getColor());
            }
        });
    }

    /***
     * 匿名内部类 价格比较
     */
    public void test3(){
        List<Product> list  = new ArrayList<>();
        filterProductByPredicate(list, new MyPredicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getPrice() < 8000;
            }
        });
    }


    /**
     * lamb 表达式  匿名内部类 写法
     */
    public void Test4(){
        List<Product> proList  = this.proList();
        List<Product> productList = filterProductByPredicate(proList,(p) ->p.getPrice()<8000);

        productList.forEach(p ->{
            System.out.println("======" + JSONObject.toJSONString(p));
        });
    }


      public void test5(){
    /**价格过滤*/
        List<Product> proList  = this.proList();
        System.out.println(JSONObject.toJSONString(proList));


        proList.stream().filter((p) -> p.getPrice()<6000).limit(2).forEach(System.out::println);

        System.out.println(JSONObject.toJSONString(proList));

        proList.stream().map(Product::getPrice).forEach(System.out::println);
    }


    private List<Product> proList(){
        List<Product> proList  = new ArrayList<>();
        Product product = new Product();
        product.setPrice(new Double(7000));
        product.setColor(RED);
        proList.add(product);

        Product product1 = new Product();
        product1.setPrice(new Double(5000));
        product1.setColor("green");
        proList.add(product1);

        return proList;
    }



      public void test6(){
        changeStr("hello",(str)-> System.out.println(str));
    }

    /**
     *  Consumer<T> 消费型接口
     * @param str
     * @param con
     */
    public void changeStr(String str, Consumer<String> con){
        con.accept(str);
    }


     public void test7(){
        String value = getValue(() -> "hello");
        System.out.println(value);
    }

    /**
     *  Supplier<T> 供给型接口
     * @param sup
     * @return
     */
    public String getValue(Supplier<String> sup){
        return sup.get();
    }


    @Test
     public void test8(){
        Long result = changeNum(100L,(x) -> x+200L);
        System.out.println(result);
    }

    /**
     * 有参数有返回值
     * @param num
     * @param function
     * @return
     */
    public Long changeNum(Long num, Function<Long,Long> function){
        return function.apply(num);
    }


    public void test9(){
        boolean bl = changeBoolean("hello",(str) -> str.length() > 5);
        System.out.println(bl);
    }

    /**
     * 断言型接口 有参数 有返回值 boolean
     * @param str
     * @param predicate
     * @return
     */
    public boolean changeBoolean(String str, Predicate<String> predicate){
        return predicate.test(str);
    }


    public void test10(){
/*        Consumer<Integer> con = (x) > System.out.println(x);
        con.accept(100);*/
        // 方法引用-对象::实例方法
        Consumer<Integer> con2 = System.out::println;
        con2.accept(200);

        // 方法引用-类名::静态方法名
        //BiFunction<Integer, Integer, Integer> biFun = (x, y) -> Integer.compare(x, y);
        BiFunction<Integer, Integer, Integer> biFun2 = Integer::compare;
        Integer result = biFun2.apply(100, 200);
        System.out.println(result);

        // 方法引用-类名::实例方法名
        /**前面两个是参数 最后一个是输出结果*/
        //BiFunction<String, String, Boolean> fun1 = (str1, str2) -> str1.equals(str2);
        BiFunction<String, String, Boolean> fun2 = String::equals;
        Boolean result2 = fun2.apply("hello", "world");
        System.out.println(result2);


        // 构造方法引用  类名::new
        Supplier<Product> sup = () -> new Product();
        System.out.println(sup.get());
        Supplier<Product> sup2 = Product::new;
        System.out.println(sup2.get());

        // 构造方法引用 类名::new （带一个参数）
        Function<String, Product> fun = (x) -> new Product(x);
        Function<String, Product> function2 = Product::new;
        System.out.println(function2.apply("green"));


        // 数组引用
        Function<Integer, String[]> funArray = (x) -> new String[x];
        Function<Integer, String[]> funArray2 = String[]::new;
        String[] strArray = funArray2.apply(10);
        Arrays.stream(strArray).forEach(System.out::println);


    }

    /**
     * Stream API
     */
    public void test11(){
        /**stream创建*/
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        System.out.println(JSONObject.toJSONString(stream1));

        // 2.通过Arrays的静态方法stream()获取数组流
        String[] str = new String[1];
        Stream<String> stream2 = Arrays.stream(str);
        stream2.forEach(System.out::println);

        // 3.通过Stream类中的静态方法of
        Stream<String> stream3 = Stream.of("aa","bb","cc");
        stream3.forEach(System.out::println);

        // 4.创建无限流
        // 迭代
        /*Stream<Integer> stream4 = Stream.iterate(0,(x) -> x+2);
        stream4.forEach(System.out::println);*/

        //随机生成
        Stream.generate(() ->Math.random());


        /**
         * 筛选 过滤  去重
         */
        List<Product> emps = this.proList();
        emps.stream()
                .filter(e -> e.getPrice() > 10)
                .limit(2)
                .skip(1)
                .distinct()
                .forEach(System.out::println);

        /**
         *  生成新的流 通过map映射
         */
        emps.stream()
                .map((e) -> e.getPrice())
                .forEach(System.out::println);

        /**
         *  自然排序  定制排序
         */
        emps.stream()
                .sorted((e1 ,e2) -> {
                    if (e1.getPrice().equals(e2.getPrice())){
                        return e1.getColor().compareTo(e2.getColor());
                    } else{
                        return e1.getPrice().compareTo(e2.getPrice());
                    }
                })
                .forEach(System.out::println);

    }

    /**
     * Stream的 终止操作
     */

    public void test12(){
/**
 *      查找和匹配
 *          allMatch-检查是否匹配所有元素
 *          anyMatch-检查是否至少匹配一个元素
 *          noneMatch-检查是否没有匹配所有元素
 *          findFirst-返回第一个元素
 *          findAny-返回当前流中的任意元素
 *          count-返回流中元素的总个数
 *          max-返回流中最大值
 *          min-返回流中最小值
 */

        /**
         *  检查是否匹配元素
         */

        List<Product> emps = this.proList();

        boolean b1 = emps.stream()
                .allMatch((e) -> e.getColor().equals(RED));
        System.out.println(b1);

        boolean b2 = emps.stream()
                .anyMatch((e) -> e.getColor().equals(RED));
        System.out.println(b2);

        boolean b3 = emps.stream()
                .noneMatch((e) -> e.getColor().equals(RED));
        System.out.println(b3);

        /*Optional<Employee> opt = emps.stream()
                .findFirst();
        System.out.println(opt.get());

        // 并行流
        Optional<Employee> opt2 = emps.parallelStream()
                .findAny();
        System.out.println(opt2.get());

        long count = emps.stream()
                .count();
        System.out.println(count);

        Optional<Employee> max = emps.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(max.get());

        Optional<Employee> min = emps.stream()
                .min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(min.get());*/

        /**
         *  reduce ：规约操作
         */
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer count2 = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(count2);

        Optional<Double> sum = emps.stream()
                .map(Product::getPrice)
                .reduce(Double::sum);
        System.out.println(sum);

        /**
         *  collect：收集操作
         */

        List<Double> ageList = emps.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());
        ageList.stream().forEach(System.out::println);
    }
}
