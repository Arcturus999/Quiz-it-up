/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ahmed Yassin
 */
public class choix {
    private int ID;
    private String choix;
    private int correct;
    private int IDquestion;

    public choix(String choix, int correct) {
        this.choix = choix;
        this.correct = correct;
    }
    public choix(int IDquestion) {
        this.IDquestion= IDquestion;
    }

    
    
    public choix(int ID, String choix, int correct, int IDquestion) {
        this.ID = ID;
        this.choix = choix;
        this.correct = correct;
        this.IDquestion = IDquestion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getIDquestion() {
        return IDquestion;
    }

    public void setIDquestion(int IDquestion) {
        this.IDquestion = IDquestion;
    }
    
}
