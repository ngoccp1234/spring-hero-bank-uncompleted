package spring.hero.bank;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Transfers extends Stage {
    private static final int TRANSFERS_STAGE_WIDTH = 350;
    private static final int TRANSFERS_STAGE_HEIGHT = 300;
    private VBox vBox;
    private GridPane gridPane;
    private HBox titleBox;
    private HBox btnBox;

    private Label lblTitle;
    private Label lblReceiveId;
    private TextField receiveIdField;
    private Label lblAmount;
    private TextField amountField;
    private Label lblReceiverName;
    private TextField receiverNameField;
    private Label lblAddressReceiver;
    private TextField addressReceiverField;

    private Button btnSend;
    private Button btnCancel;

    private Scene scene;
    private Stage stage;
    private MainApplication mainApplication;

    public Transfers(MainApplication mainApplication){
        this.mainApplication = mainApplication;
        this.initComponent();
        this.scene = new Scene(this.vBox,TRANSFERS_STAGE_WIDTH, TRANSFERS_STAGE_HEIGHT);
        this.stage = this;
        this.stage.setScene(this.scene);
    }

    public void initComponent(){
        this.titleBox = new HBox();
        this.titleBox.setAlignment(Pos.TOP_LEFT);
        this.titleBox.setSpacing(10);
        this.lblTitle = new Label("Transfers");
        this.lblTitle.setFont(Font.font(17));
        this.lblTitle.setTextFill(Color.web("#f9e70b"));
        this.titleBox.getChildren().add(lblTitle);

        this.gridPane = new GridPane();
        this.gridPane.setPadding(new Insets(10));
        this.gridPane.setVgap(10);
        this.gridPane.setHgap(10);
        this.lblReceiveId = new Label("Receive Id: ");
        this.receiveIdField = new TextField();
        this.lblAmount = new Label("Amount: ");
        this.amountField = new TextField();
        this.lblReceiverName = new Label("Receiver Name: ");
        this.receiverNameField = new TextField();
        this.lblAddressReceiver = new Label("Address Receiver: ");
        this.addressReceiverField = new TextField();
        this.btnSend = new Button("Send");
        this.btnCancel = new Button("Cancel");
        this.gridPane.setAlignment(Pos.CENTER);

        btnSend.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        this.btnBox = new HBox();
        this.btnBox.setPadding(new Insets(10));
        this.btnBox.setSpacing(10);
        this.btnBox.getChildren().addAll(btnSend, btnCancel);

        this.gridPane.add(this.lblReceiveId,0,0);
        this.gridPane.add(this.receiveIdField,1,0);
        this.gridPane.add(this.lblAmount,0,1);
        this.gridPane.add(this.amountField,1,1);
        this.gridPane.add(this.lblReceiverName,0,2);
        this.gridPane.add(this.receiverNameField,1,2);
        this.gridPane.add(this.lblAddressReceiver,0,3);
        this.gridPane.add(this.addressReceiverField,1,3);
        this.gridPane.add(this.btnBox,1,4);

        this.vBox = new VBox();
        this.vBox.setPadding(new Insets(10));
        this.vBox.setSpacing(10);
        this.vBox.getChildren().addAll(this.titleBox, this.gridPane,this.btnBox);
    }



}
