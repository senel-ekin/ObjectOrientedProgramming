public class TV {
    private int channel;
    private int volume;
    private boolean onOff;

    public TV(){
        channel = 1;
        volume = 1;
        onOff = false;
    }

    public void tvOn(){
        onOff = true;
    }

    public void tvOff(){
        onOff = false;
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

    public void channelNext(){
        channel = channel + 1;
    }

    public void channelPrevious(){
        channel = channel - 1; //Also you can write channel--;
    }

    public void VolumeIncrease(){
        volume = volume + 1;
    }

    public void VolumeDecrease(){
        volume = volume - 1;
    }

    public int getChannel(){
        return channel;
    }

    public int getVolume(){
        return volume;
    }
}