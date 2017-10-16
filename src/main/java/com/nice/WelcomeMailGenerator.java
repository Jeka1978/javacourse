package com.nice;

import never_use_switch.MailInfo;

public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMailContent(MailInfo mailInfo) {
        //60 lines of code
        return "<html> Welcome " + mailInfo.getClient().getName() + " !!!</html";
    }

    @Override
    public int mailCode() {
        return 1;
    }
}
