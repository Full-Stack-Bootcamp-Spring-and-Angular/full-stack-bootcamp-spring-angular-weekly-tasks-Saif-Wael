package part2;

public class Car implements Vehicle{
    private dataBaseOperation dataBaseOperation;

    @Override
    public void storeVehicle() {
    dataBaseOperation.store("Car");
    }
    Car(dataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }

}
