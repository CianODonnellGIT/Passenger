package ie.atu;


public class Passenger {

    public int getAge(int validAge){
        int age = validAge;
        if(age >16){
            age = validAge;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid age");
        }
        return age;
    }
    public String getId(String validId){
        String id = validId;
        if(id.length() >=10) {
            id = validId;
        }
        else {
            throw new IllegalArgumentException("This is not a valid ID");
        }
        return id;
    }

    public String getTitle(String validTitle){
        String title = validTitle;
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")){
            title = validTitle;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid title");
        }
        return title;
    }
    public String getName(String validName){
        String name = validName;
        if(name.length() > 3 ) {
            name = validName;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid name");
        }
        return name;
    }

    public String getPhoneNumber(String validPhoneNumber){
        String phoneNumber = validPhoneNumber;
        if(phoneNumber.length() >7) {
            phoneNumber = validPhoneNumber;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid number");
        }
        return  phoneNumber;
    }

}
