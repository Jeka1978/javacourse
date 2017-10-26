package qualifers.example;


import org.springframework.stereotype.Repository;

@Repository
@CloudStorageType(StorageType.AMAZON)
public class AmazonCloudDao implements CloudDao {
    @Override
    public void save(String data) {
        System.out.println("saving "+data+" to amazon");
    }
}
