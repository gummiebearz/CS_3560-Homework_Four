public class Tester {
  public static void main(String[] args) {
    Folder phpDemo1 = new Folder("php_demo1");
    Folder sourceFilesFolder = phpDemo1.addSubfolder("Source Files");

    // Subfolders to "Source Files"
    sourceFilesFolder.addSubfolder(".phalcon");
    Folder appFolder = sourceFilesFolder.addSubfolder("app");
    sourceFilesFolder.addSubfolder("cache");
    Folder publicFolder = sourceFilesFolder.addSubfolder("public");

    // Subfolders inside "Source Files/app"
    String[] appSubfolders = {"config", "controllers", "library", "migrations", "models", "views"};
    for (String name : appSubfolders) {
      appFolder.addSubfolder(name);
    }

    // Files inside "Source Files/public"
    String[] publicFiles = {".htaccess", ".htrouter.php", "index.html"};
    for (String name : publicFiles) {
      publicFolder.addFile(name);
    }

    // Print out the php_demo1 structure
    System.out.println("ORIGINAL FOLDER STRUCTURE:");
    int numSpaces = 1;
    System.out.println(phpDemo1.getFolderName());
    phpDemo1.print(numSpaces);

    // Remove folder "app"
    System.out.println("\nREMOVING FOLDER \"APP\":");
    sourceFilesFolder.removeSubfolder("app");
    System.out.println(phpDemo1.getFolderName());
    phpDemo1.print(numSpaces);

    // Removing folder "public"
    System.out.println("\nREMOVING FOLDER \"PUBLIC\":");
    sourceFilesFolder.removeSubfolder("public");
    System.out.println(phpDemo1.getFolderName());
    phpDemo1.print(numSpaces);
  }
}
