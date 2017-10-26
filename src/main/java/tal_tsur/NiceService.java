package tal_tsur;

import org.springframework.beans.factory.annotation.Autowired;

public class NiceService {
    @Autowired
    private CloudStorageService storageService;

    public void savePersonToCloud(NicePerson person) {
        storageService.save(person);
    }
}
