package cs520;

import cs520.controller.FileExplorerController;


/**
 * Provides a simplified File Explorer for your Operating System file system.
 * 
 * NOTE: Applies the client-server and MVC architecture patterns.
 */
public class FileExplorer 
{
	public static void main (String[] args) {
		FileExplorerController controller = new FileExplorerController();
		controller.refresh();
	}
}
