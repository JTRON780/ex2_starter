package cs520.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


/**
 * Provides support for performing black box testing of the 
 * model part of the MVC architecture pattern.
 */
public class FileExplorerModelTests 
{
	private FileExplorerModel fileExplorerModel;
	private FileModel testFolderModel;
	private FileModel testFileModel;
	
	@BeforeEach
	public void setUp() {
		this.fileExplorerModel = new FileExplorerModel();
		this.testFolderModel = new FileModel("test_files/test_folder");
		this.testFileModel = new FileModel("test_files/test_file1.txt");
	}
	
	@Test
	public void testFileExplorerModel() {
		assertNotNull(this.fileExplorerModel);
		FileModel currentOpenFileModel = this.fileExplorerModel.getCurrentOpenFolder();
		assertNull(currentOpenFileModel);
	}
	
	@Test
	public void testFileModelForFolder() {
		assertNotNull(this.testFolderModel);
		assertTrue(this.testFolderModel.isDirectory());
		assertFalse(this.testFolderModel.isHidden());
	}
	
	@Test
	public void testFileModelForFile() {
		assertNotNull(this.testFileModel);
		assertTrue(this.testFileModel.isFile());
		assertFalse(this.testFolderModel.isHidden());
	}
	
	@Test
	public void testCreateNewFile() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.createNewFile();
	    });
	}
	
	@Test
	public void testDelete() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.delete();
	    });
	}
	
	@Test
	public void testDeleteOnExit() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.deleteOnExit();
	    });
	}
	
	@Test
	public void testMkdir() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.mkdir();
	    });
	}
	
	@Test
	public void testMkdirs() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.mkdirs();
	    });
	}	
	
	@Test
	public void testRenameTo() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.renameTo(null);
	    });
	}
	
	@Test
	public void testSetExecutableWithoutOwner() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.setExecutable(true);
	    });
	}
	
	@Test
	public void testSetExecutableWithOwner() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.setExecutable(true, true);
	    });
	}
	
	@Test
	public void testSetLastModified() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.setLastModified(1);
	    });
	}
	
	@Test
	public void testSetReadableWithoutOwner() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.setReadable(true);
	    });
	}
	
	@Test
	public void testSetReadableWithOwner() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.setReadable(true, true);
	    });
	}
	
	@Test
	public void testSetReadOnly() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.setReadOnly();
	    });
	}
	
	@Test
	public void testSetWritableWithoutOwner() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.setWritable(true);
	    });
	}
	
	@Test
	public void testSetWritableWithOwner() {
		assertThrows(UnsupportedOperationException.class, () -> {
			this.testFolderModel.setWritable(true, true);
	    });
	}
	
	@AfterEach
	public void tearDown() {
		this.fileExplorerModel = null;
		this.testFolderModel = null;
	}
}
