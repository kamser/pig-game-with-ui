package common;

import java.awt.Rectangle;

public class CustomUIelement {
	private String UIText;
	private Rectangle UICoordenadesAndDimentions;
	private UIelementIdentifier uiElemID;
	
	
	
	public CustomUIelement(String uIText, Rectangle uICoordenadesAndDimentions, UIelementIdentifier uiElemID) {
		super();
		UIText = uIText;
		UICoordenadesAndDimentions = uICoordenadesAndDimentions;
		this.uiElemID = uiElemID;
	}
	public UIelementIdentifier getUiElemID() {
		return uiElemID;
	}
	public void setUiElemID(UIelementIdentifier uiElemID) {
		this.uiElemID = uiElemID;
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
