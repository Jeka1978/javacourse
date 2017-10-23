package enums;

import lombok.*;

@AllArgsConstructor
@Getter
public enum MaritalStatus {
    SINGLE(1,"רווק"),MARRIED(3,"נשוי"), DIVORCED(4, "גרוש");

    private  int dbCode;
    private  String hebrewDesc;





}
