import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 08.02.2017.
 */
class Operations {


    public final Map<String,IOperation> Simpleoperations = new HashMap<String,IOperation>(){{

        put("+",new Addition());
        put("-",new Subtraction());
        put("*",new Multiplication());
        put("/",new Division());
    }};
    public final Map<String,IOperation> Engineeroperations = new HashMap<String,IOperation>(){{

        put("cos", new Cos());
        put("exp", new Exp());
        put("sqrt", new Sqrt());

    }};
    public final Map<String,IOperation> Memoryoperations = new HashMap<String,IOperation>(){{

        put("m+", new IncreaseMemory());
        put("mc", new ClearMemory());
        put("m-", new ReduceMemory());
        put("mr", new SetMemory());
        put("m", new AddMemory());

    }};


    class Addition implements IOperation
    {
        @Override
        public double doOperation(double x, double y) {
            return x+y;
        }
    }
    class Subtraction implements IOperation
    {
        @Override
        public double doOperation(double x, double y) {
            return x-y;
        }
    }
    class Multiplication implements IOperation
    {
        @Override
        public double doOperation(double x, double y) {
            return x*y;
        }
    }
    class Division implements IOperation
    {
        @Override
        public double doOperation(double x, double y) {
            return x/y;
        }
    }

    class Cos implements  IOperation
    {

        @Override
        public double doOperation(double x, double y) {
            return Math.cos(x);
        }
    }
    class Exp implements IOperation
    {

        @Override
        public double doOperation(double x, double y) {
            return Math.exp(x);
        }
    }
    class Sqrt implements IOperation
    {

        @Override
        public double doOperation(double x, double y) {
            return Math.sqrt(x);
        }
    }

    class AddMemory implements IOperation
    {

        @Override
        public double doOperation(double x, double y) {
            return x;
        }
    }

    class ClearMemory implements IOperation
    {

        @Override
        public double doOperation(double x, double y) {
            return 0;
        }
    }

    class ReduceMemory implements IOperation
    {

        @Override
        public double doOperation(double x, double y) {
            return -x;
        }
    }

    class SetMemory implements IOperation
    {

        @Override
        public double doOperation(double x, double y) {
            return x;
        }
    }

    class IncreaseMemory implements IOperation
    {

        @Override
        public double doOperation(double x, double y) {
            return x;
        }
    }
}
