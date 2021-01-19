public class TVClient {
    public static void main(String[] args) {
        ChannelFrequencies cf = new FavoriteChannels();
        TV tv = new TV(cf);

        Channel ch1 = new Channel(1, "CNN");
        Channel ch2 = new Channel(2, "ABC");
        Channel ch3 = new Channel(3, "FOX");

        tv.addChannel(ch1);
        tv.addChannel(ch2);
        tv.addChannel(ch3);

        Channel currentChannel = tv.getCurrentChannel();

        System.out.println("ch." + currentChannel.getChNum() + ": " + currentChannel.getChName());

        tv.chUp();
        currentChannel = tv.getCurrentChannel();
        System.out.println("ch." + currentChannel.getChNum() + ": " + currentChannel.getChName());

        tv.chUp();
        currentChannel = tv.getCurrentChannel();
        System.out.println("ch." + currentChannel.getChNum() + ": " + currentChannel.getChName());

        tv.chUp();
        currentChannel = tv.getCurrentChannel();
        System.out.println("ch." + currentChannel.getChNum() + ": " + currentChannel.getChName());

        tv.removeChannel(ch2);
        tv.chDown();
        currentChannel = tv.getCurrentChannel();
        System.out.println("ch." + currentChannel.getChNum() + ": " + currentChannel.getChName());
    }
}
