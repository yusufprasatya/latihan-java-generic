package latiha.generic.application;

import latiha.generic.MyData;

public class ContraVariant {

    public static void main(String[] args) {

        /**
         * Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child).
         * Caranya agar generic object kita menjadi covariant adalah dengan menggunakan kata kunci
            (? super SubClass)
         * Artinya saat kita membuat object Contoh<Object>, maka bisa disubtitusi menjadi Contoh<? super String>
         * Contravariant adalah bisa write and read, namun perlu berhati-hati ketika melakukan read, terutama
            jika parentnya punya banyak child.
         */
        MyData<Object> objectMyData = new MyData<>("Muhamad Yusuf");
        MyData<? super String> myData = objectMyData;

        objectMyData.setData(1222);
        proses(objectMyData);
        System.out.println(objectMyData.getData());
    }

    private static void proses(MyData<? super String>myData ){
//        String value = (String) myData.getData();
        Object value = myData.getData();

        System.out.println("Proses parameter " + value);

        myData.setData("Ucok prasatya");

    }
}
