package pjwstk.cw4;


public class cw4 {
    public static int[] wypelniacz( int tab[]){
 
        for(int i =0 ;i<tab.length; i++){
            tab[i]=(int)(Math.random()*128+128);
        }
            return tab;
    }
    
    public static void drukuj(int tab[]){
         
         System.out.print("{ ");
         for(int i =0 ;i<tab.length; i++){

            if(i==tab.length-1) 
                System.out.print(tab[i]);
             else
                System.out.print(tab[i]+", ");
        }
         System.out.print(" }");
         System.out.println(); 
           
    }
    
    public static void drukuj(int tab[][]){
         
        for(int i =0;i<tab.length;i++){
             
           
        System.out.print("{ ");
             
              
            for(int j=0;j<tab[i].length;j++){
                if(j==tab[i].length-1) 
                System.out.print(tab[i][j]);    
                else
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
   
    public static int min(int tab[][]){
    
        int min=tab[0][0];
        int x=0;
        int y=0;
        for(int i =0;i<tab.length;i++){
             
           
            for(int j=0;j<tab[i].length;j++){
                 
                 if(tab[i][j] < min){
                     min=tab[i][j];
                     x=i;
                     y=j;
                 }
            }
        }    
        
        System.out.println("Index-min: "+x+" "+y+" ::"+tab[x][y]);
        return tab[x][y];
        
    }
    public static int[] przekatneTablicyKwadratowej(int tab[][]){
        //zwraca tablice elementow z liczbami ktore sa przekatnymi wielowymiarowej tablicy wejsciowej 
        //dziala tylko na nieparzystych tablicach kwadratowych
        
        
        int x=-1;
        int y=-1;
 
        int wielkoscTablicy = tab.length;
        int iloscLiczb= (wielkoscTablicy*2)-1;
        int[] tabZwracana = new int[iloscLiczb];
        int srodek = tabZwracana.length/2;
        //lewa / prawa przekatna dodanie do nowej tabeli
        for(int i=0; i<wielkoscTablicy;i++){
            x++;
            y++;  
            
            tabZwracana[i]=tab[x][y];
        }
        x=wielkoscTablicy;
        y=-1;
        //srodkowy element do pominiecia
        int z=((tabZwracana.length-srodek)/2)+srodek+1;
        
        //prawa / lewa z ominieciem srodka przekatna dodanie wartosci do tabeli
        for(int i=srodek+1; i<tabZwracana.length;i++){
            
            x--;
            y++;
            
            if(i==z){
                x--;
                y++;
                tabZwracana[i]=tab[x][y];
                
            }
            else{
            
                tabZwracana[i]=tab[x][y];   
            }   
        }
        return tabZwracana;
    }
    
    public static void spr(int tab[]){
        
        System.out.println("Powtarzające się elementy");
           for(int i=1;i<tab.length;i++){
               
                for(int j=1;j<tab.length;j++){
                    
                    if(i!=j&&tab[i]==tab[j]){
                        
                        System.out.println("Liczba: "+(i+1)+""+"::"+(j+1)+" ");
                    }    
                }
           }    
           
           System.out.println();
           
       }
        
    //zad6.5
    public static void show(int integer){
        
        System.out.println("Metoda show() wartosc zmiennej wejsciowej int:"+integer);
    }
    
    public static void modifyValue(int val){
        
        System.out.println("//metoda modifyValue(){");
        System.out.println("Wprowadzona zmienna: "+val);
        val=val+5;
        System.out.println("Modyfikacja zmiennej: "+val);
        System.out.println("//koniec metody modifyValue()}");
        
    }
    
    //Zad 6.7
    public static void zlicz(char tab[]){
        
        int licznik = tab.length+1;
       
        System.out.println("zdanie zawiera "+licznik+" znakow");
        System.out.println("wystapienia");
        int tmp=0;
        
        
        for(char i='a';i<='z';i++){

            for(char j:tab){
                
                char c = Character.toLowerCase(j);
                
                if(c==i){
                    
                    tmp++;
                }
            }
        if(tmp>0)
        System.out.println(i+" = "+tmp);
        tmp=0;
        
        }
    }
   
    public static void main(String[] args) {
    
    //tworze tabele
    int[] tab1 = new int[losuj(20,30)];
    int[] tab2 = new int[losuj(20,30)];
    int[] tab3 = new int[losuj(20,30)];
    int[] tab4 = new int[losuj(20,30)];
    

    //wypelniam tabele         
    wypelniacz(tab1);
    wypelniacz(tab2);
    wypelniacz(tab3);
    wypelniacz(tab4);
       
       
       
       //utworzenie tabeli wielowym
       
       int[][] tabn = {tab1,tab2,tab3,tab4};
       //wydruk tabeli3w
       System.out.println("tablica wielowymiarowa");
       drukuj(tabn);
    
// zad6.2
       int[][] tabn1= new int[4][5];
       
       for(int i =0; i<tabn1.length;i++){
           
           for(int j=0; j < tabn1[i].length ;j++){
               tabn1[i][j]=losuj(100,255);
           
           }
       }
    drukuj(tabn1);
//zad6.3
    
    min(tabn1);
//zad6.4
    
    int[][] tabn2= new int[7][7];
    
    for(int i =0; i<tabn2.length;i++){
           
           for(int j=0; j < tabn2[i].length ;j++){
               tabn2[i][j]=losuj(10,20);
           
           }
    }

    drukuj(tabn2);
    
    System.out.println();
    
    drukuj(przekatneTablicyKwadratowej(tabn2));
    spr(przekatneTablicyKwadratowej(tabn2));
    
   
    //zad6.5
    show(20);
    //zad6.6
    int wrt=5;
    modifyValue(wrt);
    System.out.println("Zmienna wrt: "+wrt);
    //zmienna wrt zostala zmodyfikowana w trakcie wykonywania metody,
    //jej wartosc modyfikuje metoda, zakonczenie tej metody spowoduje jej przywrocenie
    
    //zad 6.7
    
    char[] zdanie = {'A','l','a',' ','m','a',' ','k','o','t','a',};
    zlicz(zdanie);
    
}
    
    
}
