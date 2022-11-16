/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thediscountsystem;

import java.util.Scanner;

/**
 *
 * @author mohan
 */
enum CustomerType{PREMIM,GOLD,SILVER;}

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
    
    public Customer (String name, String memberType){
        this.name=name;
        setMemberType(memberType);
    }
    
    public boolean isMember(){
        
    }
    
    public void setMember(boolean member){
        this.member=member;
    }
    
    public String getMemberType() {
    return memberType;
    }
    
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", member=" + member + ", memberType=" + memberType + '}';
    }
    
    
    
}
