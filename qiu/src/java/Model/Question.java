/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmed Yassin
 */
public class Question {
   private String enonce;
   private int ID;
   private String type;
   private int IDchoix;
   List<choix> list2=new ArrayList<>();
   choix choix=new choix(ID);

    public Question(String enonce,int ID) {
        this.enonce=enonce;
        this.ID=ID;
    }

    public Question(String enonce, int ID, String type, int IDchoix) {
        this.enonce = enonce;
        this.ID = ID;
        this.type = type;
        this.IDchoix = IDchoix;
    }

    public List<choix> getList2() {
        return list2;
    }

    public void setList2(List<choix> list2) {
        this.list2 = list2;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIDchoix() {
        return IDchoix;
    }

    public void setIDchoix(int IDchoix) {
        this.IDchoix = IDchoix;
    }
    
    
   
   
    
}
