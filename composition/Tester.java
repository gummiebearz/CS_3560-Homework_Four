public class Tester {
  public static void main(String[] args) {
    Folder phpDemo1 = new Folder("php_demo1");

    // Add files and subfolders to "Source Files"
    Folder sourceFilesFolder = new Folder("Source Files");

    // Subfolders inside "Source Files"
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
    String[] publicFiles = {".htaccess", ".hrouter.php", "index.html"};
    for (String name : publicFiles) {
      publicFolder.addFile(name);
    }

    int numSpaces = 0;
    phpDemo1.print(numSpaces);
  }
}
