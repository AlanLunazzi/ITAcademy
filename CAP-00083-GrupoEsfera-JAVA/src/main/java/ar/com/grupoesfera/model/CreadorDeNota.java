package ar.com.grupoesfera.model;

public class CreadorDeNota {
	
	public Nota crearNota(int nota) throws Exception {
		
		if (nota > -1 && nota < 11) {
			{
				Nota notaobj;
				notaobj = new Nota();
				notaobj.setValor(nota);
				return notaobj;
			}
		} else
			throw new Exception("Nota tien que estar entre 0 y 10, actualmente es " + nota);
	}
}