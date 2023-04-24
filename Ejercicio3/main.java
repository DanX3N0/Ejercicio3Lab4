
import java.util.Scanner;
public class main{
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      
      Integer n = Integer.parseInt(scan.nextLine());
      Integer m = Integer.parseInt(scan.nextLine());
      
      
      PilaEstatica pilaA = new PilaEstatica(n);
      PilaEstatica pilaB = new PilaEstatica(m);
      PilaEstatica pilaC; 
      if(n > m){
         pilaC = new PilaEstatica(n);
      }else{
          pilaC = new PilaEstatica(m);
      }
      
      System.out.println("Ingrese los datos de la pila A:");
      
      while(!pilaA.full()){
         pilaA.push(Integer.parseInt(scan.nextLine()));
      }

      System.out.println("Ingrese los datos de la pila B:");
      while(!pilaB.full()){
         pilaB.push(Integer.parseInt(scan.nextLine()));
      }

      

      if(n > m){
         while(!pilaA.empty()){
            Integer elemento1 = pilaA.pop();
            Integer elemento2 = 0;
            if(!pilaB.empty()){
               elemento2 = pilaB.pop();
            }
            Integer suma = elemento1 + elemento2;
            pilaC.push(suma);
         }
      }else{
         while(!pilaB.empty()){
            Integer elemento1 = pilaB.pop();
            Integer elemento2 = 0;
            if(!pilaA.empty()){
               elemento2 = pilaA.pop();
            }
            Integer suma = elemento1 + elemento2;
            pilaC.push(suma);
         }
      }

      System.out.println("IMpresion pila C:");
      
      while(!pilaC.empty()){
         System.out.println(pilaC.pop());
      }
     
   }

}