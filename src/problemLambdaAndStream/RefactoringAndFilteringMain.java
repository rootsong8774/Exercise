package problemLambdaAndStream;

import java.util.ArrayList;
import java.util.List;
import problemLambdaAndStream.Dish.Type;

public class RefactoringAndFilteringMain {

    public static void main(String[] args) {

        List<String> highCaloricDishes = new ArrayList<>();
        for (Dish dish : Dish.menu) {
            if (dish.getCalories() > 300) {
                highCaloricDishes.add(dish.getName());
            }
        }
        System.out.println(highCaloricDishes);
        System.out.println("========================Q1===============================");

        List<String> highCaloricDishes2 = Dish.menu.stream()
            .filter(dish -> dish.getCalories() > 300).map(Dish::getName).toList();
        System.out.println(highCaloricDishes2);
        System.out.println("========================Q5.1=============================");
        List<Dish> notVegetarianMenu = Dish.menu.stream().filter(dish -> dish.getType()== Type.MEAT)
            .limit(2).toList();
        System.out.println(notVegetarianMenu);
    }
}
