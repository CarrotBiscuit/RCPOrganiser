package com.vol.organiser;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import org.eclipse.ui.part.ViewPart;


public class Perspective implements IPerspectiveFactory {

	private final String ID = "com.vol.organiser.Perspective";
	
	ViewPart view;
	
	public void createInitialLayout(IPageLayout layout) 
	{
		BusinessHandle.getBusinessManager().createInitialLayout(layout);
	}
}
	
//		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.ui.views");
//		for (IConfigurationElement element : elements)
//		{
//			System.out.println(element.getName());
//			System.out.println(element.getDeclaringExtension().toString());
//			System.out.println(element.getNamespaceIdentifier());
//			if (element.getNamespaceIdentifier().equals("com.vol.organiser.background"))
//			{
//				try {
//					
//					view = (ViewPart) element.createExecutableExtension("class");
//				} catch (CoreException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			}
//		}
//		if (!view.equals(null))
//		{
//			layout.setEditorAreaVisible(false);
//			//layout.addView("com.vol.organiser.background.view.BackgroundView", IPageLayout.LEFT, 1.0f, layout.getEditorArea());
//			//layout.addPlaceholder("com.vol.organiser.background.perspective.Perspective", IPageLayout.LEFT, 1.0f, layout.getEditorArea());
//		}
//		layout.addView("com.vol.organiser.PlaceHolderView", IPageLayout.LEFT, 1.0f, layout.getEditorArea());
//		BusinessSetup businessSetup = new BusinessSetup();
//		businessSetup.setup();
		
		//layout.setEditorAreaVisible(false);
		//layout.addView(viewId, relationship, ratio, refId)
	//	view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
		//for (IViewReference v : view)
		//{
		//	System.out.println(v.getId());
		//}