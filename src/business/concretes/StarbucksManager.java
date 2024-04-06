package business.concretes;

import business.abstracts.StarbucksService;
import entities.CafeShop;
import entities.Starbucks;

public class StarbucksManager extends CafeShopManager implements StarbucksService
{
    private Starbucks starbucks;
    public StarbucksManager(Starbucks starbucks) {
        this.starbucks = starbucks;
    }
    @Override
    public void register(CafeShop cafeShop) {
        if(cafeShop.getPassword().length()<10) {
            System.out.println("Parol zeifdir!");
        }
        else if(!cafeShop.getEmail().contains("@")) {
            System.out.println("Email sehvdir!");
        }
        else if (!starbucks.getNumber().contains("+994")) {
            System.out.println("Nomreni duzgun yazin");
        }
        else {
            System.out.println("Salam, " + cafeShop.getName());

        }
    }

    @Override
    public boolean getParticipantCard(boolean card) {
        if(card==false) {
            System.out.println("Uzvluk karti almalisiniz");
        }
            return true;
    }
}
