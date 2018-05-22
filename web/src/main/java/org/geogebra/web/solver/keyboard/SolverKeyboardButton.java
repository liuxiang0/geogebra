package org.geogebra.web.solver.keyboard;

import com.google.gwt.user.client.ui.SimplePanel;
import org.geogebra.common.euclidian.event.PointerEventType;
import org.geogebra.keyboard.web.KeyboardResources;
import org.geogebra.web.html5.gui.util.ClickStartHandler;
import org.geogebra.web.html5.gui.util.NoDragImage;

public class SolverKeyboardButton extends SimplePanel {

	public SolverKeyboardButton(final SolverKeyboard kb) {
		addStyleName("solverKeyboardBtn");
		NoDragImage showKeyboard = new NoDragImage(
				KeyboardResources.INSTANCE.keyboard_show_material()
				.getSafeUri().asString());
		add(showKeyboard);

		ClickStartHandler.init(this, new ClickStartHandler() {
			@Override
			public void onClickStart(int x, int y, PointerEventType type) {
				if (kb.isVisible()) {
					kb.hide();
				} else {
					kb.show();
				}
			}
		});
	}

}
