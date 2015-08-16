package com.vol.organiser.calendar;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.swt.widgets.Button;

public class AElement implements IAdaptable {

	private Button button;
	private String name;
	
	@Override
	public Object getAdapter(Class adapter) {
//		if (adapter == IPropertySource.class) {
//			if (btnElPS == null) {
//				// cache the buttonelementpropertysource
//				btnElPS = new ButtonElementPropertySource(this,name);
//			}
//			return btnElPS;
//		 }
         return null;
	}

}
