package com.niu.design.pattern.structural.composite;

/**
 * 组合模式
 *
 * @version 1.0 [2020/12/02 14:33]
 * @author [nza]
 * @createTime [2020/12/02 14:33]
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linux = new Course("Linux课程", 11);

        CatalogComponent windows = new Course("Windows课程", 11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java 课程目录", 2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("设计模式", 77);
        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent mainCatalog = new CourseCatalog("课程主目录", 1);
        mainCatalog.add(linux);
        mainCatalog.add(windows);
        mainCatalog.add(javaCourseCatalog);

        mainCatalog.print();
    }
}
