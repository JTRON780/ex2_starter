package cs520.model;

import java.io.File;
import java.io.FileFilter;


public class HideHiddenResourcesFileFilter implements FileFilter 
{
	@Override
	public boolean accept(File pathname) {
		return (! pathname.isHidden());
	}
}
