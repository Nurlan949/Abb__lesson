package user_data_backup;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Aliyev", "nurlanaliyef@gmail.com", 18);
        User user2 = new User("Abbasov", "abbasov123@gmail.com", 20);
        List<User> userList = Arrays.asList(user1, user2);
        UserBackupService userBackupService = new UserBackupService();
        String userFilePath = "users.dat";
        String backupDirectory = "backup";

        userBackupService.saveUser(userList, userFilePath);
        List<User> loadUser = userBackupService.loadUser(userFilePath);
        if (loadUser != null){
            for (User user:loadUser){
                System.out.println(user);
            }
        }
        userBackupService.deleteBackup(Paths.get(backupDirectory,"users.dat").toString());
        System.out.println("Process Completed");
    }
}
