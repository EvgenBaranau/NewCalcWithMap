import java.util.List;

/**
 * Created by evgen on 08.02.2017.
 */
public class SimpleCalculator implements Calculator {

    Operations operations = new Operations();
    @Override
    public double calculate(List<String> list) {
        double result = 0;
        for(int i = 1;i<list.size();i++)
        {
            if (operations.Simpleoperations.containsKey(list.get(i))) {
                result = operations.Simpleoperations.get(list.get(i)).doOperation(result, Double.valueOf(list.get(++i)));
            }
            else
                result = Double.valueOf(list.get(i));
        }
        return result;
    }
}
