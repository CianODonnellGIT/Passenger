package ie.atu;

import java.util.Scanner;

public class Passenger {

    private int age;
    private String id;
    private String title;
    private String name;
    private String phoneNumber;

    public int getAge(){
        return age;
    }
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAge(int validAge){
        if(age >16){
            this.age = validAge;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid age");
        }
    }
    public void setId(String validId){
        if(id.length() >10) {
            this.id = validId;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid age");
        }
    }

    public void setTitle(String validTitle){
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")){
            this.title = validTitle;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid title");
        }

    }
    public void setName(String validName){
        if(name.length() > 3 ) {
            this.name = validName;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid name");
        }
    }

    public void setPhoneNumber(String validPhoneNumber){
        if(phoneNumber.length() >7) {
            this.phoneNumber = validPhoneNumber;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid number");
        }
    }

    public Passenger(int validAge){

        if(age >16){
            age = validAge;
            System.out.println("Valid age");
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid age");
        }

    }

}
