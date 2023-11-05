public class TVTest {
    public static void main(String[] args){
        TV tv01 = new TV();

        tv01.tvOn();
        System.out.println("Channel: " + tv01.getChannel() + " and Volume: " + tv01.getVolume());

        tv01.channelNext();
        //tv01.channelPrevious();
        tv01.setVolume(7);
        System.out.println("Channel: " + tv01.getChannel() + " and Volume: " + tv01.getVolume());

        tv01.tvOff();
        System.out.println("Channel: " + tv01.getChannel() + " and Volume: " + tv01.getVolume());
    }
}
