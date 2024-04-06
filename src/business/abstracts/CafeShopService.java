package business.abstracts;

import entities.CafeShop;

public interface CafeShopService {
    public void logIn(CafeShop cafeShop);
    public void logOut(CafeShop cafeShop,boolean sure);
    public void register(CafeShop cafeShop);
}
