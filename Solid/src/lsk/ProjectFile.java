package lsk;

public class ProjectFile {
    protected String filePath;

    public ProjectFile(String filePath) {
        this.filePath = filePath;
    }

    public void loadFile() {
        System.out.println("file loaded from " + filePath);
    }

    public String getFilePath() {
        return filePath;
    }
}
