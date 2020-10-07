package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastname;
    private String password;
    private final int defaultPasswordlength=10;
    private String department;
    private int  capacityOfMailBox=500;
    private String email;
    private String alternateEmail;
    private String companySuffix ="lazynerds.com";

    public Email(String firstName, String lastname){
        this.firstName=firstName;
        this.lastname=lastname;

        this.department=setDepartment();

        this.password=randomPassword(defaultPasswordlength);

        email=firstName.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+ "."+companySuffix;


    }


    private String setDepartment(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Department Code:: \n1.Sales\n2.Development\n" +
                "3.Accounting\n4.None\n");
        int departmentNumber=in.nextInt();
        String dept="None";
        if(departmentNumber == 1){ dept= "Sales";}
        else if(departmentNumber==2){dept= "Development";}
        else if(departmentNumber==3){dept= "Accounting";}

        return dept;
    }

    private String randomPassword(int length){
        String passwordSet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@&$%#";

        char[] password=new char[length];
        for (int i=0;i<length;i++){
            int random=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(random);
        }

        return new String(password);
    }

    public void setCapacityOfMailBox(int cap){this.capacityOfMailBox=cap;}

    public void  setAlternateEmail(String altE){ this.alternateEmail=altE;}

    public void changePassword(String password){
        System.out.println("Enter Password to Verify it's You::");
        Scanner in=new Scanner(System.in);
        String pass=in.nextLine();
        if(pass==this.password)
            this.password=password;
        else{
            System.out.println("Wrong PassWord,Can't Change It.");
            return;
        }
    }

    public int getCapacityOfMailBox(){return capacityOfMailBox;}

    public String getAlternateEmail(){return alternateEmail;}

    public String showInfo(){
        return "DISPLAY NAME::" +firstName+" "+lastname+"\nCOMPANY EMAIL:: "+email+" \n ";
    }

}
