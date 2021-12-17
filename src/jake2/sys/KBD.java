package jake2.sys;


/**
 * KBD
 */
abstract public class KBD {
	
	static int win_x = 0;
	static int win_y = 0;
		
	// motion values
	public static int mx = 0;
	public static int my = 0;
	
	abstract public void Init();

	abstract public void Update();

	abstract public void Close();
	abstract public void Do_Key_Event(int key, boolean down);

	abstract public void installGrabs();
	abstract public void uninstallGrabs();
	//abstract public void centerMouse();
}

