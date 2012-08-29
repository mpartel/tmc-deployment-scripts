package fi.helsinki.cs.tmc.tailoring;

public class MoocTestTailoring extends DefaultTailoring {
    @Override
    public String getDefaultServerUrl() {
        return "http://tmc.mooc.fi/test";
    }
    
    @Override
    public String getUpdateCenterTitle() {
        return "TMC Mooc Test Edition Updates";
    }

    @Override
    public String getUpdateCenterUrl() {
        return "http://update.testmycode.net/tmc-netbeans_mooc_test/updates.xml";
    }
}
