public class TV implements CanOnOff,CanChangeChannel,CanChangeVolume{
    private boolean isOn;
    private int channel;
    private int volume=1;

    public TV(){
       
        isOn=false;
        
    }

    
    public boolean isOn() {
        return isOn;
    }


    public int getChannel() {
        return channel;
    }
    public int getVolume(){
        return volume;
    }


    public void on(){
        isOn=true;
        channel=1;
    }
    public void off(){
        isOn=false;
    }
    public String setChannel(int channelNo){
        if(isOn){
            if(channelNo>=1&&channelNo<=99){
                channel=channelNo;
                return "ok";

            }
            
            
            
        }return "enter the number between 1 and 99";
    }
    public String channelUp(){
        if(isOn){
            channel++;
            if(channel>99){
                return "the highest number of channel is 99";
            }
        }return "ok";
    }
    public String channelDown(){
        if(isOn){
        channel--;
            if(channel<1){
                return "the smallest number of channel is 1";
            }
        }return "ok";
    }
    public String volumeUp(){
        if(isOn){
            if(volume<10){
                volume++;
                return "done";

            }
        }
        return "the highest volume value is 10";
    }
    public String volumeDown(){
        if(isOn){
            if(volume>1){
                volume--;
                return "done";

            }
        }
        return "the smallest volume value  is 1";
    }

    public String toString(){
        if(isOn==true){
            return String.format("TV is on and the number of channel is %d\nVolume level is %d ",channel,volume);
        }else{
            return "TV is off";
        }
    }
    

    
}
