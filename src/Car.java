public class Car extends Transport{

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    @Override
    public void transportService(){
        updateTyre();
        checkEngine();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }
        public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

}