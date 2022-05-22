package latiha.generic.application;

import latiha.generic.MyData;

public class CovariantApp {

    public static void main(String[] args) {

        /**
         * Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
         * Caranya agar generic object kita menjadi covariant adalah
            dengan menggunakan kata kunci (? exntends ParentClass.
         * Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi
            Contoh<? extends Object>
         * Covariant adalah read-only, jadi kita tidak bisa mengubah data genericnya,
         */

        MyData<String> stringMyData = new MyData<>("Yusuf Maulana");
        proses(stringMyData);

        MyData<? extends Object> myData = stringMyData;

    }
    private static void proses(MyData<? extends Object> myData){
        System.out.println(myData.getData());
//        myData.setData(1); tidak boleh karena berbahaya
    }
}
