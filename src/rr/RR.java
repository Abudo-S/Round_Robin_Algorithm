 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rr;

/**
 *
 * @author mt
 */
import Frames.ALDA;
import imp.process;
import imp.ready_queue;

public class RR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            ALDA ald = new ALDA();
            ald.setVisible(true);
  /*---  ready_queue rq=new ready_queue();
              process p1=new process();
               process p2=new process();
                process p3=new process();
                 process p4=new process();
                  process p5=new process(); 
                  p1.set_pro_name("p1");
                  p2.set_pro_name("p2");
                  p3.set_pro_name("p3");
                  p4.set_pro_name("p4");
                  p5.set_pro_name("p5");
                  p1.set_burst_time(12);
                   p2.set_burst_time(8);
                    p3.set_burst_time(4);
                     p4.set_burst_time(10);
                      p5.set_burst_time(5);
                      ready_queue.quantum=5;
                      ready_queue.processes.add(p1);
                      ready_queue.processes.add(p2);
                      ready_queue.processes.add(p3);
                      ready_queue.processes.add(p4);
                      ready_queue.processes.add(p5);
                     process x;
                     rq.sort();
                  
                      x=rq.dequeue();

                        rq.add_to_ready(x);
                        double time=x.get_arrival_time();
                         int quantum=ready_queue.quantum;
                         int c=0;
                         int size=ready_queue.processes.size();
                        
                        while(c<=size){                          
                         x=rq.retrieve_from_ready();
                         x.addAstartTime(time);
                         //time+=x.makeAstage(quantum);
                       // System.out.println(x.get_pro_name()+" "+x.makeAstage(quantum));
                         x.addAnendTime(time);
                         for(int i=0;i<ready_queue.processes.size();i++){
                            
                             if(ready_queue.processes.get(i).if_arrived(time)){        
                                 rq.add_to_ready(ready_queue.processes.get(i));
                                   System.out.println(ready_queue.processes.get(i).get_pro_name());
                                 ready_queue.processes.remove(i);
                             }
                         } 
                         if(x.get_burst_time()>0){
                           rq.add_to_ready(x);
                         }
                          if(x.get_burst_time()==0){
                              ready_queue.finished_prc.add(x);
                            c++;
                        }
                        }--------*/
                       // System.out.println(ready_queue.finished_prc.get(1).get_pro_name());
                  /*p1.addAstartTime(0);
                  p1.addAnendTime(5);
                  p2.addAstartTime(5);
                  p2.addAnendTime(10);
                  p3.addAstartTime(10);
                  p3.addAnendTime(14);
                  p4.addAstartTime(14);
                  p4.addAnendTime(19);
                  p5.addAstartTime(19);
                  p5.addAnendTime(24);
                  p1.addAstartTime(24);
                  p1.addAnendTime(29);
                  p2.addAstartTime(29);
                  p2.addAnendTime(32);
                  p4.addAstartTime(32);
                  p4.addAnendTime(37);
                  p1.addAstartTime(37);
                  p1.addAnendTime(39);*/
                  
                 // System.out.println(p5.calc_waiting_time());
            /* process.alltimes.add(0.0);
          process.alltimes.add(3.0);
            process.alltimes.add(5.0);
               process.alltimes.add(8.0);
                process.alltimes.add(11.0);
                   process.alltimes.add(14.0);
                    process.alltimes.add(17.0);
                      process.alltimes.add(18.0);
                       process.allnames.add("p1");
                         process.allnames.add("p1");
                          process.allnames.add("p2");
                           process.allnames.add("p3");
                            process.allnames.add("p2");
                             process.allnames.add("p3");
                              process.allnames.add("p3");
                              for(int i=0;i<process.allnames.size();i++){
                                  
                                  if(!process.allnames.get(i).equals("Done")){       
                                      System.out.println(process.allnames.get(i));
                                  process x=new process();
                                  x.set_pro_name(process.allnames.get(i));
                                   for(int j=i;j<process.allnames.size();j++){
                                       if(x.get_pro_name().equals(process.allnames.get(j))){
                                           x.addAstartTime(process.alltimes.get(j));
                                           x.addAnendTime(process.alltimes.get(j+1));
                                           process.allnames.set(j,"Done");
                                          
                                   }
                                   }
                                    ready_queue.finished_prc.add(x);
                                     
                                  }  
                              }*/
 /* process p1=new process();
             p1.set_arrival_time(1);
             process p2=new process();
             p2.set_arrival_time(7);
             process p3=new process();
             p3.set_arrival_time(5);
              process p4=new process();
             p4.set_arrival_time(8);
             ready_queue rq=new ready_queue();
            rq.enqueue(p1);
            rq.enqueue(p2);
            rq.enqueue(p3);
              rq.enqueue(p4);
             rq.sort();
            process x=rq.dequeue();
            System.out.println(x.get_arrival_time());
             x=rq.dequeue();
            System.out.println(x.get_arrival_time());
            x=rq.dequeue();
            System.out.println(x.get_arrival_time());
            x=rq.dequeue();
            System.out.println(x.get_arrival_time());
            
                     /*     process proc1 = new process();
                            proc1.set_burst_time(7);
                            proc1.addAstartTime(6);
                             proc1.addAstartTime(14);
                               proc1.addAnendTime(9);
                                proc1.addAnendTime(17);
                                proc1.addAstartTime(17);
                                proc1.addAnendTime(18);
                                proc1.set_arrival_time(2);
                              double rem=proc1.makeAstage(3);
                               
                              process proc2 = new process();
                            proc2.set_burst_time(5);
                            proc2.addAstartTime(0);
                             proc2.addAstartTime(9);
                               proc2.addAnendTime(3);
                                proc2.addAnendTime(11);             
                                
                              ready_queue que=new ready_queue();
                              que.enqueue(proc1);
                               System.out.println(que.get_size());
                              que.enqueue(proc2);
                                 System.out.println(que.get_size());
                             process proc=que.dequeue();
                             process pro=que.dequeue();
          // double re=proc.calc_response_time();
         
    // System.out.println(proc.calc_turnaround_time()+"\n"+pro.calc_turnaround_time());*/
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
