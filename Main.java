public class Main {
    public static void main(String[] args) {
        float currientValue = 100.0f;
        float additionaltValue = 1100.0f;
        int bonusValue = 100;

        float resultValue = currientValue + additionaltValue + additionaltValue/bonusValue;

        System.out.printf("Счет абонента после пополнения на %.2f с учетом бонусов: %.2f\n", additionaltValue, resultValue);
    }
}
