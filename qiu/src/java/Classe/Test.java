/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

import Model.ConnectBD;
import static Model.ConnectBD.choix;
import Model.Question;
import Model.choix;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmed Yassin
 */
public class Test {
    public static void main(String args[]){
        try {
            String type="Formatif";
            
            ConnectBD.init();
            List<Question> list = new ArrayList<>();
            list=ConnectBD.Question(type);
            List<List<choix>> list2 = new ArrayList<>();
            list2=ConnectBD.choix(list);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i).getEnonce());
                for(int k=0;k<list2.get(i).size();k++){
                    System.out.println(list2.get(i).get(k).getChoix());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
