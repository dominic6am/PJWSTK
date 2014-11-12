package pjwstk.cw2;


public class cw2Main {
    
     public static void displ(int tab[]){
           System.out.print("{ ");
           for(int i=0; i<tab.length;i++){
               System.out.print(tab[i]+", ");
           
           }
           System.out.print(" }");
           System.out.println();
       } 
    
    public static void main(String[] args) {
       
      
        
       int[] tab1 = {1,2,5,8,19,21};
       int[] tab2 = {4,8,25,30};
       int[] tab3 = new int[tab1.length+tab2.length];
       
       int index1=0;
       int index2=0;
       int index3=0;
       
       int zm1 = 5;
       System.out.println(zm1);
       varPassing(zm1);
       displ(tab1);
       displ(tab2);
       
    }
    public static void varPassing(int wrt){
        System.out.println(wrt);
        wrt =+ 5;
        System.out.println(wrt);
    }
    public static void varPassing(int[] wrt){
        System.out.println(wrt);
        wrt[0]=+5;
        System.out.println(wrt);
    }
    
    public static void Merge(int[] tab1, int size1){
    
    
    }
    
}
