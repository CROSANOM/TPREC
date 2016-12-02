import java.util.Scanner;

public class hola {
	
		private int edad;
		private String nombre;

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hola");

		System.out.println("Cris");
		System.out.println("introduce un nombre");

		String nombre;
		Scanner sc = new Scanner(System.in);
		nombre = sc.next();
		System.out.println("nombre");
		System.out.println("Hola" + nombre);

	}

}
