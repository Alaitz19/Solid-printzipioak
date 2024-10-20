package lsk;

public class EditableProjectFile extends ProjectFile implements Storeable {

    public EditableProjectFile(String filePath) {
        super(filePath);
    }

    @Override
    public void storeFile() {
        System.out.println("file saved to " + filePath);
    }
}
