/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorescreados;

/**
 *
 * @author Fernando Jose
 */
public final class Vector {
   public int[] arreglo;
   public int longitud;

   public Vector(int longitud) {
      this.arreglo = new int[longitud];
      this.setLongitud(longitud);
   }
   
public int getLongitud()
   {
   return this.longitud;
   }

public void setLongitud(int longitud)
   {
   this.longitud = longitud;
   }
/*Este metodo agarrá el vector Original y crea un segundo vector con el orden 
invertido de sus elementos, a continuacion se reemplazan los elementos del Vector
Original con los del Vector inverso y se imprime*/   
public String InvertirVector(int n)
    {
    Vector temporal = new Vector(n);
    String Original = "";
    int x = n;
    for(int i = 0; i < x; ++i) 
      {
         int numero = this.arreglo[n-1];
         temporal.arreglo[i] = numero;
         n = n-1;
      }
    int numero = 0;
    for(int i = 0; i < x; ++i)
    {
        numero = temporal.arreglo[i];
        this.arreglo[i] = numero;
        n = n-1;
        Original = Original + Integer.toString(this.arreglo[i]) + " ";       
    } 
      Original = "[" + Original + "] contados desde la posicion 1";
      return Original;
    }
/*Este metodo coge dos indices del vector e intercambia los elementos entre 
estas dos posiciones, luego se imprime el Vector resultante*/

public String CambiarIndices(int x, int y, int z)
    {      
    int numero1 = this.arreglo[y-1];
    int numero2 = this.arreglo[x-1];
    this.arreglo[y-1] = numero2;
    this.arreglo[x-1] = numero1;
    String Original = "";
    for(int i = 0; i < z; ++i) 
    {
       Original = Original + Integer.toString(this.arreglo[i]) + " ";
    }
    Original = "[" + Original + "] contados desde la posicion 1";
    return Original;
   }    
/*Este Metodo cambia un elemento en la posicion X-1 por un elemento Y, ambos 
valores ingresados por el Usuario*/       
public String CambiarPosicion(int x, int y, int z) {
      this.arreglo[x-1] = y;
      String Original = "";
      for(int i = 0; i < z; ++i) 
      {
        Original = Original + Integer.toString(this.arreglo[i]) + " ";
      }
      Original = "[" + Original + "] contados desde la posicion 1";
      return Original;
   }    
/*Este metodo cambia el elemento de una posicion X-1 por un numero aleatorio
entre los valores de 0 a 100*/   
public String CambiarPosicionAleatorio(int x, int y)
{
    int numeroAleatorio = (int)(Math.random() *(100));
    this.arreglo[x-1] = numeroAleatorio;
    String Original = "";
    for(int i = 0; i < y; ++i) 
    {
        Original = Original + Integer.toString(this.arreglo[i]) + " ";
    }
    Original = "[" + Original + "] contados desde la posicion 1";
    return Original;
}    
   
/*Este metodo llena el Vector del usuario con numeros aleatorios de 0 a 100*/   
public String LlenarVector(int x)
{
    String Original = "";
    for(int i = 0; i < x; ++i) 
    {
        int numeroAleatorio = (int)(Math.random() *(100));
        this.arreglo[i] = numeroAleatorio;
        Original = Original + Integer.toString(this.arreglo[i]) + " ";
    }
    Original = "[" + Original + "] contados desde la posicion 1";
    return Original;
}
/*Este metodo imprime el Vector del tamaño ingresado y llenado previamente*/
public String Pintar(int x) 
{
      String Original = "";
      for(int i = 0; i < x-1; ++i) 
      {
         Original = Original + Integer.toString(this.arreglo[i]) + " ";
      }
      Original = "[" + Original + "] contados desde la posicion 1";
      return Original;
}
}
