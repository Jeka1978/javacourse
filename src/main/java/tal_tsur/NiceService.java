package tal_tsur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NiceService {
    @Autowired
    private CloudStorageService storageService;

    public void savePersonToCloud(Person person) {
        storageService.save(person);
    }
}
