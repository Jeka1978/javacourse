package qualifers.example;


import org.springframework.stereotype.Repository;

@Repository
@CloudStorageType(StorageType.AZURE)
public class AzureCloudDao implements CloudDao {
    @Override
    public void save(String data) {
        System.out.println("saving "+data+" to azure");
    }
}
