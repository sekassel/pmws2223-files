package de.uniks.pmws2223;

import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import static org.junit.Assert.assertEquals;

public class AppTest extends ApplicationTest
{
	private App app;
	private Stage stage;

	@Override
	public void start(Stage stage) throws Exception
	{
		this.stage = stage;
		app = new App();
		app.start(stage);
	}

	@Test
	public void changeView()
	{
		// TODO
	}
}
