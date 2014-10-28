/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author sendres1
 */
public class ListPractice {
    public static void main(String[] args) {
        //right way  Liskov substitution principle
        List mylist = new ArrayList();
        
        //wrong way  rigid since using ArrayList, and fragile
   //    ArrayList anotherList = new ArrayList();
   //    ArrayList anotherList = new Vector();
        /// try to change           to Vector()  doesn't work;
     
        
        // can only store objects in lists!!!
        mylist.add("hello");
        mylist.add(5);         /// really an object not a primitieve
//        String s2 = mylist.get(0);  //doesn't work because it is a generic object
        String s2 = (String) mylist.get(0); 
        
      //  Integer i = new Integer(5);  this is a wrapper class
                
        //Have to do this
                List <String> mylist2 = new ArrayList();
                mylist2.add("hello");
       //        mylist2.add(5);   
               String s3 = (String) mylist2.get(0); 
                
        
                
    }
    
}
