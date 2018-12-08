
package main;
 import models.Model;
import views.View;
import controllers.Controller;

/**
 *
 * @author PC-6
 */
public class Main {
    public static void main(String MAVL[]){
        Model model = new Model();
        View view = new View();
        
        Controller controller = new Controller(model,view);
        controller.init_view();
        view.setVisible(true);
    }
}
