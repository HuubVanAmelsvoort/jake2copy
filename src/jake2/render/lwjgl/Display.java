/**
 * Deze class door Huub aangemaakt. In LwJGL zit deze niet meer, maar in 
*/
package jake2.render.lwjgl;

import java.awt.DisplayMode;
import java.util.ArrayList;

/**
 *
 * @author hvame
 */
class Display {
  //private static final DisplayMode dm[];
  static ArrayList<DisplayMode> dm;
  //= new DisplayMode[];
  
  
  static DisplayMode[] getAvailableDisplayModes() {
    System.out.println("Nog implementeren!!!!!!");
    
    return (DisplayMode[]) dm.toArray();
  }
  
}
