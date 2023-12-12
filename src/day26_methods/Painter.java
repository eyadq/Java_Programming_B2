package day26_methods;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw();
        Picture.draw("blue");
        Picture.draw(6);
        Picture.draw("blue", "red");
        Picture.draw("blue", 7);
        Picture.draw(7, "blue");
        Picture.test(6.5);
        Picture.test(6);

    }
}
