public class PilaEstatica {
   
   public Integer tope = - 1;
   public Integer tamanioPorDefecto = 10;
   public String[] pilaArreglo;

   //CONSTRUCTOR CON CERO PARAMETROS
   public PilaEstatica(){
      pilaArreglo = new String[this.tamanioPorDefecto];
   }

   //SOBRECARGA DEL CONSTRUCTOR
   public PilaEstatica(Integer tamanio){
      pilaArreglo = new String[tamanio];
   }

   //METODOS

   //PUSH
   public void push(String dato){
      tope++;
      pilaArreglo[tope] = dato;
   }
   //POP
   public String pop(){
      return pilaArreglo[tope--];
   }
   //EMPTY
   public boolean empty(){
      if(tope == - 1)
         return true;
      return false;
   }

   //FULL
   public boolean full(){
      if(tope == pilaArreglo.length - 1)
         return true;
      return false;
   }

}
