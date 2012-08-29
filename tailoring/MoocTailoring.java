package fi.helsinki.cs.tmc.tailoring;

public class MoocTailoring extends DefaultTailoring {
    @Override
    public String getDefaultServerUrl() {
        return "http://tmc.mooc.fi/mooc";
    }

    @Override
    public boolean isSpywareEnabledByDefault() {
        return true;
    }
    
    @Override
    public String getUpdateCenterTitle() {
        return "TMC Mooc Edition Updates";
    }

    @Override
    public String getUpdateCenterUrl() {
        return "http://update.testmycode.net/tmc-netbeans_mooc/updates.xml";
    }
}
