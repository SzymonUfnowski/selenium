package sprawdzian;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    public static void main(String[]args){
        Tool tool = new Tool("Śrubokręt");
        tool.useTool();
        List<Tool> narzedzia = new ArrayList<>();
        narzedzia.add(new Tool("Młotek"));
        narzedzia.add(new Tool("Wiertarka"));
        narzedzia.add(new Tool("Łom"));
        narzedzia.add(new Tool("Klucz francuski"));
        narzedzia.add(new Tool("Kombinerki"));
        narzedzia.add(new Tool("Nożyce"));
        narzedzia.add(new Tool("Obcęgi"));

    for(Tool t:narzedzia){
       t.useTool();
    }
    }

}
