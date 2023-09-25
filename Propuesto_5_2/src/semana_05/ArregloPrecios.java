package semana_05;

public class ArregloPrecios {
	private double precio[] = {240.5,350.2,80.4,100.3,470.1,60.0,330.8,260.6,510.9,200.7};
	
	public int tamanio() {
		return precio.length;
	}
	
	public double obtener(int e) {
		return precio[e];
	}
	
	public double precioPromedio() {
		double suma = 0;
		for(int e=0; e<tamanio(); e++) {
			suma+= precio[e];
		}return suma/tamanio();
	}
	
	public double precioMayor() {
		double mayor = 0;
		for(int e=0; e<tamanio(); e++) {
			if(mayor < precio[e]) {
				mayor = precio[e];
			}
		}
		return mayor;
	}
	
	public double precioMenor() {
		double menor = precio[0];
		for(int e=1; e<tamanio(); e++) {
			if(menor > precio[e]) {
				menor = precio[e];
			}
		}
		return menor;
	}
	
	public int cantMayoresPrecioPromedio() {
		int cont = 0;
		for(int e=0; e<tamanio(); e++) {
			if(precio[e] >= precioPromedio()) {
				cont++;
			}
		}
		return cont;
	}
	
	public int cantMenoresPrecioPromedio() {
		int cont = 0;
		for(int e=0; e<tamanio(); e++) {
			if(precio[e] < precioPromedio()) {
				cont++;
			}
		}
		return cont;
	}
	
	public int posPrimerPrecioMayorAlSegundo() {
		for(int e=0; e<tamanio(); e++) {
			if(precio[e] > precio[1]) {
				return e;
			}
		}
		return -1;
	}
	
	public int posUltimoPrecioMenorAlPenultimo() {
		for(int e=tamanio()-1; e>=0; e--) {
			if(precio[e] < precio[tamanio()-1]) {
				return e;
			}
		}
		return -1;
	}
	
	public void generarPrecios() {
		for(int e=tamanio()-1; e>=0; e--) {
			precio[e] = aleatorio(99.9,999.9);
		}
	}
	
	public double aleatorio(double min, double max) {
		return (double) ((max - min +1) * Math.random()) + min;
	}
}
