public interface ChannelIterator {
    void next();
    void prev();
    Channel getCurrentChannel();
}
