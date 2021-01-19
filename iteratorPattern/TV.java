public class TV {
    private ChannelFrequencies currentChannelFrequency;
    private ChannelIterator ci;

    public TV(ChannelFrequencies cf) {
        currentChannelFrequency = cf;
        ci = currentChannelFrequency.createIterator();
    }

    public void chUp(){
        ci.next();
    }

    public void chDown() {
        ci.prev();
    }

    public void setCurrentChannelFrequency(ChannelFrequencies cf) {
        currentChannelFrequency = cf;
    }

    public Channel getCurrentChannel() {
        return ci.getCurrentChannel();
    }

    void addChannel(Channel ch) {
        currentChannelFrequency.addChannel(ch);
    };
    void removeChannel(Channel ch) {
        currentChannelFrequency.removeChannel(ch);
    };
}
