package com.example.umer.activitylifecycle;

public class food {

    private String name;
    private String description;
    private int imageID;

    public food(String name, String description, int imageID){
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }

    public static final food [] foods = {

            new food("Pizza", "Thin crust pizza with extra cheese", R.drawable.pizza),
            new food("Burger", "Veg burger with healthy stuff", R.drawable.burger),
            new food("Sandwich", "Whole wheat sandwich", R.drawable.sandwich)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return this.name;
    }

    public int getImageID() {
        return imageID;
    }
}
