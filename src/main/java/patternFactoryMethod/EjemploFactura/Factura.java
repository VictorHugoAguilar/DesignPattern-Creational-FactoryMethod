package patternFactoryMethod.EjemploFactura;

/**
 * Uno de los patrones de diseño más utilizados en Java es el patron Factory que
 * es un patrón de diseño creacional y que sirve para construir una jerarquía de
 * clases
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public abstract class Factura {

	private int id;
	private double importe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public abstract double getImporteIva();
}