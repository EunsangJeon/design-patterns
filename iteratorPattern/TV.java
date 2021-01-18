public class TV {
    private ChannelFrequencies currentChannelFrequency;

    public void chUp(){
        ChannelIterator ci = currentChannelFrequency.createIterator();
        ci.next();
    }

    public void chDown() {
        ChannelIterator ci = currentChannelFrequency.createIterator();
        ci.prev();
    }

    public void setCurrentChannelFrequency(ChannelFrequencies currentChannelFrequency) {
        this.currentChannelFrequency = currentChannelFrequency;
    }
}
