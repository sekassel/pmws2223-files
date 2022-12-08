package de.uniks.pmws2223.controller;

import de.uniks.pmws2223.App;
import javafx.scene.Parent;

public class LoginController implements Controller
{
	private final App app;

	public LoginController(App app)
	{
		this.app = app;
	}

	@Override
	public String getTitle()
	{
		// TODO
		return null;
	}

	@Override
	public void init()
	{
	}

	@Override
	public Parent render() throws IOException
	{
		// TODO
		// Load FXML
		// Lookup Start button
		// Set Start button onAction
		// in onAction: Switch to Battle
		return null;
	}

	@Override
	public void destroy()
	{
	}
}
