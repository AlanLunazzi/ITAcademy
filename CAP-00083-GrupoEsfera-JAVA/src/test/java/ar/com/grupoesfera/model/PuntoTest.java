package ar.com.grupoesfera.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void crearPuntoTest(){
		Punto p = new Punto();
		p.setX(1);
		p.setY(2);
		assertThat(p).isNotNull();
		assertThat(p.getX()).isEqualTo(1);
		assertThat(p.getY()).isEqualTo(2);
		
	}
}
