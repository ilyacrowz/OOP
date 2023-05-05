package Task005;

import java.util.ArrayList;

public class Adressbook {
    ArrayList<Phonebook> pb=new ArrayList();
    
    public void Adressbook(){
        pb.add(new Phonebook("Гусев Андрей Александрович","+7905999999","Липецк"));        
        pb.add(new Phonebook("Кирилов Александр Сергеевич","+790488888","Москва"));        
    }

    public void showAddressBook(ArrayList<Phonebook> phnbook){
        for(Phonebook i:phnbook){
                    System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
                }
    }
}