package imp;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mt
 */
public class process {
    private  String pro_name;
    private double burst_time;
    private double arrival_time;
     private double response_time;
    private double turnaround_time;
     private double waiting_time;
    //preemptive
    // public static ArrayList<Double> alltimes=new ArrayList<Double>();
     // public static ArrayList<String> allnames=new ArrayList<String>();
      // public static ArrayList<Double> allarrivalt=new ArrayList<Double>();
    private ArrayList<Double> start_times = new ArrayList<Double>();
    private ArrayList<Double> end_times = new ArrayList<Double>();
    public process(){
      }
    public void set_pro_name(String time){
        this.pro_name=time;
      }
    public void set_burst_time(double burst){
        this.burst_time=burst;
      }
       public void set_arrival_time(double arrival){
        this.arrival_time=arrival;
      }
    public String get_pro_name(){
        return this.pro_name;
      }
    public double get_burst_time(){
        return this.burst_time;
      }
    public double get_arrival_time(){
        return this.arrival_time;
      }
      public double get_response_time(){
        return this.response_time;
      }
    public double get_turnaround_time(){
        return this.turnaround_time;
      }
    public double get_waiting_time(){
        return this.waiting_time;
      }
    public void addAstartTime(double time){
       start_times.add(time);
      }
     public void addAnendTime(double time){
       end_times.add(time);
      }
     public double getAstartTime(){
       double x=start_times.get(0);
       start_times.remove(0);
       return x;
      }
      public double getAnendTime(){
       double x=end_times.get(0);
       end_times.remove(0);
       return x;
      }
      private double get_lastET(){
          return(end_times.get(end_times.size()-1));
      }
      public double calc_waiting_time(){
          double x=this.getAstartTime();
           double res=x-this.arrival_time;
           double y;
           double result=res;
           while(!this.start_times.isEmpty()){
               x=this.getAstartTime();
               y=this.getAnendTime();
               res=x-y;
               result+=res;
           }
           this.waiting_time=result;
          return this.waiting_time;
      }
       public double calc_turnaround_time(){
          double x=this.get_lastET();
          this.turnaround_time= x-(this.arrival_time);
          return this.turnaround_time;
      }
        public double calc_response_time(){//should be calculated first
            this.response_time=start_times.get(0)-this.arrival_time;
          return this.response_time;
      }
        public double makeAstage(int quantum){
            if(quantum>this.burst_time){
                double x=this.burst_time;
                this.burst_time=0;
                return x;
            }
            else{
            this.burst_time=this.burst_time-quantum;     
                return quantum;
            }
      }
        public boolean if_arrived(double time){
            if(time>=this.arrival_time){
                return true;
            }
            else{
                return false;
            }
        }
        
} 