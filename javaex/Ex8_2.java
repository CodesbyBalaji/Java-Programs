import java.util.concurrent.Semaphore;

class Airport {
    private Semaphore runwayAvailable;

    public Airport() {
        runwayAvailable = new Semaphore(1); // Only one runway is available
    }

    public void requestPermissionToLand() {
        try {
            System.out.println("Airplane requesting permission to land.");
            runwayAvailable.acquire();
            System.out.println("Airplane has been granted permission to land.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void requestPermissionToTakeOff() {
        try {
            System.out.println("Airplane requesting permission to take off.");
            runwayAvailable.acquire();
            System.out.println("Airplane has been granted permission to take off.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void releaseRunway() {
        runwayAvailable.release();
        System.out.println("Runway has been released.");
    }
}

class Airplane extends Thread {
    private String type;
    private Airport airport;

    public Airplane(String type, Airport airport) {
        this.type = type;
        this.airport = airport;
    }

    @Override
    public void run() {
        if (type.equals("takeoff")) {
            airport.requestPermissionToTakeOff();
            // Simulate takeoff
            System.out.println("Airplane is taking off...");
            try {
                Thread.sleep(2000); // Simulate takeoff time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (type.equals("land")) {
            airport.requestPermissionToLand();
            // Simulate landing
            System.out.println("Airplane is landing...");
            try {
                Thread.sleep(2000); // Simulate landing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        airport.releaseRunway();
    }
}

public class Ex8_2 {
    public static void main(String[] args) {
        Airport airport = new Airport();

        // Create airplane threads
        Airplane airplane1 = new Airplane("takeoff", airport);
        Airplane airplane2 = new Airplane("land", airport);

        // Start the airplane threads
        airplane1.start();
        airplane2.start();
    }
}

