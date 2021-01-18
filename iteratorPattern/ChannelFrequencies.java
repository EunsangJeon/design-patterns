public interface ChannelFrequencies {
    ChannelIterator createIterator();
    void addChannel(Channel ch);
    void removeChannel(Channel ch);
    Channel getCurrentChannel();
}
