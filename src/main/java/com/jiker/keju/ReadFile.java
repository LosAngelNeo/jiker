package com.jiker.keju;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {

    public static List<String> arrayList = new ArrayList<String>();

    public static List<String> toArrayByFileReader(String filename) {
        File file = new File(  filename );
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //打开文件
            fr = new FileReader( file );
            br = new BufferedReader( fr );

            //读文件，并将读取的数据存储在List集合中
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().equals( "" )) {
                    arrayList.add( line );
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println( e.getMessage() );

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件，要求：反方向倒着关闭资源，先关闭br，再关闭fr
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println( e.getMessage() );
                }

            }

            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println( e.getMessage() );
                }
            }

        }

        return arrayList;

    }



}

