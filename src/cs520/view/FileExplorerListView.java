package cs520.view;

import java.awt.Color;
import java.io.File;
import java.io.FileFilter;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

import cs520.model.FileExplorerModel;
import cs520.model.FileModel;
import cs520.model.HideHiddenResourcesFileFilter;
import cs520.model.ShowAllFileFilter;


public class FileExplorerListView 
{
	private FileExplorerGUI gui;
	private JScrollPane fileListingPanel;
	private DefaultListModel<FileModel> fileListingModel;
	private JList<FileModel> fileListingView;
	
	public FileExplorerListView(FileExplorerGUI gui) {
		this.gui = gui;
		this.fileListingPanel = new JScrollPane();
		this.fileListingModel = new DefaultListModel<FileModel>();
		this.fileListingView = new JList<FileModel>(this.fileListingModel);
		this.fileListingView.setBackground(Color.white);
		this.fileListingView.setCellRenderer(new FileModelListCellRenderer());
		this.fileListingView.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        this.fileListingPanel.getViewport().setView(this.fileListingView);		
	}
	
	public JScrollPane getFileListingPanel() {
		return this.fileListingPanel;
	}
	
	public ListModel<FileModel> getFileListingModel() {
		return this.fileListingModel;
	}
	
	public JList<FileModel> getFileListingView() {
		return this.fileListingView;
	}
	
	public void update(FileExplorerModel model) {
		this.fileListingModel.clear();
		if (model.getCurrentOpenFolder() != null) {
			// Apply the selected file filter
			FileFilter selectedFileFilter;
			if (this.gui.getShowHiddenResourcesMenuItem().getText().equals(FileExplorerGUI.SHOW_HIDDEN_RESOURCES_MENUITEM_TITLE)) {
				selectedFileFilter = new HideHiddenResourcesFileFilter();
			}
			else {
				selectedFileFilter = new ShowAllFileFilter();
			}
			for (File currentOpenFile : model.getCurrentOpenFolder().listFiles(selectedFileFilter)) {
//				System.out.println("\t" + currentOpenFile);
				this.fileListingModel.addElement((FileModel)currentOpenFile);
			}
		}
	}
}
