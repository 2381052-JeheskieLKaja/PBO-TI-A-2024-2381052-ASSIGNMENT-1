public class TipeDataArray {
    public static void main(String[] args) {
        //Array adalah sekumpulan data yang memiliki tipe data yang sama

        //Cara pertama
        int[] kumpulanNumber; //Deklarasi
        kumpulanNumber = new int[3]; //Inisialisasi

        //Cara kedua
        int[] kumpulanNumber2 = new int[3];

        //Cara ketiga
        int[] kumpulanNumber3 = new int[] {1, 3, 4, 5};

        //Cara memasukan value ke array
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = 200;
        kumpulanNumber[2] = 300;

        //Cara mengaskses
        System.out.println(kumpulanNumber[1]);



    }
}
