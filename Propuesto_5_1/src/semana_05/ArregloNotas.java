package semana_05;

public class ArregloNotas {
	private int nota[] = {11, 10, 16, 18, 15, 13, 20, 12, 19, 17};
	
	public int tamanio() {
		return nota.length;
	}
	
	public int obtener(int e) {
		return nota[e];
	}
	
	public int notaPromedio() {
		int suma = 0;
		for(int e=0; e<tamanio(); e++) {
			suma+= nota[e];
		} return suma/tamanio();
	}
	
	public int notaMayor() {
		int mayor = 0;
		for(int e=0; e<tamanio(); e++) {
			if(mayor < nota[e]) {
				mayor = nota[e];
			}
		}
		return mayor;
	}
	
	public int notaMenor() {
		int menor = nota[0];
		for(int e=1; e<tamanio(); e++) {
			if(menor > nota[e]) {
				menor = nota[e];
			}
		}
		return menor;
	}
	
	public int cantNotasAprobatorias() {
		int cont = 0;
		for(int e=0; e<tamanio(); e++) {
			if(nota[e] >= 13) {
				cont++;
			}
		}
		return cont;
	}
	
	public int cantNotasDesaprobatorias() {
		int cont = 0;
		for(int e=0; e<tamanio(); e++) {
			if(nota[e] < 13) {
				cont++;
			}
		}
		return cont;
	}
	
	public int cantNotasMayoresA15() {
		int cont = 0;
		for(int e=0; e<tamanio(); e++) {
			if(nota[e] > 15) {
				cont++;
			}
		}
		return cont;
	}
	
	public int posPrimeraNotaAprobatoria() {
		for(int e=0; e<tamanio(); e++) {
			if(nota[e] >= 13) {
				return e;
			}
		}
		return -1;
	}
	
	public int posPenultimaNotaDesaprobatoria() {
		int cont = 0;
		for(int e=tamanio()-1; e>=0; e--) {
			if(nota[e] < 13) {
				cont++;
				if(cont == 2) {
					return e;
				}
			}
		}
		return -1;
	}
	
	public void generarNotas() {
		for(int e=tamanio()-1; e>=0; e--) {
			nota[e] = aleatorio(0,20);
		}
	}
	
	private int aleatorio(int min, int max) {
		return (int) ((max - min +1) * Math.random()) + min;
	}

}
