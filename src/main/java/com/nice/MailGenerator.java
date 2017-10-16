package com.nice;

import never_use_switch.MailInfo;

public interface MailGenerator {
    String generateMailContent(MailInfo mailInfo);

    int mailCode();
}
