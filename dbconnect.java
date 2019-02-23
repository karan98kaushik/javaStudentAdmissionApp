
package db_files;

import java.sql.*;
import javax.swing.JOptionPane;

public class dbconnect {
    static public Connection c;
    static public Statement st;
    static public PreparedStatement insertstudentspersonal, insertstudentsacademic, getStudents, inserttenth, 
            inserttwelfth, updatestudent, gettenth, gettwelfth, updatetenth, updatetwelfth, showtenth, showtwelfth;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_registration","root","root");
            st = c.createStatement();
            insertstudentspersonal = c.prepareStatement("insert into student_personal_db (program_name,stream,"
                    + "student_name,gender,dob,address,email,contact) values (?,?,?,?,?,?,?,?)");
            getStudents = c.prepareStatement("select * from student_personal_db where student_name like ?");
            inserttenth = c.prepareStatement("insert into tenth_info (student_name,roll_no,year_of_passing,"
                    + "total_marks,perc,board) values (?,?,?,?,?,?)");
            inserttwelfth = c.prepareStatement("insert into twelfth_info (student_name,roll_no,year_of_passing,"
                    + "total_marks,perc,board) values (?,?,?,?,?,?)");
            updatestudent = c.prepareStatement("update student_personal_db set program_name=?, stream=?,"
                    + "student_name=?, gender=?, dob=?, address=?, email=?, contact=? where sid=?");
            gettenth = c.prepareStatement("select * from tenth_info where student_name like ?");
            gettwelfth = c.prepareStatement("select * from twelfth_info where student_name like ?");
            updatetenth = c.prepareStatement("update tenth_info set student_name=?, roll_no=?, "
                    + "year_of_passing=?, total_marks=?, perc=?, board=? where sid=?");
            updatetwelfth = c.prepareStatement("update twelfth_info set student_name=?, "
                    + "roll_no=?, year_of_passing=?, total_marks=?, perc=?, board=? where sid=?");
            showtenth = c.prepareStatement("select * from tenth_info where sid=?");
            showtwelfth = c.prepareStatement("select * from twelfth_info where sid=?");
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
            
        }
    }
    
}
