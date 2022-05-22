package latiha.generic.application;

public class BoundedTypeApp {

    public static void main(String[] args) {

        /**
         * Bounded type parameter
         * Terkadang kita ingin membatasi data yang boleh digunakan di generic parameter type
         * kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe
            yang diperbolehkan
         * Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan,
            atau kelas-kelas turunannya
         * Secara default, constraint type untuk generic parameter tyoe adalah object,
            sehingga semua tipe data bisa digunakan
         */

        NumberData<Integer> integerNumberData = new NumberData<>(1000);
        NumberData<Long> longNumberData = new NumberData<>(1000000L);

        // can't like this
        // NumberData<String> stringNumberData = new NumberData<String>(); ERROR


        /**
         * Multiple Bounded Type Parameter
         * Terkadang kita ingin membatasi tipe data dengan beberapa jenis tipe data di generic parameter type
         * Kita bisa menambahkan beberapa bounded type parameter dengan karakter "&" setelah bounded type pertama
         * Jika ingin menambahkan lagi, cukup gunakan karakter & diikuti bounded type nya lagi
         */
    }

    private static class NumberData<T extends Number>{

        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
