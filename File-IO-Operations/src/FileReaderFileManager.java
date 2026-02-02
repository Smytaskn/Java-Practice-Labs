import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileManager implements FileManager {
    @Override
    public String read(String filePath) {
        return null; // Şimdilik boş kalsın veya doldurabilirsin
    }

    @Override
    public void writeFile(String filePath, String data) { // void yaptık çünkü return data gereksizdi
        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}