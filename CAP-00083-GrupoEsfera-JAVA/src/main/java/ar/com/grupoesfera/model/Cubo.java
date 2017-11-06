package ar.com.grupoesfera.model;

import java.math.BigDecimal;

public class Cubo {
	private int lado;

	public Cubo(int lado) {
		if (lado > 0)
			this.lado = lado;
	}

	public int medirLongitudLado() {
		return lado;
	}

	public void cambiarLongitudLado(int nuevaLong) {
		if (nuevaLong > 0)
			this.lado = nuevaLong;
	}

	public int medirSuperficieCara() {
		return lado * lado;
	}

	public void cambiarSuperficieCara(int superficieCara) {
		this.lado = (int) Math.sqrt(superficieCara);
	}

	public int medirVolumen() {
		return this.lado * this.lado * this.lado;
	}

	public void cambiarVolumen(int volumen) {
		this.lado = (int) Math.pow(volumen, 1.0/3.0);
	}

	public int getLado() {
		return this.lado;
	}

}
