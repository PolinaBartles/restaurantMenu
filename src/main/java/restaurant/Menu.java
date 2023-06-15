package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;


    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public void addItemToMenu(MenuItem menuItem) {
        menuItems.add(menuItem);
        lastUpdated = new Date(); // Update the last updated date
    }

    public void removeItemFromMenu(MenuItem menuItem) {
        menuItems.remove(menuItem);
        lastUpdated = new Date(); // Update the last updated date
    }

    public void printItems(ArrayList menu) {
        //print them all, or just one
    }

    public void printMenu() {
    }
}
