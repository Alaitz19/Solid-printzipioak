package lsk;

public class Proba {
	 public static void main(String[] args) {
	        Project project = new Project();

	        // Fitxategiak sortu
	        ProjectFile editableFile = new EditableProjectFile("editableFile.txt");
	        ProjectFile readOnlyFile = new ReadOnlyProjectFile("readOnlyFile.txt");

	        // Fitxategiak proiektuan gorde
	        project.addProjectFile(editableFile);
	        project.addProjectFile(readOnlyFile);

	        // Fitxategiak kargatu
	        project.loadAllFiles();

	    
	        project.storeAllFiles();
	    }

}
