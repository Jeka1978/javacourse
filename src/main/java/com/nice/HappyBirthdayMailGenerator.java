package com.nice;

import never_use_switch.MailInfo;

public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateMailContent(MailInfo mailInfo) {
        //60 lines of code
        return "<html> Happy birthday "+mailInfo.getClient().getName();
    }

    @Override
    public int mailCode() {
        return 3;
    }

}
