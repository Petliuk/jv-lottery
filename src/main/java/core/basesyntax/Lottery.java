package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Colors color = colorSupplier.getRandomColor();
        int number = random.nextInt(101);

        return new Ball(color, number);
    }
}
