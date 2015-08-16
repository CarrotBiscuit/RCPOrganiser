package com.vol.organiser.calendar;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IPageLayout;

import com.vol.organiser.business.BaseOrganiserBusiness;
import com.vol.organiser.business.IOrganiserBusiness;

public class BusinessCalendar extends BaseOrganiserBusiness implements IOrganiserBusiness  {
	
	@Override
	public void fillMenuBar(IMenuManager menuBar) 
	{
	
	}
	
	
	@Override
	public void intialUISetup(IPageLayout layout) {

		layout.setEditorAreaVisible(false);
		layout.addView(CalendarView.ID, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
		
	}

}
