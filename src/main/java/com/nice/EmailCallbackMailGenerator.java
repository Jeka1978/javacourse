package com.nice;

import never_use_switch.MailInfo;

public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMailContent(MailInfo mailInfo) {
        //60 lines of code
        return "<html> don't call us, we call you html";
    }

    @Override
    public int mailCode() {
        return 2;
    }

}
