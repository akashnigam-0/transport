import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TransportApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new UserSelectionFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class UserSelectionFrame extends JFrame {
    public UserSelectionFrame() {
        setTitle("User Selection");
        setSize(300, 150);
        setLocationRelativeTo(null);

        JButton dealerButton = new JButton("Dealer");
        JButton driverButton = new JButton("Driver");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        add(dealerButton, gbc);
        gbc.gridy++;
        add(driverButton, gbc);

        dealerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DealerSignupFrame dealerSignupFrame = new DealerSignupFrame();
                dealerSignupFrame.setVisible(true);
                setVisible(false);
            }
        });

        driverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DriverSignupFrame driverSignupFrame = new DriverSignupFrame();
                driverSignupFrame.setVisible(true);
                setVisible(false);
            }
        });
    }
}

class Dealer {
    private String name;
    private String mobileNumber;
    private String natureOfMaterial;
    private double weight;
    private int quantity;
    private String city;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNatureOfMaterial() {
        return natureOfMaterial;
    }

    public void setNatureOfMaterial(String natureOfMaterial) {
        this.natureOfMaterial = natureOfMaterial;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

class Driver {
    private String name;
    private int age;
    private String truckNumber;
    private String mobileNumber;
    private double truckCapacity;
    private String transporterName;
    private int drivingExperience;
    private List<String> interestedRoutes = new ArrayList<>();
    private String city;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    } 
    public String getState() {
        return state;
    }

    public void setState(String State) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(double truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    public String getTransporterName() {
        return transporterName;
    }

    public void setTransporterName(String transporterName) {
        this.transporterName = transporterName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public List<String> getInterestedRoutes() {
        return interestedRoutes;
    }

    public void setInterestedRoutes(List<String> interestedRoutes) {
        this.interestedRoutes = interestedRoutes;
    }
}

class DealerSignupFrame extends JFrame {
    private JTextField nameField, mobileField, materialField, weightField, quantityField, cityField, stateField;
    private JButton signupButton;

    public DealerSignupFrame() {
        setTitle("Dealer Signup");
        setSize(300, 350);
        setLocationRelativeTo(null);

        nameField = new JTextField(20);
        mobileField = new JTextField(20);
        materialField = new JTextField(20);
        weightField = new JTextField(20);
        quantityField = new JTextField(20);
        cityField = new JTextField(20);
        stateField = new JTextField(20);
        signupButton = new JButton("Sign Up");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Name:"), gbc);
        gbc.gridy++;
        add(new JLabel("Mobile Number:"), gbc);
        gbc.gridy++;
        add(new JLabel("Nature of Material:"), gbc);
        gbc.gridy++;
        add(new JLabel("Weight of Material:"), gbc);
        gbc.gridy++;
        add(new JLabel("Quantity:"), gbc);
        gbc.gridy++;
        add(new JLabel("City:"), gbc);
        gbc.gridy++;
        add(new JLabel("State:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        add(nameField, gbc);
        gbc.gridy++;
        add(mobileField, gbc);
        gbc.gridy++;
        add(materialField, gbc);
        gbc.gridy++;
        add(weightField, gbc);
        gbc.gridy++;
        add(quantityField, gbc);
        gbc.gridy++;
        add(cityField, gbc);
        gbc.gridy++;
        add(stateField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;

        add(signupButton, gbc);

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String mobile = mobileField.getText();
                String material = materialField.getText();
                double weight = Double.parseDouble(weightField.getText());
                int quantity = Integer.parseInt(quantityField.getText());
                String city = cityField.getText();
                String state = stateField.getText();

                Dealer newDealer = new Dealer();
                newDealer.setName(name);
                newDealer.setMobileNumber(mobile);
                newDealer.setNatureOfMaterial(material);
                newDealer.setWeight(weight);
                newDealer.setQuantity(quantity);
                newDealer.setCity(city);
                newDealer.setState(state);

                List<Driver> availableDrivers = getAvailableDrivers(city, state);

                DealerDashboardFrame dashboardFrame = new DealerDashboardFrame(newDealer, availableDrivers);
                dashboardFrame.setVisible(true);
                setVisible(false);
            }
        });
    }

    private List<Driver> getAvailableDrivers(String city, String state) {
        List<Driver> availableDrivers = new ArrayList<>();

        Driver driver1 = new Driver();
        driver1.setName("Driver 1");
        driver1.setCity("Indore");
        driver1.setState("Madhya Pradesh");
        driver1.getInterestedRoutes().add("Madhya Pradesh-Indore");
        availableDrivers.add(driver1);

        Driver driver2 = new Driver();
        driver2.setName("Driver 2");
        driver2.setCity("Bhopal");
        driver2.setState("Madhya Pradesh");
        driver2.getInterestedRoutes().add("Madhya Pradesh-Bhopal");
        availableDrivers.add(driver2);

        return availableDrivers;
    }
}

class DealerDashboardFrame extends JFrame {
    private JTextArea driverListArea;

    public DealerDashboardFrame(Dealer dealer, List<Driver> drivers) {
        setTitle("Dealer Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);

        driverListArea = new JTextArea(10, 30);
        driverListArea.setEditable(false);

        driverListArea.append("Available Drivers for Dealer: " + dealer.getName() + "\n");
        driverListArea.append("------------------------------\n");

        for (Driver driver : drivers) {
            driverListArea.append("Name: " + driver.getName() + "\n");
            driverListArea.append("City: " + driver.getCity() + "\n");
            driverListArea.append("State: " + driver.getState() + "\n");
            driverListArea.append("Interested Routes: " + String.join(", ", driver.getInterestedRoutes()) + "\n");
            driverListArea.append("------------------------\n");
        }

        JScrollPane scrollPane = new JScrollPane(driverListArea);
        add(scrollPane);
    }
}

class DriverSignupFrame extends JFrame {
    private JTextField nameField, ageField, truckNumberField, mobileField, capacityField, transporterField, experienceField;
    private JTextArea routesArea;
    private JButton signupButton;

    public DriverSignupFrame() {
        setTitle("Driver Signup");
        setSize(400, 500);
        setLocationRelativeTo(null);

        nameField = new JTextField(20);
        ageField = new JTextField(20);
        truckNumberField = new JTextField(20);
        mobileField = new JTextField(20);
        capacityField = new JTextField(20);
        transporterField = new JTextField(20);
        experienceField = new JTextField(20);
        routesArea = new JTextArea(5, 20);
        signupButton = new JButton("Sign Up");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Name:"), gbc);
        gbc.gridy++;
        add(new JLabel("Age:"), gbc);
        gbc.gridy++;
        add(new JLabel("Truck Number:"), gbc);
        gbc.gridy++;
        add(new JLabel("Mobile Number:"), gbc);
        gbc.gridy++;
        add(new JLabel("Truck Capacity:"), gbc);
        gbc.gridy++;
        add(new JLabel("Transporter Name:"), gbc);
        gbc.gridy++;
        add(new JLabel("Driving Experience:"), gbc);
        gbc.gridy++;
        add(new JLabel("Interested Routes (comma-separated):"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        add(nameField, gbc);
        gbc.gridy++;
        add(ageField, gbc);
        gbc.gridy++;
        add(truckNumberField, gbc);
        gbc.gridy++;
        add(mobileField, gbc);
        gbc.gridy++;
        add(capacityField, gbc);
        gbc.gridy++;
        add(transporterField, gbc);
        gbc.gridy++;
        add(experienceField, gbc);
        gbc.gridy++;
        add(new JScrollPane(routesArea), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;

        add(signupButton, gbc);

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String truckNumber = truckNumberField.getText();
                String mobile = mobileField.getText();
                double capacity = Double.parseDouble(capacityField.getText());
                String transporter = transporterField.getText();
                int experience = Integer.parseInt(experienceField.getText());
                String[] routesArray = routesArea.getText().split(",");
                List<String> routes = new ArrayList<>();
                for (String route : routesArray) {
                    routes.add(route.trim());
                }

                Driver newDriver = new Driver();
                newDriver.setName(name);
                newDriver.setAge(age);
                newDriver.setTruckNumber(truckNumber);
                newDriver.setMobileNumber(mobile);
                newDriver.setTruckCapacity(capacity);
                newDriver.setTransporterName(transporter);
                newDriver.setDrivingExperience(experience);
                newDriver.setInterestedRoutes(routes);

                DriverDashboardFrame dashboardFrame = new DriverDashboardFrame(newDriver);
                dashboardFrame.setVisible(true);
                setVisible(false);
            }
        });
    }
}

class DriverDashboardFrame extends JFrame {
    private JTextArea dealerListArea;

    public DriverDashboardFrame(Driver driver) {
        setTitle("Driver Dashboard");
        setSize(400, 300);
        setLocationRelativeTo(null);

        dealerListArea = new JTextArea(10, 30);
        dealerListArea.setEditable(false);

        dealerListArea.append("Bookings for Driver: " + driver.getName() + "\n");
        dealerListArea.append("------------------------------\n");
        // Simulated dealer bookings for the driver
        dealerListArea.append("Dealer 1\n");
        dealerListArea.append("Dealer 2\n");
        // Add more dealer bookings as needed

        JScrollPane scrollPane = new JScrollPane(dealerListArea);
        add(scrollPane);
    }
}
