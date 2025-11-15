package user_data_backup;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class UserBackupService {
    public void saveUser(List<User> users, String filePath) {
        try (ObjectOutputStream stream = new ObjectOutputStream(Files.newOutputStream(Paths.get(filePath)))) {
            stream.writeObject(users);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    public List<User> loadUser(String filePath) {
        List<User> users = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get(filePath)))) {
            users = (List<User>) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("geri alina bilmedi"+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("class yoxdur"+e.getMessage());
        }
        return users;
    }

    public void deleteBackup(String buckupFilePath) {
        Path path = Paths.get(buckupFilePath);
        try {
            if (Files.exists(path)) {
                Files.delete(path);
                System.out.println("silindi"+":"+buckupFilePath);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
