
public class PilaEstatica {
   
   public Integer tamañoPorDefecto = 5;
   public Integer[] pilaArreglo;  
   public Integer tope = -1;
   
   //CONSTRUCTOR
   public PilaEstatica(){
      pilaArreglo = new Integer[this.tamañoPorDefecto];
   }
   //SOBRECARGA DEL CONSTRUCTOR
   public PilaEstatica(Integer nuevoTamaño){
      pilaArreglo = new Integer[nuevoTamaño];
   }

   public void push(Integer elemento){
      tope = tope + 1;//tope++;
      pilaArreglo[tope] = elemento;
   }

   public Integer pop(){
      Integer variableRetorno = pilaArreglo[tope];
      tope = tope - 1;
      return variableRetorno;
      //return pilaArreglo[tope--];
   } 

   public boolean empty(){
      if(tope == - 1)
         return true;
      return false;
   }

   public boolean full(){
      if(tope == pilaArreglo.length - 1)
         return true;
      return false;
   }

}







