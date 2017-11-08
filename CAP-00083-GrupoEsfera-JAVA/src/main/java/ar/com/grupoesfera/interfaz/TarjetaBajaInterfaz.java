package ar.com.grupoesfera.interfaz;

public interface TarjetaBajaInterfaz {

	public double obtenerSaldo();
	/* post: agrega el monto al saldo de la Tarjeta.
	*/
	public void cargar(double monto) throws Exception;
	/* pre : saldo suficiente.
	* post: utiliza 1.25 del saldo para un viaje en colectivo.
	*/
	public void pagarViajeEnColectivo();
	/* pre : saldo suficiente.
	* post: utiliza 2.50 del saldo para un viaje en subte.
	*/
	public void pagarViajeEnSubte();
	/* post: devuelve la cantidad de viajes realizados.
	*/
	public int contarViajes();
	/* post: devuelve la cantidad de viajes en colectivo.
	*/
	public int contarViajesEnColectivo();
	/* post: devuelve la cantidad de viajes en subte.
	*/
	public int contarViajesEnSubte();
	
}
