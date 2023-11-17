package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
   static List <String> lista = new ArrayList<>();
    static List<String> lista2 =Arrays.asList("Ala", "ma","zespół");
            public static void  main(String[] args){
                for(int i=1; i<=10 ; i++){
                    lista.add("element" +i);
                    System.out.println(lista);
                }


                for(String l : lista2){
                    System.out.println(l);
                }

            }
}
