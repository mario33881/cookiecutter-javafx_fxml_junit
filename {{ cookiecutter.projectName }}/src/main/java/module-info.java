module {{ cookiecutter.groupId }} {
    requires javafx.controls;
    requires javafx.fxml;

    opens {{ cookiecutter.groupId }} to javafx.fxml;
    exports {{ cookiecutter.groupId }};
}
