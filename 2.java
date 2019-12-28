/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_no_2;

/**
 *
 * @author admin
 */
public class Soal_No_2 {
    
    public static char buatkar(){
        return(char)('a' + Math.random()*('z' - 'a'));
    }
    public static char buatnom(){
        return(char)('0' + Math.random()*('9' - '0'));
    }
    
    public static void cetak(int jumlah){
        
        for (int i = 0; i < jumlah; i++) {         
            for (int j = 0; j < 14; j++) {          
            char karakter = buatkar();
            char nomer = buatnom();        
            System.out.print(karakter);
            System.out.print(nomer);                                     
        }
            System.out.println("");
        }      
    }  
    public static void main(String[] args) {
      
        cetak(5);
    }   
}
