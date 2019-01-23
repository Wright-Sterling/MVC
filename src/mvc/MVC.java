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
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //get name/value pair from simulated database
       ExampleModel model = readRecord();
       
       //create the view
       ExampleView view = new ExampleView();
       
       //create the controller
       ExampleController controller = new ExampleController(model, view);
       
       controller.updateExampleView();
       
       //change the data
       controller.setExampleValue("Second Value");

       controller.updateExampleView();
   }
   
   private static ExampleModel readRecord() {
       ExampleModel record = new ExampleModel();
       record.setName("First Name");
       record.setValue("First Value");  
       return record;
   }
}
