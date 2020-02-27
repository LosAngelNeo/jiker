package com.jiker.keju;

public class AppRunner {

    public static void main(String[] args) {
        /*TODO
          1. args[0]为resources下的测试数据文件名，例如传入的args[0]值为"testData.txt"，注意并不包含文件路径。
          2. 你写的程序将把testDataFile作为参数加载此文件并读取文件内的测试数据，并对每条测试数据计算结果。
          3. 将所有计费结果拼接并使用\n分割，然后保存到receipt变量中。
         */
//        String testDataFile =AppRunner.class.getResource( "testData.txt" ).getPath();


        GetData getData = new GetData();
        getData.getArray();
        for (int i = 0; i < getData.length1; i++) {
            String str = getData.list1.get( i );
            str = str.replace( "[", "" );
            str = str.replace( "]", "" );
            String[] arr = str.split( "," );

            int kilometer = Integer.parseInt( arr[0] );
           int minute = Integer.parseInt( arr[1].trim() );

           Valuation valuation = new Valuation();
            int price = valuation.charge( kilometer, minute );

            String receipt = "";
           receipt += "收费" + price + "元" + "\n";
           System.out.println( receipt );
        }
    }
}
