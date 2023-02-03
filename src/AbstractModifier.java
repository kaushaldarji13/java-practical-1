abstract class AbstractModifier {
    abstract public int   getNoofwheels();

    class Bus extends AbstractModifier{
        @Override
        public int getNoofwheels() {
            return 7;
        }
    }
    class Auto extends AbstractModifier{
        @Override
        public int getNoofwheels() {
            return 3;
        }
    }

    public static void main(String[] args) {
//        AbstractModifier a = new AbstractModifier();
    }
}
