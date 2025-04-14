package model;

public abstract class figura {
	private String cor;
	private int posY;
	private int posX;

	public figura(String cor, int posY, int posX) {
		super();
		this.cor = cor;
		this.posY = posY;
		this.posX = posX;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public abstract void SouQuem();

	public abstract Double area();

	public abstract Double perimetro();

}
