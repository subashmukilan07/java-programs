class ParkingSystem {
    private int[] count;

    public ParkingSystem(int big, int medium, int small) {
        count = new int[] {0, big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if (count[carType] > 0) {
            count[carType]--;
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
}