package dad.buscarYRemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYRemplazarApp extends Application {
	
	//view 
	private Label buscarLabel;
	private TextField buscarTextField;
	private Button buscarButton;
	
	private Label remplazarLabel;
	private TextField remplazarTextField;
	private Button remplazarButton;
	
	private CheckBox mayusYMinusCheckBox;
	private CheckBox buscarHaciaAtrasCheckBox;
	private CheckBox expresionRegularCheckBox;
	private CheckBox resaltarResultadosCheckBox;
	
	private Button remplazarTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	
	private VBox checkBoxes1VBox;
	private VBox checkBoxes2VBox;
	
	private HBox checkBoxesHBox;
	
	private VBox buttonVBox;
	
	private GridPane tablaGridPane;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		tablaGridPane = new GridPane();
		
		mayusYMinusCheckBox = new CheckBox("Mayúsculas y Minúsculas");
		
		buscarHaciaAtrasCheckBox = new CheckBox("Buscar Hacia atrás");
		
		expresionRegularCheckBox = new CheckBox("Expresión Regular");
		
		resaltarResultadosCheckBox = new CheckBox("Resaltar Resultados");
		
		
		checkBoxes1VBox = new VBox(mayusYMinusCheckBox, expresionRegularCheckBox);
		
		checkBoxes2VBox = new VBox(buscarHaciaAtrasCheckBox, resaltarResultadosCheckBox);
		
		checkBoxesHBox = new HBox(checkBoxes1VBox, checkBoxes2VBox);
		checkBoxesHBox.setSpacing(2);
		
		// row 0
		buscarLabel = new Label("Buscar: ");
		
		buscarTextField = new TextField();
		
		buscarButton = new Button("Buscar");
		
		// row 1
		remplazarLabel = new Label("Remplazar con: ");
		
		remplazarTextField = new TextField();
		
		remplazarButton = new Button("Remplazar");
		
		//row 2
		remplazarTodoButton = new Button("Remplazar todo");
		
		//row 3
		cerrarButton = new Button("Cerrar");
		
		//row 4
		ayudaButton = new Button("Ayuda");
		
		buttonVBox = new VBox(buscarButton, remplazarButton, remplazarTodoButton, cerrarButton, ayudaButton);
		buttonVBox.setSpacing(2);
		
		tablaGridPane = new GridPane();
		tablaGridPane.setHgap(5);
		tablaGridPane.setVgap(5);
		tablaGridPane.addRow(0, buscarLabel, buscarTextField);
		tablaGridPane.addRow(1, remplazarLabel, remplazarTextField);
		tablaGridPane.add(checkBoxesHBox, 1, 2, 1, 4);
		tablaGridPane.add(buttonVBox, 2, 0);
		
		GridPane.setFillWidth(buscarTextField, true);
		GridPane.setFillWidth(remplazarTextField, true);
		
		RowConstraints[] rowConstraints = {
				new RowConstraints(),
				new RowConstraints(),
				new RowConstraints(),
				new RowConstraints(),
				new RowConstraints()
		};
		tablaGridPane.getRowConstraints().setAll(rowConstraints);
		
		rowConstraints[0].setValignment(VPos.TOP);
		rowConstraints[1].setValignment(VPos.TOP);
		rowConstraints[2].setValignment(VPos.TOP);
		
		rowConstraints[0].setMaxHeight(20);
		
		ColumnConstraints[] columnConstraints = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		tablaGridPane.getColumnConstraints().setAll(columnConstraints);
		
		columnConstraints[0].setHalignment(HPos.LEFT);
		
		buscarTextField.setPrefWidth(300);
		remplazarTextField.setPrefWidth(300);
		checkBoxesHBox.setPrefWidth(300);
		
		columnConstraints[1].setHalignment(HPos.LEFT);
		
		buscarButton.setMinWidth(100);
		
		remplazarButton.setMinWidth(100);
		
		remplazarTodoButton.setMinWidth(100);
		
		cerrarButton.setMinWidth(100);
		
		ayudaButton.setMinWidth(100);
		
		columnConstraints[2].setHgrow(Priority.ALWAYS);
		columnConstraints[2].setMinWidth(80);
		
		Scene scene = new Scene(tablaGridPane, 500, 200);
		
		primaryStage.setTitle("BuscarYRemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
