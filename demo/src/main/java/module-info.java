module com.empresa.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.empresa.demo to javafx.fxml;
    exports com.empresa.demo;
}