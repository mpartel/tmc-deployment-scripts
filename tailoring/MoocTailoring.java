package fi.helsinki.cs.tmc.tailoring;

import java.util.Locale;

public class MoocTailoring extends DefaultTailoring {
    @Override
    public String getDefaultServerUrl() {
        return "https://tmc.mooc.fi/mooc";
    }

    @Override
    public String getUpdateCenterTitle() {
        return "TMC Mooc Edition Updates";
    }

    @Override
    public String getUpdateCenterUrl() {
        return "http://update.testmycode.net/tmc-netbeans_mooc/updates.xml";
    }

    @Override
    public Locale[] getAvailableErrorMsgLocales() {
        return new Locale[] { new Locale("en"), new Locale("fi") };
    }

    @Override
    public Locale getDefaultErrorMsgLocale() {
        return new Locale("fi");
    }

    @Override
    public boolean isSpywareEnabledByDefault() {
        return true;
    }
}
