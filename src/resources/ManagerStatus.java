package resources;

import java.util.ResourceBundle;

/**All status name */
public class ManagerStatus {

	private final static ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.status");

	private ManagerStatus() {
	}

	public static String getProperty(String key) {
		return resourceBundle.getString(key);
	}

}