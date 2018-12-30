package imp;


import imp.process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *
 * @author mt 
 */
public class ready_queue {
     public static ArrayList<process> processes = new ArrayList<process>();
     public static ArrayList<process> readyq= new ArrayList<process>();
       public static ArrayList<process> finished_prc= new ArrayList<process>();
       public static ArrayList<String> allnames= new ArrayList<String>();
       public static ArrayList<Double> alltimes= new ArrayList<Double>();
     public static int quantum;
     public boolean enqueue(process p){
         if(processes.add(p)){
         return true;
         }else{
             return false;
         }
     }
     public process dequeue(){
         process x=processes.get(0);
         processes.remove(0);
         return x;
     }
     public boolean add_to_ready(process p){
          if(readyq.add(p)){
              return true;
          }
          else{
              return false;
          }
     }
     public process retrieve_from_ready(){
         process x=readyq.get(0);
         readyq.remove(0);
         return x;
     }
    public void sort(){
     Collections.sort(processes, new MyComp());
     }
}
 
class MyComp implements Comparator<process>{
 
    @Override
    public int compare(process e1, process e2) {
        if(e1.get_arrival_time() > e2.get_arrival_time()){
            return 1;
        }  if(e1.get_arrival_time() < e2.get_arrival_time()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}


