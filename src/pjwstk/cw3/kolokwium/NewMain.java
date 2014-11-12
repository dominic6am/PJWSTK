/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pjwstk.cw3.kolokwium;

/**
 *
 * @author user
 */
public class NewMain {

    
    
    
    public static int[] wypelniacz( int tab[]){
         
         
         for(int i =0 ;i<tab.length; i++){
            tab[i]=(int)(Math.random()*128+128);
        }
            return tab;
        }
    public static void drukuj1w(int tab[]){
         
         System.out.print("{ ");
         for(int i =0 ;i<tab.length; i++){
            System.out.print(tab[i]+", ");
        }
         System.out.print(" }");
         System.out.println(); 
           
        }
    
     public static void drukuj2w(int tab[][]){
         
         for(int i =0;i<tab.length;i++){
             
           
             System.out.print("{ ");
             
              
             for(int j=0;j<tab[i].length;j++){
                 
                 System.out.print(tab[i][j]+", ");
             }
             System.out.print(" }");
             System.out.println();
         }
         
     }
    
    public static int losuj(int k, int n){
        
        int random = (int)(Math.random()*n+k);
        return random;
    }
     
    public static void main(String[] args) {
        
        
        //tworze tabele
        int[] tab1 = new int[losuj(20,30)];
        int[] tab2 = new int[losuj(20,30)];
        int[] tab3 = new int[losuj(20,30)];
       //wypelniam tabele         
       wypelniacz(tab1);
       wypelniacz(tab2);
       wypelniacz(tab3);
       //print test rand tabl
       System.out.println("print test rand tabl");
       drukuj1w(tab1);
       
       //utworzenie tabeli wielowym
       
       int[][] tabn = {tab1,tab2,tab3};
       //wydruk tabeli3w
       System.out.println("tablica wielowymiarowa");
       drukuj2w(tabn);
    }
    
}
