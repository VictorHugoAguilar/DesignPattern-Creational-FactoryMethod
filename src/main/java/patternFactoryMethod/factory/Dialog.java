package patternFactoryMethod.factory;

import patternFactoryMethod.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public abstract class Dialog {

	  public void renderWindow() {
	        // ... other code ...

	        Button okButton = createButton();
	        okButton.render();
	    }

	    /**
	     * Subclasses will override this method in order to create specific button
	     * objects.
	     */
	    public abstract Button createButton();
}
