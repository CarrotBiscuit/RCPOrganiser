package com.vol.organiser;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
<<<<<<< HEAD
<<<<<<< HEAD
import org.eclipse.ui.part.ViewPart;
=======
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
import org.eclipse.ui.part.ViewPart;
>>>>>>> 87ec274... Added some UI elements.  Very messy.


public class Perspective implements IPerspectiveFactory {

	private final String ID = "com.vol.organiser.Perspective";
	
<<<<<<< HEAD
<<<<<<< HEAD
	ViewPart view;
	
	public void createInitialLayout(IPageLayout layout) 
	{
		BusinessHandle.getBusinessManager().createInitialLayout(layout);
	
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
=======
=======
	ViewPart view;
	
<<<<<<< HEAD
>>>>>>> 87ec274... Added some UI elements.  Very messy.
	public void createInitialLayout(IPageLayout layout) {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.ui.views");
		for (IConfigurationElement element : elements)
		{
			System.out.println(element.getName());
			System.out.println(element.getNamespaceIdentifier());
			if (element.getNamespaceIdentifier().equals("com.vol.organiser.background"))
			{
				try {
					
					view = (ViewPart) element.createExecutableExtension("class");
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		if (!view.equals(null))
		{
			layout.setEditorAreaVisible(false);
			layout.addView("com.vol.organiser.background.view.BackgroundView", IPageLayout.LEFT, 1.0f, layout.getEditorArea());
		}
		
=======
	public void createInitialLayout(IPageLayout layout) 
	{
		BusinessHandle.getBusinessManager().createInitialLayout(layout);
	
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
>>>>>>> 9eb1e3d... General streamlining of business classes.  Two views and perspectives
		
<<<<<<< HEAD
>>>>>>> a11ad8e... Initial commit.  Basic application still.
=======
		//layout.setEditorAreaVisible(false);
		//layout.addView(viewId, relationship, ratio, refId)
	//	view = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
		//for (IViewReference v : view)
		//{
		//	System.out.println(v.getId());
		//}
>>>>>>> 87ec274... Added some UI elements.  Very messy.
	}
}
