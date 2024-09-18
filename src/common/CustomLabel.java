package common;

import java.awt.Rectangle;

public class CustomLabel {
	private String UIText;
	private Rectangle UICoordenadesAndDimentions;
	
	
	
	public CustomLabel(String uIText, Rectangle uICoordenadesAndDimentions) {
		super();
		UIText = uIText;
		UICoordenadesAndDimentions = uICoordenadesAndDimentions;
	}
	public String getUIText() {
		return UIText;
	}
	public void setUIText(String uIText) {
		UIText = uIText;
	}
	public Rectangle getUICoordenadesAndDimentions() {
		return UICoordenadesAndDimentions;
	}
	public void setUICoordenadesAndDimentions(Rectangle uICoordenadesAndDimentions) {
		UICoordenadesAndDimentions = uICoordenadesAndDimentions;
	}

}
