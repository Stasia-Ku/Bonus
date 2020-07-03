public class Main {
    public static void main(String[] args) {
        float currientValue = 100.0f;
        float additionaltValue = 1100.0f;
        int bonusValue = 100;

        int bonusResult = (int) additionaltValue / bonusValue;

        float resultValue = currientValue + additionaltValue + bonusResult;

        System.out.printf("Счет абонента после пополнения на %.2f с учетом %d бонусов: %.2f\n", additionaltValue, bonusResult, resultValue);
    }
}
