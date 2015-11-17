package hipster.view;




import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import hipster.controller.HipsterAppController;
public class hipsterPanel
{
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController=baseController;
		baseLayout=newSpringLayout();
		phraseComboBox=new JComboBox<String>();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
       private void setupComboBox()
       {
       String[] phrases = baseController.getFirstHipster().getHipsterPhrases();
       DefualtComboBoxModel phraseModel=new DefualtComboBoxModel(phrases);
       phraseComboBoxsetModel(phraseModel);
       }
     private void setupPanel()
     {
    	 this.setLayout(baseLayout);
         this.setBackground(Color.Orange);
    	 
     }
     private void setupLayout()
     {
    	 
     }
       private void setupListeners()
      {
    	  phraseComboBox.addActionListener(new ActionListener()
    	  {
    		  public void actioPerformed(ActionEvent selection)
    		  {
    			  int red = (int) (Math.random()*256);
    			  int green = (int) (Math.random()* 256);
    			  int blue = (int) (Math.random()*256);
    			  setBackground(new Color(red,green,blue));
    			  String updatedTitle = phraseComboBox.getSelectedItem().toString();
    			  baseController.getBaseFrame().setTitle(updatedTitle);
    		  }
    	  }
      }
}


