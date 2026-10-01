import javax.swing.*;
import java.awt.*;

public class VehicleServiceView extends JFrame {
    JTextField registration = new JTextField(15);
    JRadioButton twoWheeler = new JRadioButton("Two Wheeler");
    JRadioButton car = new JRadioButton("Car");
    JCheckBox general = new JCheckBox("General Service - ₹1000");
    JCheckBox oil = new JCheckBox("Oil Change - ₹800");
    JCheckBox brake = new JCheckBox("Brake Service - ₹1200");
    JCheckBox battery = new JCheckBox("Battery Check - ₹500");
    JButton calculate = new JButton("Calculate Cost");
    JLabel result = new JLabel("Total: ₹0");

    public VehicleServiceView() {
        setTitle("Vehicle Service Cost Estimator"); setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setLayout(new GridLayout(8, 1));
        add(new JLabel("Registration Number:")); add(registration);
        JPanel type = new JPanel(); ButtonGroup group = new ButtonGroup();
        group.add(twoWheeler); group.add(car); type.add(twoWheeler); type.add(car); add(type);
        add(general); add(oil); add(brake); add(battery); add(calculate); add(result);
        setVisible(true);
    }
}