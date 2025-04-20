module com.example.reservationroomsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reservationroomsapp to javafx.fxml;
    exports com.example.reservationroomsapp;
}