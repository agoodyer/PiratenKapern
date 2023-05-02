package pk;

import java.util.Random;

public class Dice {



    Face currentFace = Face.SKULL; 
    boolean locked = false; 



    public void roll(){
        
        if(locked) return; 

        int howManyFaces = Face.values().length; 
        Random r = new Random(); 
        this.currentFace = Face.values()[r.nextInt(howManyFaces)]; //update the currently rolled dice face
       
    }


    public Face getCurrentFace(){
        return this.currentFace; 
    }


    public void lock(){
        this.locked = true; 
    }

    public void unlock(){
        this.locked = false; 
    }
    
}
