package test;

import org.xml.sax.ext.Locator2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJava {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        byte b = Byte.MAX_VALUE;
        list.add("MaxByte - " + b);
        byte b2 = Byte.MIN_VALUE;
        list.add("MinByte - " + b2);
                
        short s = Short.MAX_VALUE;
        list.add("MaxShort - " + s);
        short s2 = Short.MIN_VALUE;
        list.add("MinShort - " + s2);
                
        int i = Integer.MAX_VALUE;
        list.add("MaxInt - " + i);
        int i2 = Integer.MIN_VALUE;
        list.add("MinInt - " + i2);
                
        long l = Long.MAX_VALUE;
        list.add("MinLong - " + l);
        long l2 = Long.MIN_VALUE;
        list.add("MinLong - " + l2);
                
        float f = Float.MAX_VALUE;
        list.add("MaxFloat - " + f);
        float f2 = Float.MIN_VALUE;
        list.add("MinFloat - " + f2);
                
        double d = Double.MAX_VALUE;
        list.add("MaxDouble - " + d);
        double d2 = Double.MIN_VALUE;
        list.add("MinDouble - " + d2);
                
        char c = Character.MAX_VALUE;
        list.add("MaxChar - " + c);
        char c2 = Character.MIN_VALUE;
        list.add("MinChar - " + c2);
                
        boolean bol = true;
        list.add("boolean - " + bol);
        boolean bol2 = false;
        list.add("boolean - " + bol2);
        
        list.forEach(System.out::println);

        System.out.println("\nПереполнение");
        System.out.println("Byte в плюс" + ++b);
        System.out.println("Byte в минус" + --b2);
        System.out.println("Long в плюс" + ++l);
        System.out.println("Long в минус" + --l2);

        System.out.println("\nРазные типы");
        double d3 = 100.10;
        int i3 = 10;
        System.out.println(d3 / i3);
    }
}
