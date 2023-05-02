package pk;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GameDice {
    


    //Initialize 8 dice 
    Dice[] gameDice = {
        new Dice(),  new Dice(),  new Dice(),  new Dice(),  new Dice(),  new Dice(),  new Dice(),  new Dice()
    }; 



    public void roll(){

        for(Dice dice: gameDice){
            dice.roll(); 
        }

    }


    public List<Face> getFaces(){

        ArrayList<Face> faces = new ArrayList<Face>(); 

        for(Dice dice : gameDice){
            faces.add(dice.getCurrentFace()); 
        }

        return faces; 

    }



}
