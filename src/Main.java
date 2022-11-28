public class Main {
    public static void main(String[] args) {
        Flowers roze = new Flowers("Роза обыкновенная ","Голандии", 35.59, 0 );
        Flowers chrysanthemum = new Flowers("Хризантема обыкновенная "," ", 15, 5 );
        Flowers peony = new Flowers("Пион "," Англия ", 69.9, 1 );
        Flowers gypsophila = new Flowers("Гипсофила "," Турция ", 19.5, 10 );

        roze.lifeSpan=-2;
        System.out.println(roze);

    }
}