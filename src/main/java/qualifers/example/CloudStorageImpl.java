package qualifers.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CloudStorageImpl implements CloudStorage {


    @Autowired
    @CloudStorageType(StorageType.AMAZON)
    private CloudDao mainDao;

    @Autowired
    @CloudStorageType(StorageType.AZURE)
    private CloudDao backUpDao;

    @Override
    @Scheduled(cron = "1/1 * * * * ?")
    public void saveData() {
        System.out.println("saving....");
        mainDao.save("data");
    }

    @Override
    @Scheduled(cron = "1/3 * * * * ?")
    public void backupData() {
        System.out.println("backuping...");
        backUpDao.save("data");
    }
}
