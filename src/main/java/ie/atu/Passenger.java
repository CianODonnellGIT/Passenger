package ie.atu;


public class Passenger {

    private int age;
    private String id;
    private String title;
    private String name;
    private String phoneNumber;


    public Passenger(int age, String id, String title, String name, String phoneNumber ){
        setAge(age);
        setId(id);
        setName(name);
        setTitle(title);
        setPhoneNumber(phoneNumber);

    }

    public void setAge(int age){
        if(age >16){
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid age");
        }
    }
    public void setId(String id){
        if(id.length() >=10) {
            this.id = id;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid ID");
        }
    }

    public void setTitle(String title){
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")){
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid title");
        }

    }
    public void setName(String name){
        if(name.length() > 3 ) {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid name");
        }
    }

    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber.length() >7) {
            this.phoneNumber = phoneNumber;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid number");
        }
    }


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


}
