// import java.util.*;

// class duplicateCustomerException extends Exception {

//   public String toString()
//           {
//            return "This Customer already exists";

//            }


// }


// class invalidAgeException extends Exception{


// public String toString()
//        {

//           return "Your age is not valid to open a bank account";

//         }

// }


// class lowBalanceException extends Exception{


// public String toString()
//        {

//           return "Your balance is less than 0";

//         }

// }

// class invalidCustomerIDException  extends Exception{

// public String toString()
//        {

//           return "This customer's account does not exists in this bank";

//         }
// }


// class Customers{
//     public String name;  //a string representing the name of the customer. 
//     public String  id;      //a string representing the ID of the customer. 
//     public int  age;      // an integer value indicating the age of the customer. 
//     public  double  balance;   // a double value indicating the amount saved by the customer.

//      public Customers(String name, String  id,int  age, double  balance)
//            {
//                this.name=name;
//                this.id=id;
//                this.age=age;
//                this.balance=balance;
//            } 
// }

//  class Bank{


//        ArrayList<Customers> cust = new ArrayList<Customers>();
       
       
//        public void  addCustomer(String name, String  id,int  age, double  balance)
//          {
//              if(balance<=0)
//              {
//                 throw new lowBalanceException();
//              }
//              if(age < 18 || age > 65 )
//             {
//                 throw new invalidAgeException();
//             }
//              for(int i=0;i<cust.size();++i)
//                   {
//                      if((id.equals(cust[i]).id))
//                        {
//                        throw new  duplicateCustomerException();
//                        }
//                   }
//             // Customers cr = new Customers(name,id,age, balance);
//              cust.add(new Customers(name,id,age, balance));
             
//          }

//        public void searchCustomer(String id)
//          {
//             int c=0;
//             int x=Integer.parseInt(id);
//             for(int i=0;i<cust.size();++i)
//                   {
//                     if((id.equals(cust[i]).id))
//                        {
//                        c=x;
//                        System.out.println("Customer Found");
//                        System.out.println("Customer's name "+ cust[i].name);
//                          System.out.println("Customer's ID "+ cust[i].id);
//                            System.out.println("Customer's age "+ cust[i].age);
//                              System.out.println("Customer's balance "+ cust[i].balance);
//                        break;
//                        }
//                   }
//            if(c!=x)
//               {
//               throw new  invalidCustomerIDException();
//                }
//          }
//    }

// public class FirstAttempt
//    {
//    public static void main(String[] args)
//    {
//    Bank b = new Bank();
//    b.addCustomer("Ali","655",34,89);
//    }
  

// }

