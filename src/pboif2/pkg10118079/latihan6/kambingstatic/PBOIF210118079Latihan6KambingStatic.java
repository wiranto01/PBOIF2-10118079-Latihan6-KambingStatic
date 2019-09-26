/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118079.latihan6.kambingstatic;

/**
 *
 * @author 
  * Nama : Wiranto
 * Kelas : If2
 * Nim : 10118079
 */
public class PBOIF210118079Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    // Variabel jumlahKambing dideklarisasikan sebagai statik
    public static int jumlahKambing;


public class KambingStatic {
    
    //NAMA_KAMBING sebagai konstanta
      public static final String NAMA_KAMBING = "MIDUN";
}
    public static void main(String[] args) {
        // TODO code application logic here
           PBOIF210118079Latihan6KambingStatic.jumlahKambing = 485000;
        String NAMA_KAMBING = "Midun";
          System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                             + PBOIF210118079Latihan6KambingStatic.jumlahKambing);
    }
    
}
