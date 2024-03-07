import jeongsoek.Abstract;
import jeongsoek.Abstract2;
import jeongsoek.Abstract3;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Abstract[] abs = new Abstract[2];
        abs[0] = new Abstract2();
        abs[1] = new Abstract3();
        for(Abstract ab : abs){
            ab.printDefinition();
        }
    }
}