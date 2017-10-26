package tal_tsur.amazon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import tal_tsur.NiceService;
import tal_tsur.Person;
import tal_tsur.TalTsurConfig;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TalTsurConfig.class)
@ActiveProfiles("amazon")
public class AmazonStorageServiceTest {

    @Autowired
    NiceService niceService;
    @Test
    public void save() throws Exception {
        niceService.savePersonToCloud(new Person());
    }

}