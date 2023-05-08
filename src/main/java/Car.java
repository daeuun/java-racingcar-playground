import java.util.*;

public class Car {
    private final List<String> carNames;

    /**
     * @param carNames 자동차 이름
     */
    public Car(List<String> carNames) {
        validateSize();
        validateDuplicate();
        this.carNames = carNames;
    }

    /**
     * 각 자동차 이름에 대한 글자수를 검증한다.
     */
    private void validateSize() {
        carNames.stream().forEach(name -> {
            if (name.length() > 4) {
                throw new IllegalArgumentException("자동차 이름은 5글자까지 허용됩니다.");
            }
        });
    }

    /**
     * 각 자동차 이름에 대한 중복을 검증한다.
     */
    private void validateDuplicate() {
        Set<String> nonDuplicateNames = new HashSet<>(carNames);
        if (nonDuplicateNames.size() != carNames.size()) {
            throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
        }
    }
}