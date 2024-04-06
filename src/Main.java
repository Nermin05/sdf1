import business.concretes.BelgianManager;
import business.concretes.StarbucksManager;
import entities.Belgian;
import entities.CafeShop;
import entities.Starbucks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer=new BufferedWriter(new FileWriter("Sdf1.txt"));
        Starbucks starbucks=new Starbucks(1,"Nermin","Memmedli","1723123712","mememmedlinermin@gmail.com","mnermin","40281989");
        StarbucksManager starbucksManager=new StarbucksManager(starbucks);
        starbucksManager.register(starbucks);
        starbucksManager.getParticipantCard(false);
        Belgian belgian=new Belgian(2,"Salam","Aleykum","llehdhsdd","138237938","sjwiewi@jjppe","745217gs7t");
        BelgianManager belgianManager=new BelgianManager(belgian);
        belgianManager.register(belgian);
        belgianManager.checkIfRealPerson(false);
        writer.write(starbucks.getID()+")"+starbucks.getName() +" "+starbucks.getSurname());
        writer.write("\n"+ belgian.getID()+")"+belgian.getName()+" "+belgian.getSurname());
        writer.close();

    }
}