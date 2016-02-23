package hipster.view;
import javax.swing.JFrame;
import hipster.controller.HipsterAppController;
import javax.swing.JOptionPane;
public class HipsterFrame extends JFrame 
{
	private HipsterAppController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{ 
    String response = JOptionPane.showInputDialog(this,prompt);
    return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
