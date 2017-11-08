package ar.com.grupoesfera.model;

import ar.com.grupoesfera.interfaz.TarjetaBajaInterfaz;

public class TarjetaBaja implements TarjetaBajaInterfaz {

	private double saldo;
	private int viajesEnColectivo;
	private int viajesEnSubte;

	public TarjetaBaja(double saldoInicial) {
		if (saldoInicial > 0)
			saldo = saldoInicial;
		else
			saldo = 0;
		viajesEnColectivo = 0;
		viajesEnSubte = 0;
	}

	public void cargar(double saldo) throws Exception {
		if (saldo > 0)
			this.saldo += saldo;
		else
			throw new Exception("Saldo invalido");
	}

	@Override
	public double obtenerSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	private void gastar(double monto) throws Exception {
		if (saldo > monto) {
			saldo -= monto;
		} else
			throw new Exception("Saldo insuficeinte");
	}

	public void pagarViajeEnColectivo() {
		try {
			this.gastar(1.25);
			viajesEnColectivo++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void pagarViajeEnSubte() {
		try {
			this.gastar(2.50);
			viajesEnSubte++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public int contarViajes() {
		// TODO Auto-generated method stub
		return this.viajesEnColectivo + this.viajesEnSubte;
	}

	@Override
	public int contarViajesEnColectivo() {
		// TODO Auto-generated method stub
		return this.viajesEnColectivo;
	}

	@Override
	public int contarViajesEnSubte() {
		// TODO Auto-generated method stub
		return this.viajesEnSubte;
	}

}
