

package pjwstk.cw1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author fake.dem
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
        
        

//...

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wartosc zmiennej wrt: ");
        int wrt;
        String wrt2 = JOptionPane.showInputDialog("\"Podaj wartosc zmiennej wrt: \"");
        wrt = Integer.parseInt(wrt2);
        System.out.println(wrt); 
        if(wrt>=-15 && wrt<=-10 || wrt >= -5 && wrt <=0 || wrt >=5 && wrt <=10){
        
                System.out.print("Zmienna nalezy do przedzialu A");
                System.out.println("");
        }
         
        if(wrt<=-13 || wrt >= -8 && wrt <=-3){
        
                System.out.print("Zmienna nalezy do przedzialu B");
                System.out.println("");}
        
        if(wrt>=-4)   {
                System.out.print("Zmienna nalezy do przedzialu C");
                System.out.println("");
        }
       
      //Zad2 
    System.out.println("");
    System.out.println("zad 2"); 
    
    double wynik;
    
    wynik = (Math.sqrt(2)*Math.sqrt(2))-2;
        
        
            
            System.out.println(""); 
            System.out.println("Wynik zad 2: " + wynik);
    
    //zad3
    System.out.println("");
    System.out.println("zad 3"); 
         
    double sqTwo = Math.sqrt(2);
    
    double sqThree =(sqTwo*sqTwo)-2;
    
    System.out.println(""); 
    System.out.println("Wynik zad 3: " + sqThree); 
    
    //zad4
    System.out.println("zad 4"); 
    
    for(int i = 1; i < 11; i++){
        
         System.out.println(i);
    
    
    }   
    System.out.println("");
    System.out.println("zad 5");
    //zad6
    
    //roønice while do while   
    
    //zad7
    
    System.out.println("");
    int counter=0;
    
    for(int i = 0; i < 6; i++){
         
        counter = counter+1;
        
        if(counter == 1){ 
            System.out.print("*:");   
        }
        
        for(int j = 1; j < counter; j++){
            System.out.print("*");  
        }       
        System.out.println("");
    } 
  
    System.out.println("");
    
/*/zad8 Dana jest dziesiecio elementowa tablica wypełnona nieposortowanymi liczbami. Napisz
program, który znajdzie element o najmniejszej wartosci i wyswietl na konsoli
jego wartosc oraz indeks./*/
     System.out.println("zad 8");
     System.out.println("------------");
    
     System.out.print("Podaj wielkosc tablicy: ");
     String inp = JOptionPane.showInputDialog("Podaj wielkosc tablicy: ");
     int n;
     n = Integer.parseInt(inp);
     int[] tab = new int[n];
     
    
    for(int i=0;i<tab.length;i++){
        
        tab[i]=(int)(Math.random()*255);
        
    }
    System.out.println("generuje tablice z losowymi liczbami:");
    for(int i=0;i<tab.length;i++){
        
        System.out.println("index: "+(i)+" : "+tab[i]);
        
        
    }
    int index=0;
    int value=tab[0];
   
    
    
    System.out.println("minimalna wartość z tablicy");
    
        for(int i=0;i<tab.length;i++){
        
            if (value>tab[i]){
                value=tab[i];
                index=i;
            }
                
            
            
              
        }
            
            
        
        
    System.out.println("index:"+index+" "+value);
    
    
    System.out.println("Sortowanie tabeli");
     System.out.println("szukam minimum");
    int minIndex=0;
    int minimum=tab[minIndex];
    
    for(int i=0;i<tab.length;i++){
        
        if(minimum>tab[i]){
            minimum=tab[i];
            minIndex=i;
        }
    
    }
    System.out.println("zamieniam pierwszy index z indexem z wartoscia min");
    
    int tmp = tab[0];
    tab[0]= minimum;
    tab[minIndex] = tmp;
    
    for(int i=0;i<tab.length;i++){
        System.out.println("index: "+(i)+" : "+tab[i]);
    }  
      //=======================================
    System.out.println("zad sortowanie tabeli: z " + tab.length + " elementami");
    
     System.out.println("generuje nowe liczby:");
    
     //10
     //00000
     //011
     
     //     8+2+1
     for(int i=0;i<tab.length;i++){
        
        tab[i]=(int)(Math.random()*255);
        
    }
     System.out.print("{ ");
     for(int i=0;i<tab.length;i++){
        
        System.out.print(tab[i]+" , ");
    }
     System.out.print(" } ");
     System.out.println();
     System.out.println("=================");
     System.out.println("sortuje tabele");
     //=======================================
    
    for(int j=0;j<tab.length;j++){
    
        int minIndex1=j;
        int minimum1=tab[minIndex1];
    
        for(int i=j+1;i<tab.length;i++){
        
            if(minimum1>tab[i]){
                minimum1=tab[i];
                minIndex1=i;
            }
        }
        int tmp1 = tab[j];
        tab[j]= minimum1;
        tab[minIndex1] = tmp1;
        
        
                            System.out.print("Step: "+j+" { ");
                            for(int k=0;k<tab.length;k++){
                                System.out.print(tab[k]+" , ");
                            }
                            System.out.print("}");
                            System.out.println();
    
    }    
}}

