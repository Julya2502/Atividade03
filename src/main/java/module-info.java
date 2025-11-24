module com.example.atividade03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atividade03 to javafx.fxml;
    exports com.example.atividade03;
}