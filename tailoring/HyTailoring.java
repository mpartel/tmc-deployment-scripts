package fi.helsinki.cs.tmc.tailoring;

public class HyTailoring extends DefaultTailoring {
    @Override
    public String getDefaultServerUrl() {
        return "http://tmc.mooc.fi/hy";
    }
    
    @Override
    public boolean isSpywareEnabledByDefault() {
        return true;
    }
    
    @Override
    public String getUpdateCenterTitle() {
        return "TMC HY Edition Updates";
    }

    @Override
    public String getUpdateCenterUrl() {
        return "http://update.testmycode.net/tmc-netbeans_hy/updates.xml";
    }
}
