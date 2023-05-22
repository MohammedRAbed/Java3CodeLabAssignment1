module com.example.a1project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.a1project to javafx.fxml;
    exports com.example.a1project;
    exports com.example.a1project.Controller;
    opens com.example.a1project.Controller to javafx.fxml;
}