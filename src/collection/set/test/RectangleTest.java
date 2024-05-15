package collection.set.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RectangleTest {
    public static void main(String[] args) {
        Set<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20)); // 중복

        for (Rectangle rectangle : rectangleSet) {
            System.out.println("rectangle = " + rectangle);
        }
    }

    private static class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rectangle rectangle = (Rectangle) o;
            return width == rectangle.width && height == rectangle.height;
        }

        @Override
        public int hashCode() {
            return Objects.hash(width, height);
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }
}
