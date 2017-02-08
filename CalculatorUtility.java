import java.util.List;

/**
 * Created by evgen on 08.02.2017.
 */
public class CalculatorUtility {

        public static double parseAndCalculate(List<String> list) { // метод вызывает нужную реализацию калькулятора
            switch (list.get(0)) {
                case "1":
                    return new SimpleCalculator().calculate(list);
                case "2":
                    return new SimpleCalculatorWithMemory().calculate(list);
                case "3":
                    return new EngineerCalculator().calculate(list);
                case "4":
                    return new EngineerCalculatorWithMemory().calculate(list);
                default:
                    throw new IllegalArgumentException("Wrong input data (calculator number)!");
            }
        }



}
