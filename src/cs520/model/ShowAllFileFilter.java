package cs520.model;

import java.io.File;
import java.io.FileFilter;


public class ShowAllFileFilter implements FileFilter 
{
	@Override
	public boolean accept(File pathname) {
		return true;
	}
}
