public class codigopila {
    
   static int tope=0;
   static int t=0;
   static int opt=0;
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("tamaño de pila");
        t=sc.nextInt();     
        int [] pila = new int[t];
        do{
            System.out.println("a- add\n"
                    + "2-show\n"
                    + "3-eliminar\n"
                    + "4-salir\n");
            opt=sc.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("agrega el valor");
                    pila[tope] = sc.nextInt();
                    tope++;  
                    break;
                case 2:
                    for (int i = tope-1; i >=0; i--) {
                        System.out.println(pila[i]);
                    }                
                    break;
                case 3:
                    tope--;
                    break;
            }
        }while(opt!=4);
        
        
        
        
    }
    
    
}