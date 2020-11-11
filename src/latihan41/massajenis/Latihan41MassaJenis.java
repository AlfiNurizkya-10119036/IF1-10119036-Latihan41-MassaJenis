/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan41.massajenis;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Menghitung Massa Jenis
 */
public class Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MassaJenis kubus = new MassaJenis();
		kubus.setSisi(5);
		kubus.setMassa(250);
		int volume = kubus.hitungVolume(kubus.getSisi());
		int massaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);
                System.out.println("======Massa Jenis Kubus======");
                System.out.println("Sisi : " + kubus.getSisi());
                System.out.println("Massa : " + kubus.getMassa());
                
		System.out.println("======Hasil Perhitungan======");
		System.out.println("Volume : " + volume);
		System.out.println("Massa Jenis : " + massaJenis);
    }
}
