/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectBD {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    static Connection connection = null; 
    static Statement statement = null;
    static ResultSet resultSet ;
    static ResultSet resultSet2 ;
    static ResultSetMetaData metaData;
    
public static void init(){
 try{         
             Class.forName("com.mysql.jdbc.Driver");
             connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz-it-up?zeroDateTimeBehavior=convertToNull","root","");
        }catch(Exception e){
             e.printStackTrace();
        }
}
public static ResultSet Authentification(String email,String password) throws SQLException{
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("select * from Utilisateur,apprenant where Email=? and Password=? and Utilisateur.ID=apprenant.IDu");
            ps.setString(1, email);
            ps.setString(2, password);
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ps.executeQuery();
}
public static List<Question> Question(String type) throws SQLException{
        try{
            int i=0;
            
            PreparedStatement ps = connection.prepareStatement("select * from question where Type=?");
            ps.setString(1, type);
            resultSet = ps.executeQuery();
            List<String> id=new ArrayList<>();
            List<Question> list = new ArrayList<>();
            List<choix> list2=new ArrayList<>();
            while(resultSet.next()){
                    Question ligne= new Question(resultSet.getString("question.Enonce"),resultSet.getInt("question.IDQuestion"));
                    list.add(ligne);
            }
            return list;
            
    } catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static List<List<choix>> choix(List<Question> question){
    Question q;
    choix c=null;
    List<List<choix>> list2=new ArrayList<>();
    List<choix> list=new ArrayList<>();
    for(int i=0;i<question.size();i++){
        try {
            
            q=question.get(i);
            PreparedStatement ps2 = connection.prepareStatement("select * from choix where IDQ=?");
            ps2.setString(1, String.valueOf(q.getID()));
            resultSet2=ps2.executeQuery();
            while(resultSet2.next()){
                          c=new choix(resultSet2.getString("choix.Choix"),resultSet2.getInt("choix.Correct"));
                          list.add(c);
                        
                    }
            list2.add(new ArrayList<>(list));
            list = new ArrayList<>();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    return list2;
}

}
