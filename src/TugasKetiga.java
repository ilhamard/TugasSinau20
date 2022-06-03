import java.util.Scanner;

class TugasKetiga {
    void Persegi(){
        int luas, keliling, sisi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Nilai Persegi : ");
        sisi = scan.nextInt();
        scan.nextLine();
        luas = sisi * sisi;
        keliling = 4 * sisi;

        System.out.println("Luas Persegi adalah : " + luas);
        System.out.println("Luas Keliling adalah : " + keliling);
    }

    void persegiPanjang(){
        int luas, keliling, panjang, lebar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Panjang persegi : ");
        panjang = scan.nextInt();
        scan.nextLine();
        System.out.println("Masukan Luas Persegi");
        lebar = scan.nextInt();
        scan.nextLine();
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
        System.out.println(luas);
        System.out.println(keliling);
    }
    void Lingkaran(){
        double luas, lingkaran,phi = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Panjang jari jari lingkaran : ");
        lingkaran = scan.nextInt();
        scan.nextLine();
        luas = 2 * phi * lingkaran;
        System.out.println("Hasil Luas Lingkaran adlah : "+luas);
    }

    void Segitiga(){
        double alas, tinggi, luas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan panjang alas : ");
        alas = scan.nextInt();
        scan.nextLine();
        System.out.println("Masukan Tinggi Segitiga : ");
        tinggi = scan.nextInt();
        scan.nextLine();
        luas = 0.5 * alas * tinggi;
        System.out.println("Hasil Luas Segitiga adalah : "+luas);

    }
}
