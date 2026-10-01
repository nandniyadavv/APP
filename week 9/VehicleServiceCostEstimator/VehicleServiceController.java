import javax.swing.*;

public class VehicleServiceController {
    public VehicleServiceController(VehicleServiceModel model, VehicleServiceView view) {
        view.calculate.addActionListener(e -> {
            if (view.registration.getText().isEmpty()) {
                JOptionPane.showMessageDialog(view, "Enter registration number."); return;
            }
            int cost = model.calculateCost(view.general.isSelected(), view.oil.isSelected(),
                    view.brake.isSelected(), view.battery.isSelected());
            view.result.setText("Total Service Cost: ₹" + cost);
        });
    }
}