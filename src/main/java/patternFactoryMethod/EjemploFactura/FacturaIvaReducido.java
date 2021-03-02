package patternFactoryMethod.EjemploFactura;

/**
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class FacturaIvaReducido extends Factura {

	@Override
	public double getImporteIva() {
		return getImporte() * 1.07;
	}

}
