/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sendres1
 * 
 * publisher Team with list of subscribers
 */
public class Team {
    private String teamColor;
    private List<TeamColorChangeSubscriber> subscribers;

    public Team() {
        subscribers = new ArrayList<>();
    }
    
    
    public void addSubscriber(TeamColorChangeSubscriber s){
        subscribers.add(s);   
    }
    
    
    
    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
        // event is setting changeing of team color
        notifySubscribers();
    }
    
       
    public void notifySubscribers(){
        //for each of these object in this object list loop thru
        for(TeamColorChangeSubscriber obj : subscribers) {
            obj.processColorChange();
        
        }
    }
}
