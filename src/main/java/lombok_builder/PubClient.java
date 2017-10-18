package lombok_builder;

import lombok.*;

import java.util.List;
import java.util.Map;

@Builder
@Data
public class PubClient {

    @NonNull
    private String name;
    @NonNull
    private Integer age;
    @Singular
    private List<String> beers;

    @Singular
    private Map<String,Integer> priorities;

    @Singular("oneFish")
    private List<String> fish;

}
