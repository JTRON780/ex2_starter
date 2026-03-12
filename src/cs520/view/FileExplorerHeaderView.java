package cs520.view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cs520.model.FileExplorerModel;
import cs520.model.FileModel;


public class FileExplorerHeaderView
{	
	private JPanel filePanel;
	private JLabel fileLabel;
	
	public FileExplorerHeaderView(FileModel fileModel) {
		super();
		
		this.filePanel = new JPanel();
		this.filePanel.setSize(800, 50);
		this.fileLabel = new JLabel();
		this.filePanel.add(this.fileLabel);
		this.update(fileModel);
	}
	
	protected JPanel getFilePanel() {
		return this.filePanel;
	}
	
	protected void update(FileModel fileModel) {
		String fileLabelName;
		ImageIcon fileIcon;
		if (fileModel == null) {
			fileLabelName = null;
			fileIcon = null;
		}
		else {
			fileLabelName = fileModel.getPath();
			if (fileModel.isFile()) {
				fileIcon = FileExplorerIcons.FILE_ICON;
			}
			else {
				fileIcon = FileExplorerIcons.FOLDER_ICON;
			}
		}
		this.fileLabel.setIcon(fileIcon);
		this.fileLabel.setText(fileLabelName);
		this.fileLabel.setToolTipText(fileLabelName);
	}
	
	public void update(FileExplorerModel model) {
		FileModel fileModel = null;
		if (model != null) {
			fileModel = model.getCurrentOpenFolder();
		}
		this.update(fileModel);
	}
}
