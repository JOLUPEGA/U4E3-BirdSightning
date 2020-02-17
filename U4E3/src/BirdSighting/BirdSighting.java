
package BirdSighting;

public class BirdSighting {

    private Integer sightDays;
    private final String birdsName;
    
    public BirdSighting(){
        this.birdsName = "robin";
        this.sightDays = 0;
    }     
    
    public BirdSighting(String birdsName, Integer sightDays){
        this.birdsName = birdsName;
        this.sightDays = sightDays;
    }
    
    public void setBirdsName(String birdsName){
        this.birdsName = birdsName;
    }
    
    public void setSightDays(Integer sightDays){
        this.sightDays = sightDays;
    }
    public String getBirdsName(){
        return this.birdsName;
    }
    public Integer getSightDays(){
        return this.sightDays;
    }

}
