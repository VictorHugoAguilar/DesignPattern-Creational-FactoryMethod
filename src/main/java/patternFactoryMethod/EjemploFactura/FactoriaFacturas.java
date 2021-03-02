package patternFactoryMethod.EjemploFactura;

/**
 * Clase Factura es una clase abstracta de la cual heredan nuestras dos clases
 * concretas que implementan el cálculo del IVA. Vamos a construir una Factoría
 * para que se encargue de construir ambos objetos de la jerarquía.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class FactoriaFacturas {

	public static Factura getFactura(String tipo) {

		if (tipo.equals(TipoFactura.IVA_NORMAL.name())) {
			return new FacturaIva();
		} else {
			return new FacturaIvaReducido();
		}

	}
}
