module ar.com.alura.DeployTest.conversor {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
	requires java.net.http;
	requires org.json;


    opens ar.com.alura.DeployTest.conversor to javafx.fxml;
    exports ar.com.alura.DeployTest.conversor;
    exports ar.com.alura.DeployTest.test.controllers to javafx.fxml;
    opens ar.com.alura.DeployTest.test.controllers to javafx.fxml;
    
}
