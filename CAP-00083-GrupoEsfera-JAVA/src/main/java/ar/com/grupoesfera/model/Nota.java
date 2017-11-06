package ar.com.grupoesfera.model;

public class Nota {

	private int valor;

	public Nota() {
		
	}
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean aprobado() {
		return this.valor >= 4;
	}

	public boolean desaprobado() {
		return !this.aprobado();
	}

	public void recuperar(int nuevoValor) {
		if (nuevoValor >= 0 && nuevoValor < 11) {
			if (nuevoValor > valor)
				valor = nuevoValor;
		}
	}

}