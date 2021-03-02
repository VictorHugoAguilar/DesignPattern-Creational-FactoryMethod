package patternFactoryMethod.factory;

import patternFactoryMethod.buttons.Button;
import patternFactoryMethod.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class HtmlDialog extends Dialog {
	
	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}
