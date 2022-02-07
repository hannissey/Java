module com.example.chapter10_introducingjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chapter10_introducingjavafx to javafx.fxml;
    exports com.example.chapter10_introducingjavafx;
}