/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_no_3;

/**
 *
 * @author admin
 */
public class Soal_No_3 {

    public static void permutasi(int jumlah){
        int t=1;
        int u=1;
        int v=1;
        int w, z, k, j;
        for(w=jumlah;w>=1;w--) {
            t*=w;
        }
        k=(jumlah-2);
        for(z=k;z>=1;z--) {
            u*=z;
        }
        for(j=2;j>=1;j--) {
            v*=j;
        }
        System.out.println((t/(u*v)));
    }
    
    public static void main(String[] args) {
        permutasi(6);
    }
}
