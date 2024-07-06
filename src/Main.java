import strategies.SmoothWritingStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BallPen ballPen = PenFactory
                .createBallPen()
                .setBrand("sanjay")
                .setPrice(100)
                .setRefillable(true)
                .setWriteStrategy(new SmoothWritingStrategy())
                .build();
        System.out.println(ballPen);

    }
}