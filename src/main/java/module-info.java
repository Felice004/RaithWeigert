module com.example.aud {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aud to javafx.fxml;
    exports com.example.aud;
}