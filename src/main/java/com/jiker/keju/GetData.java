package com.jiker.keju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class GetData {

//    private static final String file = "D:\\workroom\\tdd-taxi-seed-master\\src\\main\\resources\\testData.txt";
    private static final String file = GetData.class.getClassLoader().getResource( "testData.txt" ).getPath();
    public static List<String> list1;
    public static int length1;


    public static void getArray() {
        ReadFile readFile = new ReadFile();
        readFile.toArrayByFileReader( file );
        int length = readFile.arrayList.size();
        List<String> list = new ArrayList<>(  );
        String cs[];

        for (int i = 0; i < length; i++) {

            String line = readFile.arrayList.get( i );
            String regEx = "[^0-9]+";
            Pattern pattern = Pattern.compile( regEx );
            cs = pattern.split( line );
            String str = Arrays.toString( cs );
            list.add( str );
            list1 = list;
            length1 = length;

        }

    }

}