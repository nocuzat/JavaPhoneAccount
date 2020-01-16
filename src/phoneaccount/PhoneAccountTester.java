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
public class PhoneAccountTester {
    public static void main(String[]args){
        PhoneAccount obj = new PhoneAccount();
        System.out.println(obj);
        obj.setName("thulani");
        obj.setMsgs(12);
        obj.setMin(17.5);
        System.out.println("Name="+obj.getName());
        System.out.println("total="+obj.amountOwed());
    }
}
