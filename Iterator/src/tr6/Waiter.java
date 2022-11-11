package tr6;

import java.util.Iterator;
import java.util.List;

public class Waiter {

    List<Menu> menus;

    public Waiter(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
//        Iterator<Menu> menuIterator = menus.iterator();
//        while(menuIterator.hasNext()) {
//            Menu menu = menuIterator.next();
//            printMenu(menu.createIterator());
//        }

        for(Menu cafe: menus){
            printMenu(cafe.createIterator());}

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }

//        for (MenuItem item: Menu) {
//            System.out.print(item.getName() + ", ");
//            System.out.print(item.getPrice() + " -- ");
//            System.out.println(item.getDescription());
//        }
    }

}