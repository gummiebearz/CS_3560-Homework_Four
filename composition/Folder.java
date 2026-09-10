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

  public File addFile(String fileName) {
    File newFile = new File(fileName);
    this.files.add(newFile);

    return newFile;
  }

  public File getFile(String fileName) {
    for (File file : this.files) {
      if (file.getFileName().equals(fileName)) {
        return file;
      }
    }

    return null;
  }

  public void removeFile(String fileToRemove) {
    /* // Iterative method
    for (File file : this.files) {
      if (file.getName().equals(fileToRemove)) {
        this.files.remove(fileToRemove); // Remove by object
        break;
      }
    } */
    this.files.removeIf(file -> file.getFileName().equals(fileToRemove));
  }

  public Folder addSubfolder(String folderName) {
    Folder newSubfolder = new Folder(folderName);
    this.subfolders.add(newSubfolder);

    return newSubfolder;
  }

  public Folder getSubfolder(String folderName) {
    for (Folder folder : this.subfolders) {
      if (folder.getFolderName().equals(folderName)) {
        return folder;
      }
    }

    return null;
  }

  public void removeSubfolder(String folderToRemove) {
    /* // Iterative method
    for (Folder subfolder : this.subfolders) {
      if (subfolder.getName().equals(folderToRemove)) {
        this.subfolders.remove(subfolder); // Remove by object
        break;
      }
    } */
    this.subfolders.removeIf(subfolder -> subfolder.getFolderName().equals(folderToRemove));
  }

  public void print() {
    System.out.println(this.folderName);
    printHelper(2);
  }

  private void printHelper(int numSpaces) {
    // Check for files in current folder
    for (File file : this.files) {
      System.out.printf("%" + numSpaces + "s|-", "");
      file.print();
    }

    // Check for subfolders in current folder
    for (Folder subfolder : this.subfolders) {
      System.out.printf("%" + numSpaces + "s|-%s\n", "", subfolder.getFolderName());
      // Recursively print files and subfolders inside the current subfolder
      subfolder.printHelper(numSpaces + 2);
    }
  }
}
