public class Main {
    public static void main(String[] args) {
        double[] array = {45, 8, 6.6, 4.5, 3, 15.8, 13.4, 14, 18, -6, -2.3, -0.6, 23, 8};
        System.out.println("Le max est: " + ArrayProcessorClass.max.apply(array));
        System.out.println("Le min est: " + ArrayProcessorClass.min.apply(array));
        System.out.println("La somme est: " + ArrayProcessorClass.sum.apply(array));
        System.out.println("La moyenne est: " + ArrayProcessorClass.average.apply(array));
        System.out.println("La valeur 8 apparait " + (int) ArrayProcessorClass.counter(8).apply(array) + " fois");
    }
}