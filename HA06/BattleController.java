package de.uniks.pmws2223.controller;

import de.uniks.pmws2223.App;
import javafx.scene.Parent;

public class BattleController implements Controller
{
	private final App app;

	public BattleController(App app)
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
		// Lookup Leave button
		// Set Leave button onAction
		// in onAction: Switch to Login
		return null;
	}

	@Override
	public void destroy()
	{
	}
}
