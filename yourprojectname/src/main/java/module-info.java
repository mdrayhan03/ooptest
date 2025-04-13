module mainpkg.yourprojectname {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpkg.yourprojectname to javafx.fxml;
    exports mainpkg.yourprojectname;
}