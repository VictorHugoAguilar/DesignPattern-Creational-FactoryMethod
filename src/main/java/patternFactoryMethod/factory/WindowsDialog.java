package patternFactoryMethod.factory;

import patternFactoryMethod.buttons.Button;
import patternFactoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
