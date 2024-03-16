package structural.composite;

import structural.composite.model.MenuList;

/*
* Pattern Composite lets compose objects in tree and work with
* it like one component
*/
public class Main {

    public static void main(String[] args) {
        MenuList menu = new MenuList(CompositeUtil.getFaker().funnyName().name());

        menu.add(CompositeUtil.getFoods());
        menu.add(CompositeUtil.getBeerMenu());
        menu.add(CompositeUtil.getDesserts());

        System.out.print(menu.info());
    }
}
