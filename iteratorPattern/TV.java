public class TV {
    private ChannelFrequencies currentChannelFrequency;

    public TV(ChannelFrequencies cf) {
        currentChannelFrequency = cf;
    }

    public void chUp(){
        ChannelIterator ci = currentChannelFrequency.createIterator();
        ci.next();
    }

    public void chDown() {
        ChannelIterator ci = currentChannelFrequency.createIterator();
        ci.prev();
    }

    public void setCurrentChannelFrequency(ChannelFrequencies cf) {
        currentChannelFrequency = cf;
    }

    public Channel getCurrentChannel() {
        return currentChannelFrequency.getCurrentChannel();
    }
}
