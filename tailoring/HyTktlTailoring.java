package fi.helsinki.cs.tmc.tailoring;

import java.util.Locale;

public class HyTktlTailoring extends DefaultTailoring {
    @Override
    public String getDefaultServerUrl() {
        return "https://tmc.mooc.fi/";
    }

    @Override
    public boolean isSpywareEnabledByDefault() {
        return true;
    }

    @Override
    public boolean isDetailedSpywareEnabledByDefault() {
        return true;
    }

    @Override
    public String getUpdateCenterTitle() {
        return "TMC HY Edition Updates";
    }

    @Override
    public String getUpdateCenterUrl() {
        return "http://update.testmycode.net/tmc-netbeans_hy_tktl/updates.xml";
    }

    @Override
    public Locale[] getAvailableErrorMsgLocales() {
        return new Locale[] { new Locale("en"), new Locale("fi") };
    }

    @Override
    public Locale getDefaultErrorMsgLocale() {
        return new Locale("fi");
    }
}
