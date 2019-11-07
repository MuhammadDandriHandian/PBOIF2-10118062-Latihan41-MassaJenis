/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan41.massajenis;

/**
 *
 * @author ASUS
 */
public class PBOIF210118062Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kbs = new Kubus();
        kbs.setSisi(5);
        kbs.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : " + kbs.getSisi());
        System.out.println("Masssa : " + kbs.getMassa());
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(),kbs.hitungVolume(kbs.getSisi())));
        
        
    }
    
}
