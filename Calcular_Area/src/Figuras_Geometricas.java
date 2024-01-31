import java.util.*;  //para  utilizar la clase scanner
import javax.swing.*; //para utilizar la clase JoptionPane 

public class Figuras_Geometricas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner  (System.in);

		System.out.println ("Elige una opcion: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Circulo  ");
	
		int figura = entrada.nextInt();
		
		switch (figura){
			
			case 1:
				/*Usaremos el método parseInt de la clase Integer para transformar um entero en 
				String, visto que el método retorna un dato de tipo entero */
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado "));
				
				System.out.println("El área del cuadrado es " + Math.pow(lado, 2));
				
				break;
				
			case 2:
				
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altural "));
				
				System.out.println("El área rectángulo es " + base*altura);
				
				break;
				
			case 3:
				//no es necesario colocar el tipo de variable porque ya fueron creados en el case 2
				base = Integer.parseInt(JOptionPane.showInputDialog("Introduce el base "));
				altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
		
				System.out.println("El área del triángulo es " + (base*altura)/2);
				
				break;
				
			case 4:
				
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rádio "));
				
				/* Usaremos la impresión print para continuar la linea y printf para permitir imprimir
				 * con fomrato. Tambien usaremmos la constante de clase PI y el método pow de la
				 * clase Math para poder elevar al cuadrado*/
				System.out.print("El área del circulo es ");
				System.out.printf("%1, 2f", Math.PI*(Math.pow(radio, 2)));
				
				break;
				
				default:
					System.out.println ("La opción no está correcta");
		}
	}

}

//falta revisar los decimales de las respuestas para algunas áreas.
