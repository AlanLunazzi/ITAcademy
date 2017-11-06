package ar.com.grupoesfera.model;

public class Punto {
	private int x;
	private int y;
	
	public boolean isOnX(int x) {
		return this.x == x;
	}
	public boolean isOnY(int y) {
		return this.y == y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x)  {
			this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
			this.y = y;
	}
	public boolean isOnPoint(Punto p) {
		return (this.x == p.x && this.y == p.y);
	}
}
