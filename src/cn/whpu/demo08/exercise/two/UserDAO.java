package cn.whpu.demo08.exercise.two;

import java.sql.*;

public class UserDAO {
    static Connection con=null;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (Exception e){}
        String uri="jdbc:mysql://localhost:3306/demo?serverTimezone=GMT%2B8";
        String user="root";
        String password="zqy17607168034.";
        try{
            con= DriverManager.getConnection(uri,user,password);
            System.out.println("成功连上数据库");
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
    public void select(User user){
        try{
            Statement sql=con.createStatement();
            ResultSet rs=sql.executeQuery("SELECT * from user where id="+user.getId());
            System.out.println("查询到user1的信息为：");
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String password=rs.getString(3);
                String emile=rs.getString(4);
                Date birthday=rs.getDate(5);
                System.out.println("id："+id);
                System.out.println("name: "+name);
                System.out.println("password: "+password);
                System.out.println("email: "+emile);
                System.out.println("birthday: "+birthday);
            }
            System.out.println();
            //con.close();
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
    public void insert(User user){
        String sqlStr="insert into user(id,name,password,email,birthday) values("+user.getId()+",'"+user.getName()+"','"+user.getPassword()+"','"+user.getEmail()+"','"+user.getBirthday()+"')";
        try{
            Statement sql1=con.createStatement();
            int ok=sql1.executeUpdate(sqlStr);
            //System.out.println(ok);
            ResultSet rs=sql1.executeQuery("select * from user ");
            System.out.println("插入user4后的user表为：");
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String password=rs.getString(3);
                String emile=rs.getString(4);
                Date birthday=rs.getDate(5);
                System.out.printf("%s\t",id);
                System.out.printf("%s\t",name);
                System.out.printf("%s\t",password);
                System.out.printf("%s\t",emile);
                System.out.printf("%s\n",birthday);
            }
            System.out.println();
        }
        catch (SQLException e){
            System.out.println("记录中id值不能重复"+e);
        }
    }
    public void delete(User user){
        String sqlStr="delete from user where id="+user.getId();
        try{
            Statement sql=con.createStatement();
            int ok=sql.executeUpdate(sqlStr);
            //System.out.println(ok);
            ResultSet rs=sql.executeQuery("select * from user");
            System.out.println("删除user4后的user表为：");
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String password=rs.getString(3);
                String emile=rs.getString(4);
                Date birthday=rs.getDate(5);
                System.out.printf("%s\t",id);
                System.out.printf("%s\t",name);
                System.out.printf("%s\t",password);
                System.out.printf("%s\t",emile);
                System.out.printf("%s\n",birthday);
            }
            System.out.println();
        }
        catch (SQLException e){
            System.out.println("记录中id值不能重复"+e);
        }
    }
    public void update(User user){
        String sqlStr="update user set password='"+user.getPassword()+"' where id="+user.getId();
        try{
            Statement sql1=con.createStatement();
            int ok=sql1.executeUpdate(sqlStr);
            //System.out.println(ok);
            ResultSet rs=sql1.executeQuery("select * from user");
            System.out.println("修改user1密码后的user表为：");
            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String password=rs.getString(3);
                String emile=rs.getString(4);
                Date birthday=rs.getDate(5);
                System.out.printf("%s\t",id);
                System.out.printf("%s\t",name);
                System.out.printf("%s\t",password);
                System.out.printf("%s\t",emile);
                System.out.printf("%s\n",birthday);
            }
            System.out.println();
        }
        catch (SQLException e){
            System.out.println("记录中id值不能重复"+e);
        }
    }
}
