package hipster.view;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import hipster.controller.HipsterAppController;
public class HipsterPanel
{
	private HipsterAppController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;
	
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController=baseController;
		baseLayout=new SpringLayout();
		bookPageCountLabel=new JLabel("the page count");
		bookAuthorLabel=new JLabel("the author");
		bookPriceLabel=new JLabel("the price");
		bookSubjectLabel=new JLabel("the subject");
		bookTitleLabel=new JLabel("the title");
		changeBookButton=new JButton("Change books");
		phraseComboBox=new JComboBox<String>();
		maxClicks= baseController.getFirstHipster().getHipsterBooks().length;
		startClick = 0;
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
    	  });
      }
}


