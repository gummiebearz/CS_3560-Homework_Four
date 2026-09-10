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
    phpDemo1.print();

    // Remove folder "app"
    System.out.println("\nAFTER REMOVING FOLDER \"APP\":");
    sourceFilesFolder.removeSubfolder("app");
    phpDemo1.print();

    // Removing folder "public"
    System.out.println("\nAFTER REMOVING FOLDER \"PUBLIC\":");
    sourceFilesFolder.removeSubfolder("public");
    phpDemo1.print();
  }
}
