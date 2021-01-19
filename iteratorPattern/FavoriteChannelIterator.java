import java.util.ArrayList;

public class FavoriteChannelIterator implements ChannelIterator {
    private final ArrayList<Channel> channels;
    int channelIndex;

    public FavoriteChannelIterator(ArrayList<Channel> channels) {
        this.channels = channels;
        channelIndex = 0;
    }

    @Override
    public void next() {
        if(channelIndex >= channels.size() - 1) {
            channelIndex = 0;
        } else {
            channelIndex++;
        }
    }

    @Override
    public void prev() {
        if(channelIndex <= 0) {
            channelIndex = channels.size() - 1;
        } else {
            channelIndex--;
        }
    }

    @Override
    public Channel getCurrentChannel(){
        return channels.get(channelIndex);
    }
}
