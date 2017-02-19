package test;


public class Controller {

	t view;
    Model model;

    Controller(t v) {
        this.view = v;
        this.model=new Model();

        this.view.jButton1.getText();
    }

    public void onOperationButtonClicked(String buttonTitle) {
//    this.model.
    }

    public boolean validate(String operation, double p1, double p2) {
        
        return this.model.validate(operation, p1, p2);
        
    }

    public double calculate(String operation, double p1, double p2) {
        return this.model.Calc(p1, p2, operation);
    }

}