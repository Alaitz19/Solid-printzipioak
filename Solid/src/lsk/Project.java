package lsk;

import java.util.Vector;

public class Project {
    private Vector<ProjectFile> files = new Vector<>();

    public void addProjectFile(ProjectFile file) {
        files.add(file);
    }

    public void loadAllFiles() {
        for (ProjectFile file : files) {
            file.loadFile();
        }
    }

    public void storeAllFiles() {
        for (ProjectFile file : files) {
            if (file instanceof Storeable) {
                ((Storeable) file).storeFile();
            } else {
                System.out.println("ERROR: " + file.getFilePath() + " is read-only and cannot be saved.");
            }
        }
    }
}