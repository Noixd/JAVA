/**
 * Requrements for prj
 */

module com.example.lab4_eliz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.lab4_eliz to javafx.fxml;
    exports com.example.lab4_eliz;
}