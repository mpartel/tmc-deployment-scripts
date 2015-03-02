package fi.helsinki.cs.tmc.tailoring;

import java.util.Locale;

public class TestTailoring extends DefaultTailoring {
    @Override
    public String getDefaultServerUrl() {
        return "https://tmc.mooc.fi/staging";
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
        return "TMC TEST Edition Updates";
    }

    @Override
    public String getUpdateCenterUrl() {
        return "http://update.testmycode.net/tmc-netbeans_test/updates.xml";
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
