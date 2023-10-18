package org.example;
import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {
    public static void main(String[] args) {
        // !!! Семен, здравствуйте! Смотрю семинары в записи.
        // Если будет возможность, разберите, пожалуйста на семинаре,
        // как правильно обрабатывать такую ошибку, 19.9 !=2
        //assertThat(Calculator.calculation(19, 9, '/')).isEqualTo(2);

        hw1();


    }
// calculateDiscountTest
    public static void hw1(){
        // тест на работоспособность
        assertThat(Calculator.calculatingDiscount(100, 5)).isEqualTo(95.0);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100, -5)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100, 120)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(0, 5)).isInstanceOf(IllegalArgumentException.class);
// и как правильно проверить программу на ввод данных неправильного типа, тоже не понимаю
//                assertThatThrownBy(() ->
//                Calculator.calculatingDiscount(100, 5.5)).isInstanceOf(IllegalStateException.class);

    }
}




