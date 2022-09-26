module ProgramacionJava {
	requires java.base;		
	requires java.desktop;
	requires java.logging;
	requires org.apache.logging.log4j;
	requires org.eclipse.jdt.annotation;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.xml;
	requires java.sql;
	requires mysql.connector.java;
		
	opens dam.temauno.cadenas;
	opens dam.temauno.fechahora;
	opens dam.tematres.logger;
	opens dam.tematres.logapache;
	opens dam.temaocho.escena;	
}