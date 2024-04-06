package business.concretes;

import business.abstracts.BelgianService;
import business.abstracts.CafeShopService;
import entities.Belgian;
import entities.CafeShop;

public class BelgianManager extends CafeShopManager implements BelgianService {
    private Belgian belgian;
    public BelgianManager(Belgian belgian){
        this.belgian=belgian;
    }

    @Override
    public void register(CafeShop cafeShop) {
        if(cafeShop.getPassword().length()<8  ) {
            System.out.println("Parol zeifdir!");
        }
        else if(cafeShop.getEmail().contains("@")) {
            System.out.println("Email sehvdir!");
        }
        else if (belgian.getFinCode().length()<8) {
            System.out.println("FIN kodu duzgun daxil edin!");
        }
        else {
            System.out.println(cafeShop.getName()+" yeni hesabiniza xos gelmisiniz!");

        }
    }

    @Override
    public boolean checkIfRealPerson(boolean person) {
        if (person==false) {

            System.out.println("Sehvlik yarandi.");
        }
        return true;
    }
}
