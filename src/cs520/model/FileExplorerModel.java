package cs520.model;


public class FileExplorerModel 
{
	public static final String DESKTOP_FOLDER_NAME = "Desktop";
	public static final String DOCUMENTS_FOLDER_NAME = "Documents";
	public static final String DOWNLOADS_FOLDER_NAME = "Downloads";
	
	private String osName;
	private String osVersion;
	private String homeFolderName;
	private String desktopFolderName;
	private String documentsFolderName;
	private String downloadsFolderName;	
	private FileModel currentOpenFolder;
	
	public FileExplorerModel() {
		this.osName = System.getProperty("os.name");
		this.osVersion = System.getProperty("os.version");
		this.homeFolderName = System.getProperty("user.home");
		this.desktopFolderName = this.homeFolderName + System.getProperty("file.separator") + DESKTOP_FOLDER_NAME;
		this.documentsFolderName = this.homeFolderName + System.getProperty("file.separator") + DOCUMENTS_FOLDER_NAME;
		this.downloadsFolderName = this.homeFolderName + System.getProperty("file.separator") + DOWNLOADS_FOLDER_NAME;
		this.currentOpenFolder = null;
	}
	
	public String getOSName() {
		return this.osName;
	}
	
	public String getOSVersion() {
		return this.osVersion;
	}
	
	public String getHomeFolderName() {
		return this.homeFolderName;
	}
	
	public String getDesktopFolderName() {
		return this.desktopFolderName;
	}
	
	public String getDocumentsFolderName() {
		return this.documentsFolderName;
	}
	
	public String getDownloadsFolderName() {
		return this.downloadsFolderName;
	}
	
	public FileModel getCurrentOpenFolder() {
		return this.currentOpenFolder;
	}
	
	public void go(FileModel currentOpenFolder) {
		// Perform input validation
		if ((currentOpenFolder != null) && (! currentOpenFolder.isDirectory())) {
			throw new UnsupportedOperationException("Cannot go to file " + currentOpenFolder.getName());
		}
		this.currentOpenFolder = currentOpenFolder;
	}
}
