package part2;

public class Plane implements Vehicle{
    private dataBaseOperation dataBaseOperation;
    @Override
    public void storeVehicle() {
    dataBaseOperation.store("Plane");
    }
    public void setDataBaseOperation(dataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }

}
