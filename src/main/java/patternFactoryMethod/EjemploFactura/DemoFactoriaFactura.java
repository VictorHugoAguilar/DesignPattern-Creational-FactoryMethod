package patternFactoryMethod.EjemploFactura;

/**
 * La clase lo único que hace es instanciar un objeto u otro dependiendo del
 * tipo que le solicitemos.
 * 
 * Esto permite una simplificación a la hora de trabajar clara. Es cierto que
 * las Factorias se encargan de generar una jerarquía de clases pero su función
 * fundamental es encapsular una jerarquía de objetos y reducir el conjunto de
 * conceptos con los que trabajamos.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class DemoFactoriaFactura {

	public static void main(String[] args) {
		Factura f = FactoriaFacturas.getFactura(TipoFactura.IVA_NORMAL.name());
		f.setId(1001);
		f.setImporte(100);
		System.out.println("La factura con id " + f.getId() + " -> " + f.getImporteIva());
	}
}
