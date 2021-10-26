package ejercicio_5;

public class Item {
    int data;    
    int priority;
    
public Item (int val, int prio) {
   data = val;    
   priority=prio;
  } 

public void setItemData (int val) {
   data = val; 
  }   
public int getItemData () {
   return data;
  }
public void setPriority (int prio) {
   priority = prio; 
  } 
public int getPriority () {
   return priority;
  }   
}  
