import java.util.ArrayList;

public class FavoriteChannels implements ChannelFrequencies {
    private ArrayList<Channel> channels;

    public FavoriteChannels() {
        channels = new ArrayList<Channel>();
    }

    @Override
    public FavoriteChannelIterator createIterator() {
        return new FavoriteChannelIterator(channels);
    }

    @Override
    public void addChannel(Channel ch) {
        channels.add(ch);
    }

    @Override
    public void removeChannel(Channel ch) {
        channels.remove(ch);
    }
}
