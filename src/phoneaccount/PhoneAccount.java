/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phoneaccount;

/**
 *
 * @author Thulani
 */
public class PhoneAccount {
String name;
int numOfmsgs;
double min;
    public PhoneAccount(){
      name="";
      numOfmsgs=0;
      min=0.0;
    }
    public PhoneAccount(String n,int msg,double x){
     name=n;
     numOfmsgs=msg;
     min=x;
    }
    public void setName(String n){
        name=n;
    }
    public void setMsgs(int msg){
        numOfmsgs=msg;
    }
    public void setMin(double x){
        min=x;
    }
    public String getName(){
        return name;
    }
    public int getMsgs(){
        return numOfmsgs;
    }
    public double getMin(){
        return min;
    }
    
    public double amountOwed(){
        double tot;
        tot = (numOfmsgs*0.90)+(min*2.4);
        return tot;
    }
}
