/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;



/**
 *
 * @author sendres1
 */
public class Startup {
     public static void main(String[] args) {
        Team team = new Team();
        Player p1 = new Player();
        
        team.addSubscriber(p1);
        team.setTeamColor("Blue");
    }
}
