import java.sql.*;


class AddressBook {

String name;
String address;
String city;
String phone;
Statement st;
Connection con ;

//start of constructor
public AddressBook() throws Exception
{

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost/addressbook";
        con =  DriverManager.getConnection(url, "root","root");
        st = con.createStatement();
        //con.close();

}
//end of constructor


//f1
void addPerson(String name,String address,String city,String phon)throws Exception{
        String q = "Insert into t1(name,address,city,phone) values('"+name+"','"+address+"','"+city+"','"+phon+"');";
        st.executeUpdate(q);

}
//end of f1


//start of f2.
void searchPerson(String name1)throws Exception
{
   String q1 = "Select * from t1 where name = '"+name1+"'; ";
   ResultSet s = st.executeQuery(q1);
   if(s.next()){
    System.out.println("Record found");
    System.out.println(s.getString(1));
    System.out.println(s.getString(2));
    System.out.println(s.getString(3));
    System.out.println(s.getString(4));
   }
   else
   {
    System.out.println("Record not found");
   }
}
//end of f2.

//start of f3.

void delPerson(String name)throws Exception{
   String q = "Select * from t1 where name ='"+name+"';";
   ResultSet s = st.executeQuery(q);
   if(s.next())
   {
    String q2 = "delete from t1 where name = '"+name+"';";
    st.executeUpdate(q2);
    System.out.println("Record deleted");  
   }
   else
   {
    System.out.println("Record not found");
   }   
    
}
//end of f3.


void close1()throws Exception{
  con.close();
  System.out.println("Connection closed");
}

}





class Lab4{
public static void main(String[] s) throws Exception{
   AddressBook ab = new AddressBook();
   //ab.addPerson("ali","lhr","lhr","76352");
    //ab.searchPerson("aliii");
   ab.delPerson("ali");
    ab.close1();
}

}