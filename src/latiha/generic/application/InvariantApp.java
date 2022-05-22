package latiha.generic.application;

import latiha.generic.MyData;

public class InvariantApp {

    public static void main(String[] args) {

        /**
         * Generic tidak bisa disubtitusi. Tidak ada hubungannya dengan polymorph.
         * Apabila sebuag generic di assign sebagai String makan hanya dapat dikirim ke paramter yang menerima type yang sama.
         */

        MyData<String> stringMyData = new MyData<>("Yusuf");
//        doIt(stringMyData); ERROR
        MyData<Object> objectMyData = new MyData<>(1111);
//        MyData<Integer> integerMyData = objectMyData;
    }

    private static void doIt(MyData<Object> objectMyData){
        //do nothing
    }
}
