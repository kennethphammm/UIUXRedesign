module com.example.inclassactivity1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inclassactivity1 to javafx.fxml;
    exports com.example.inclassactivity1;
}