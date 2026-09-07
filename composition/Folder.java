import java.util.ArrayList;

public class Folder {
  private String folderName;
  private ArrayList<File> files;
  private ArrayList<Folder> subfolders;

  public Folder(String folderName) {
    this.folderName = folderName;
    this.files = new ArrayList<File>();
    this.subfolders = new ArrayList<Folder>();
  }

  public String getFolderName() {
    return this.folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  public void addFile(String filename) {
    this.files.add(new File(filename));
  }

  public void removeFile(String fileToRemove) {
    /* // Iterative method
    for (File file : this.files) {
      if (file.getName().equals(fileToRemove)) {
        this.files.remove(fileToRemove); // Remove by object
        break;
      }
    } */
    this.files.removeIf(file -> file.getName().equals(fileToRemove));
  }

  public void addSubfolder(String foldername) {
    this.subfolders.add(new Folder(folderName));
  }

  public void removeSubfolder(String folderToRemove) {
    /* // Iterative method
    for (Folder subfolder : this.subfolders) {
      if (subfolder.getName().equals(folderToRemove)) {
        this.subfolders.remove(subfolder); // Remove by object
        break;
      }
    } */
    this.subfolders.removeIf(subfolder -> subfolder.getName().equals(folderToRemove));
  }

  public void print(int numSpaces) {
    // Check for files in current folder
    for (File file : this.files) {
      System.out.printf("%" + numSpaces + "s|%s", file.getFileName());
    }

    // Check for subfolders in current folder
    for (Folder subfolder : this.subfolders) {
      System.out.printf("%" + numSpaces + "s|%s", subfolder.getFolderName());
      if (subfolder.size() > 0) {
        subfolder.print(numSpaces + 1);
      }
    }
  }
}
