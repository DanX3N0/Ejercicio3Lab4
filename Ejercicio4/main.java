import java.util.Scanner;
public class main {
   public static void main(String[] args) {
      //              0 1 2 3 4 5 6 7 
      //String str = "( ) ( ) ( ) ( ) ";
      Scanner scan = new Scanner(System.in);

      String text = scan.nextLine();
      PilaEstatica pilaA = new PilaEstatica(text.length());

      for(int i = 0; i < text.length(); i++){
         String s = Character.toString(text.charAt(i));
         if(s.equals("(")){
            pilaA.push(s);
         }else{
            if(pilaA.empty()){
               System.out.println("No esta balancedo.");
               System.exit(0);
            }else{
               pilaA.pop();
            }
         }
      }

      if(pilaA.empty()){
         System.out.println("Esta balanceado.");
      }else{
         System.out.println("No esta balanceado.");
      }

      
   }  
}
