
public class Ejercicios
{	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
	{
		 //aqui declaro el multiplo y lo comparo a 0 para comprobar si es multiplo de 3, true, de lo contrario retornara falso
        int test=num%3;
       
        if(test==0)
        {
            return true;
        }
             return false;
	}
	
	//devuelve el numero menor entre a, b o c
	//3 puntos
	static int getMenor(int a, int b, int c)
	{
		//aqui compara las variables entre si, con el fin de saber el menor de las 3, se comparan entre si, la menor sera retornada
		if(a<b && a<c)
        {
            return a;
        }
        else if(b<a && b<c)
        {
            return b;
        }
            return c;
	}
	
	//devuelve el promedio los elementos de un arreglo
	//5 puntos
	static int getPromedio(int arreglo[])
	{
		//declaro la variable promedio, con el for medimos a lo largo del arreglo, que retornara al final el promedio
		int promedio = 0;
		for( int x=0; x<arreglo.length; x++ )
		{
		promedio += arreglo[x];
		}
		return promedio = promedio / arreglo.length; 
	}
	
	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris"
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		String capital = null;
		if(capital.equals(pais))
		{
			System.out.println("El mismo contenido");
		}else{
			System.out.println("Distinto contenido");
		}
		return capital;
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
	static int funcionRecursiva(int num)
	{
		return -1;
	}
	
	public static void main(String args[])
	{
	}
}
