package com.vol.organiser.background.perspective;

import java.net.URL;

import org.eclipse.swt.layout.RowLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.vol.organiser.background.view.BackgroundView;
import com.vol.organiser.background.view.CardView;

public class Perspective implements IPerspectiveFactory {
	
	public final static String ID = "com.vol.organiser.background.perspective.Perspective";
	
	URL pluginInternalURL;
	
	public Perspective()
	{
		
	}

	@Override
	public void createInitialLayout(IPageLayout layout) {

		layout.setEditorAreaVisible(false);
		layout.addView(CardView.ID, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
	}
}
