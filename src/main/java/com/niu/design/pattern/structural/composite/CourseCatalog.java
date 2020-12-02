package com.niu.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 *
 * @author [nza]
 * @version 1.0 [2020/12/02 14:27]
 * @createTime [2020/12/02 14:27]
 */
public class CourseCatalog extends CatalogComponent {

    private String name;

    private Integer level;

    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(name);
        items.forEach(item -> {
            if (this.level != null) {
                for (int i = 0; i < this.level; i ++) {
                    System.out.print("  ");
                }
            }
            item.print();
        });
    }
}
