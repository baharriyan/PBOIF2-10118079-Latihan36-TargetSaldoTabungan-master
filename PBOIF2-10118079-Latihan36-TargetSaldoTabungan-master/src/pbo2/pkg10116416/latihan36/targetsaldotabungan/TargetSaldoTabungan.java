/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116416.latihan36.targetsaldotabungan;

/**
 * 
 * @author  
 * NAMA     : riyan bahar
 * KELAS    : IF-2
 * NIM      : 10116416
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tbg = new Tabungan();
        
        tbg.setSaldo(3500000);
        tbg.setSaldoTarget(6000000);
        tbg.setBunga(0.08);
        
        tbg.hitungTarget();
    }
    
}
