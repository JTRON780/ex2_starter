package cs520.model;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;


/**
 * Represents a FileModel for the MVC architecture pattern.
 * 
 * NOTE) Conceptually applies the Decorator design pattern.
 */
public class FileModel extends File
{
	private static final long serialVersionUID = -2763301774758261851L;

	public FileModel(String pathname) {
		super(pathname);
	}
	
	public boolean createNewFile() {
		throw new UnsupportedOperationException("FileModel does not support createNewFile.");
	}
	
	public boolean delete() {
		throw new UnsupportedOperationException("FileModel does not support delete.");
	}
	
	public void deleteOnExit() {
		throw new UnsupportedOperationException("FileModel does not support deleteOnExit.");
	}
	
	public File getAbsoluteFile() {
		return new FileModel(super.getAbsolutePath());
	}
	
	public File getCanonicalFile() throws IOException {
		return new FileModel(super.getCanonicalPath());
	}
	
	public File getParentFile() {
		if (super.getParentFile() == null) {
			return null;
		}
		return new FileModel(super.getParent());
	}

	protected File[] convertListFiles(File[] fileListing) {
		FileModel[] fileListingConverted = new FileModel[fileListing.length];
		for (int i = 0; i < fileListing.length; i++) {
			fileListingConverted[i] = new FileModel(fileListing[i].getPath());
		}
		return fileListingConverted;
	}
	
	public File[] listFiles() {
		return this.convertListFiles(super.listFiles());
	}
	
	public File[] listFiles(FileFilter filter) {
		return this.convertListFiles(super.listFiles(filter));
	}
	
	public File[] listFiles(FilenameFilter filter) {
		return this.convertListFiles(super.listFiles(filter));
	}
	
	public boolean mkdir() {
		throw new UnsupportedOperationException("FileModel does not support mkdir.");
	}
	
	public boolean mkdirs() {
		throw new UnsupportedOperationException("FileModel does not support mkdirs.");
	}
	
	public boolean renameTo(File dest) {
		throw new UnsupportedOperationException("FileModel does not support rename.");
	}
	
	public boolean setExecutable(boolean executable) {
		throw new UnsupportedOperationException("FileModel does not support setExecutable.");
	}
	
	public boolean setExecutable(boolean executable, boolean ownerOnly) {
		throw new UnsupportedOperationException("FileModel does not support setExecutable.");
	}
	
	public boolean setLastModified(long time) {
		throw new UnsupportedOperationException("FileModel does not support setLastModified.");
	}
	
	public boolean setReadable(boolean readable) {
		throw new UnsupportedOperationException("FileModel does not support setReadable.");
	}
	
	public boolean setReadable(boolean readable, boolean ownerOnly) {
		throw new UnsupportedOperationException("FileModel does not support setReadable.");
	}
	
	public boolean setReadOnly() {
		throw new UnsupportedOperationException("FileModel does not support setReadOnly.");
	}
	
	public boolean setWritable(boolean writable) {
		throw new UnsupportedOperationException("FileModel does not support setWritable.");
	}
	
	public boolean setWritable(boolean writable, boolean ownerOnly) {
		throw new UnsupportedOperationException("FileModel does not support setWritable.");
	}
	
	public String toString() {
		return this.getName();
	}
}
