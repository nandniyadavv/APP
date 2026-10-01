public class Main {
    public static void main(String[] args) {
        VehicleServiceModel model = new VehicleServiceModel();
        VehicleServiceView view = new VehicleServiceView();
        new VehicleServiceController(model, view);
    }
}