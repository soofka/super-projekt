module MyApp {
    requires javafx.controls;
    requires javafx.fxml;

    opens MyApp;
    exports MyApp;
}