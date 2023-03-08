package ejerciciosT2;

public class ej11_pag57 {

	 public int calcularClientesAtendidos(int kilosPapas, int kilosChocos) {
		    int clientesAtendidos = 0;
		    int papasUsadas = 0;
		    int chocosUsados = 0;

		    while (kilosPapas >= 1 && kilosChocos >= 0.5) {
		      papasUsadas += 1;
		      kilosPapas -= 1;
		      chocosUsados += 1;
		      kilosChocos -= 0.5;

		      if (papasUsadas % 3 == 0 && chocosUsados % 2 == 0) {
		        clientesAtendidos += 3;
		      }
		    }
		    return clientesAtendidos;
		  }

		  public static void main(String[] args) {
		    ej11_pag57 restaurante = new ej11_pag57();
		    int kilosPapas = 30;
		    int kilosChocos = 30;
		    int clientesAtendidos = restaurante.calcularClientesAtendidos(kilosPapas, kilosChocos);
		    System.out.println("El restaurante puede atender a " + clientesAtendidos + " clientes.");
		  }
}

