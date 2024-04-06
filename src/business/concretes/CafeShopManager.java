package business.concretes;

import business.abstracts.CafeShopService;
import entities.CafeShop;

public abstract class CafeShopManager implements CafeShopService {
    @Override
    public void logIn(CafeShop cafeShop) {
        System.out.println("Istifadeci adini girin: "+cafeShop.getUsername());
        System.out.println("Istifadeci parolunu girin: "+cafeShop.getPassword());
    }

    @Override
    public void logOut(CafeShop cafeShop,boolean sure) {
        if(sure==true) {
            System.out.println(cafeShop.getName() + " siz hesabdan cixis etdiniz");
        } else {
            System.out.println("Emeliyyat ugursuz oldu");
        }
    }

    @Override
    public  abstract void register(CafeShop cafeShop) ;


}
