package car.domain;

public class Car {

    private static final int DEFAULT_POSITION = 0;
    private static final int MAX_NAME_LENGTH = 5;
    private String name;
    private int position;

    public Car(final String name) {
        this(name, DEFAULT_POSITION);
        carAvailableCheck();
    }

    public Car(final String name, final int position) {
        this.name = name;
        this.position = position;
        carAvailableCheck();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void carAvailableCheck() {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름초과");
        }

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }
}