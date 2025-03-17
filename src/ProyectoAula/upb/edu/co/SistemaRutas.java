package ProyectoAula.upb.edu.co;

public class SistemaRutas {
	 public static void main(String[] args) {
	       ListaEnlazada sistema = new ListaEnlazada();
	       sistema.agregarPunto("Biblioteca");
	       sistema.agregarPunto("Auditorio");
	       sistema.agregarPunto("Cafetería");
	       sistema.mostrarPuntos();
	   }

}
