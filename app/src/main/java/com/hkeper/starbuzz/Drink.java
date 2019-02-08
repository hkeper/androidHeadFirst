package com.hkeper.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourcedId;

    //drinks - массив с элементами Drink
    public static final Drink[] drinks = {
            new Drink("Latte", "Acouple of espresso shots with steamed milk",
                    R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Drink("Filter", "Highrst quality beans roasted and brewed fresh",
                    R.drawable.filter)
    };

    //Для каждого напитка хранится имя, описание и ресурс изображения
    private Drink(String name, String description, int imageResourcedId) {
        this.name = name;
        this.description = description;
        this.imageResourcedId = imageResourcedId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourcedId;
    }

    public String toString() {
        return this.name;
    }

}
