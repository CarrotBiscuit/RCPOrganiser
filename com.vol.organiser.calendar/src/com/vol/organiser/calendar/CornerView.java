package com.vol.organiser.calendar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class CornerView extends ViewPart {
	
	public static final String ID = "com.vol.organiser.calendar.view.cornerView";

	public CornerView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		Label label = new Label(parent, SWT.BOLD);
		label.setSize(new Point(200,200));
		label.setText("TEXT GOES HERE");

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
