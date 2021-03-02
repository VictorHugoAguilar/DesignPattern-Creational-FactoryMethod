package patternFactoryMethod.EjemploFactura;

/**
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class FacturaIva extends Factura {

	@Override
	public double getImporteIva() {
		return getImporte() * 1.21;
	}

}
