package lesson5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyDir {
    public static void main(String[] args) {
        try {
            CopyDir("/Users/logeyko/IdeaProjects/lesson5/src/lesson5", "/Users/logeyko/IdeaProjects/lesson5/lesson5_backup/");
            System.out.println("Файлы успешно скопированы");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void CopyDir(String sourceDirName, String targetSourceDir) throws IOException {
        File folder = new File("/Users/logeyko/IdeaProjects/lesson5/src/lesson5/");

        File[] listOfFiles = folder.listFiles();

        Path destDir = Paths.get("/Users/logeyko/IdeaProjects/lesson5/lesson5_backup/");
        if (listOfFiles != null)
            for (File file : listOfFiles)
                Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
    }
}
