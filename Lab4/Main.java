import java.io.*;
import java.util.*;

class Employee implements Serializable {

   int id;
   String name;
   static double salary;
   String rank;
   ArrayList<Employee> emp ;

public Employee(int id,String name,double salary,String rank){
        this.id = id;
        this.name = name;
        this.salary= salary;
        this.rank= rank;

}

public void prints(){
     for(Employee emm : emp)
        {
            System.out.println(emm.name);
        }

}




    public static void loadData ( ){ 
      emp  = new ArrayList<>();
      String tokens[] = null; 
      String id, name, salary, rank; 
      try { 
        FileReader fr = new FileReader("EmployeeData - Lab 04.csv"); 
        BufferedReader br = new BufferedReader(fr); 
        String line = br.readLine(); 
        while ( line != null ) { 
        tokens = line.split(","); 
        id = tokens[0]; 
        name = tokens[1]; 
        salary= tokens[2]; 
        rank = tokens[3];
        int id1 = Integer.parseInt(id);
        double sal =Double.parseDouble(salary); 
        Employee e = new Employee(id1,name, sal, rank); 
        emp.add(e); 
        line = br.readLine(); 
} 
 br.close(); 
fr.close(); 
}catch(IOException ioEx){  } 
} 


public void writeInFile()
              {

               try{
               FileOutputStream fileOut = new FileOutputStream("employee.txt");
               ObjectOutputStream out = new ObjectOutputStream(fileOut);

     

               for(Employee em   : emp)
                       {
                          int id = em.id;
                          String name = em.name;
                          double salary = em.salary;
                          String rank = em.rank;
                          Employee e = new Employee(id,name,salary,rank);
                          out.writeObject(e);
                          
                       }
                  }catch(IOException ioe){System.out.println("exception");}
               
              }

public void addObj(int id,String name,double salary,String rank)
                {
                 emp.add(new Employee(id,name,salary,rank));
                 
                }


public void removeObj(int id)
               {

               for(Employee em   : emp)
                       {
                          if(em.id==id){
                               emp.remove(em);
                                  }
                       }
               }


}



public class  Main{

public static void main(String[] args)
              { 
                // Employee e1 = new Employee(10,"ali",50.6,"officer");
                loadData();
                e1.addObj(50,"babar",34.6,"student");
                e1.writeInFile();
                
              }


}