package semana_05;

public class ArregloSueldos {
	private double sueldo[]= {2400.5,800.4,1500.2,1000.3,4700.1,
								600.0,3300.8,2600.6,5100.9,2000.7};
	
	public int tamanio() {
		return sueldo.length;
	}
	
	public double obtener(int e) {
		return sueldo[e];
	}
	
	public double sueldoPromedio() {
		double suma = 0;
		for(int e=0; e<tamanio(); e++) {
			suma+= sueldo[e];
		}
		return suma/tamanio();
	}
	
	public double sueldoMayor() {
		double mayor = 0;
		for(int e=0; e<tamanio(); e++) {
			if(mayor<sueldo[e]) {
				mayor = sueldo[e];
			}
		}
		return mayor;
	}
	
	public double sueldoMenor() {
		double menor = sueldo[0];
		for(int e=1; e<tamanio(); e++) {
			if(menor>sueldo[e]) {
				menor = sueldo[e];
			}
		}
		return menor;
	}
	
	public double cantMayoresSueldoPromedio() {
		double cont = 0;
		for(int e=0; e<tamanio(); e++) {
			if(sueldo[e]>=sueldoPromedio()){cont++;}
		}
		return cont;
	}
	
	public double cantMenoresSueldoPromedio() {
		double cont = 0;
		for(int e=0; e<tamanio(); e++) {
			if(sueldo[e]<sueldoPromedio()){cont++;}
		}
		return cont;
	}
	
	public double posSegundoSueldoMayorAlMinimo() {
		int cont = 0;
		for(int e=0; e<tamanio(); e++) {
			if(sueldo[e] > 850.0){
				cont++;
			}
			if(cont == 2) {
				return e;
			}
		}
		return -1;
	}
	
	public double posUltimoSueldoMenorAlMinimo() {
		for(int e=tamanio()-1; e>=0; e--) {
			if(sueldo[e] < 850.0){
				return e;
			}
		}
		return -1;
	}
	
	public void generarSueldos() {
		for(int e=tamanio()-1; e>=0; e--) {
			sueldo[e] = aleatorio(799.9,4999.9);
		}
	}
	
	private double aleatorio(double min, double max) {
		 return (double)((max - min + 1) * Math.random()) + min;
		}
	

}
