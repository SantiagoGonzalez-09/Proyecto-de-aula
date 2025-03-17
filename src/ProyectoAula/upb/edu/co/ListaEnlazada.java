package ProyectoAula.upb.edu.co;

public class ListaEnlazada {
	 private Nodo cabeza;
	   public ListaEnlazada() {
	       this.cabeza = null;
	   }
	   public void agregarPunto(String nombre) {
	       Nodo nuevo = new Nodo(new Punto(nombre));
	       if (cabeza == null) {
	           cabeza = nuevo;
	       } else {
	           Nodo actual = cabeza;
	           while (actual.siguiente != null) {
	               actual = actual.siguiente;
	           }
	           actual.siguiente = nuevo;
	       }
	   }
	   public void mostrarPuntos() {
	       System.out.println("Puntos registrados en el sistema:");
	       Nodo actual = cabeza;
	       while (actual != null) {
	           System.out.println("- " + actual.dato.getNombre());
	           actual = actual.siguiente;
	       }
	   }

}
