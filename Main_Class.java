public class Main_Class {
    public static void main(String[] args){
        By_Reference_Variable obj = new By_Reference_Variable();
        obj.display();
        By_Constructor Con = new By_Constructor(4,5);
        Con.ShowDetails();
        By_Method method = new By_Method();
        System.out.println("Id : "+method.id+"\n"+"Name : "+method.name+"\n"+"Lastname : "+method.lastname);
    }
    
    
}
