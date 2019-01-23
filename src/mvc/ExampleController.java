/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author jswrigh
 */
public class ExampleController {
    private ExampleModel model;
    private ExampleView view;

    public ExampleController(ExampleModel model, ExampleView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setExampleName(String name) {
        model.setName(name);
    }
    
    public String getExampleName() {
        return model.getName();
    }
    
    public void setExampleValue(String value) {
        model.setValue(value);
    }
    
    public String getExampleValue() {
        return model.getValue();
    }
    
    public void updateExampleView() {
        view.printExampleData(model.getName(), model.getValue());
    }
}
