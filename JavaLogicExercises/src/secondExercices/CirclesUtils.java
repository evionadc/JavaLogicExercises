package secondExercices;

import java.util.Comparator;

public class CirclesUtils implements Comparator<Circles> {

    @Override
    public int compare(Circles circle01, Circles circle02) {
        return Double.compare(circle01.getArea(), circle02.getArea());
    }
}