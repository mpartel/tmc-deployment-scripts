package fi.helsinki.cs.tmc.tailoring;

import java.util.Locale;

public class PkTailoring extends DefaultTailoring {
    @Override
    public String getDefaultServerUrl() {
        return "http://tmc.mooc.fi/pk";
    }
    
    @Override
    public String getUpdateCenterTitle() {
        return "TMC Mooc PK Edition Updates";
    }

    @Override
    public String getUpdateCenterUrl() {
        return "http://update.testmycode.net/tmc-netbeans_pk/updates.xml";
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
