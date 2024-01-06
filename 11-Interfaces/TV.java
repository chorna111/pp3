import java.util.ArrayList;
import java.lang.String;
public class TV implements CanOnOff,CanChangeChannel,CanChangeVolume{
    private boolean isOn;
    private int channel;
    private int volume=1;
    public  String[] listOfStations;
    

    public TV(){
       
        isOn=false;
        listOfStations=new String[99];
        listOfStations[0]="HorizonTV";
        listOfStations[1]="MetroVision";
        listOfStations[2]="TVN";
        listOfStations[3]="TVP";
        listOfStations[4]="Stellar";
        listOfStations[5]="Unity";
        listOfStations[6]="5 channel";
        listOfStations[7]="TET";
        listOfStations[8]="Global";
        listOfStations[9]="Nebula TV";
        
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
        volume=1;
    }
    public void off(){
        isOn=false;
    }
    public String setChannel(int channelNo){
        if(isOn){
            if(channelNo>=1&&channelNo<=99){
                channel=channelNo;
                return "ok";

            }else{
                return "Enter a number between 1 and 99";
            }
            
            
        }else{
            return  "You can't set a  channel if TV is off";
    }}
    public String channelUp(){
        if(isOn){
            channel++;
            if(channel>99){
                return "the highest number of channel is 99";
            }else{
                return "done";}
        }else{
            return  "You can't change channel if TV is off";}
    }
    public String channelDown(){
        if(isOn){
        channel--;
            if(channel<1){
                return "the smallest number of channel is 1";
            }return "done";
        }return  "You can't change channel if TV is off";
    }
    
    public String volumeUp(){
        if(isOn){
            if(volume<10){
                volume++;
                return "done";

            }else{
                return "The volume is already set to maksimum";
            }
        }
        return  "You can't change volume if TV is off";
    }
    public String volumeDown(){
        if(isOn){
            if(volume>1){
                volume--;
                return "done";

            }else{
                return "The volume is already set to minimum";
            }
        }else{
            return  "You can't change volume if TV is off";
        }
      
    }
    public String setVolume(int vol){
        if(isOn){
            if(vol>=1&&vol<=10){
                volume=vol;
                return "done";

            }else{
                return "Enter a number between 1 and 10";
            }
            

        }else{
            return "You can't set volume if TV is off";
        }
    }
    public String displayListOfStations(){
        
        ArrayList<String> l=new ArrayList<String>();
        
        for(int i=0;i<listOfStations.length;i++){
            if(listOfStations[i]==null){
                l.add(String.format("Channel %d: %s",i+1,"name not defined"));

            }else{
                l.add(String.format("Channel %d: %s",i+1,listOfStations[i]));
            }
        }
        
        return String.join("\n",l);
    }

    public String toString(){
        if(isOn==true){
            if(listOfStations[channel-1]!=null){
                return String.format("TV is on and the number of channel is  %d and the channel name is %s\nVolume level is %d ",channel,listOfStations[channel-1],volume);
            }else{
                return String.format("TV is on and the number of channel is  %d and the channel name is not defined\nVolume level is %d ",channel,volume);
            }
        }else{
            return "TV is off";
        }
    }
}
    

    

