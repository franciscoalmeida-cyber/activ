public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
public static int expectedMinutesInOven(){

return 40;
    
}
    // TODO: define the 'remainingMinutesInOven()' method
public static int remainingMinutesInOven(int minINoven){

return 40 - minINoven;
    
}
    // TODO: define the 'preparationTimeInMinutes()' method
public static int preparationTimeInMinutes(int layer){

    return layer * 2;
    
}
    // TODO: define the 'totalTimeInMinutes()' method

public static int totalTimeInMinutes(int layer,int minINoven ){

return preparationTimeInMinutes(layer) + minINoven;
    
}
    
}
