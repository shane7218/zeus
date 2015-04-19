package client;

import java.awt.BorderLayout;

import javax.swing.JComboBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CollectItemsFrame extends JFrame {

	private JPanel contentPane;
	private JComboBox<Integer> sectorList = new JComboBox<Integer>();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public CollectItemsFrame() {
		setTitle("Picker Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sectorList.setEditable(false);
		ArrayList<Integer> aItemList = GUIManager.getGCC().getSectorsIDs();
		int i, c;
		
        for (i = 1, c = aItemList.size(); i < c; i++) 
        {
            sectorList.addItem(i);
        }
		
		sectorList.setBounds(25, 11, 100, 23);
		contentPane.add(sectorList);
	
		sectorList.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent e) 
	        {
	            if(sectorList.getSelectedItem().equals(1))
	            {
	            	GUIManager.getGCC().setCurrentSectorLocation(1);
	            	System.out.print("You selected the sector: " + (sectorList.getSelectedItem()));
	            }
	            
	            else if(sectorList.getSelectedItem().equals(2))
	            {
	            	GUIManager.getGCC().setCurrentSectorLocation(2);
	            	System.out.print("You selected the sector: " + (sectorList.getSelectedItem()));
	            }
	            
	            else if(sectorList.getSelectedItem().equals(3))
	            {
	            	GUIManager.getGCC().setCurrentSectorLocation(3);
	            	System.out.print("You selected the sector: " + (sectorList.getSelectedItem()));
	            }
	            
	            else if(sectorList.getSelectedItem().equals(4))
	            {
	            	GUIManager.getGCC().setCurrentSectorLocation(4);
	            	System.out.print("You selected the sector: " + (sectorList.getSelectedItem()));
	            }
	            
	            else if(sectorList.getSelectedItem().equals(5))
	            {
	            	GUIManager.getGCC().setCurrentSectorLocation(5);
	            	System.out.print("You selected the sector: " + (sectorList.getSelectedItem()));
	            }
	        }
		});
		
		
		JButton logOutButton = new JButton("Log Out");
		logOutButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				GUIManager.getGCC().logOut();
				GUIManager.changeFrame(new LogOutFrame());
			}
		});
		logOutButton.setBounds(335, 11, 89, 23);
		contentPane.add(logOutButton);
		
		DefaultListModel <String> aListModel = new DefaultListModel <String>();
		ArrayList<String> aArrayList = GUIManager.getGCC().getPickerCurrentBasket();
		JList<String> listOfItemsToCollect = new JList<String>();
		
		 for (String temp : aArrayList) 
		 {
		        aListModel.addElement(temp);
		 }
		
		listOfItemsToCollect.setModel(aListModel);
		
		listOfItemsToCollect.setBounds(126, 100, 157, 108);
		contentPane.add(listOfItemsToCollect);
		
		JButton readyToCollectButton = new JButton("Ready");
		readyToCollectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				GUIManager.changeFrame(new ItemsCollectedFrame());
			}
		});
		readyToCollectButton.setBounds(161, 219, 89, 23);
		contentPane.add(readyToCollectButton);
		
		JTextArea itemsToBeCollectedMessage = new JTextArea();
		itemsToBeCollectedMessage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		itemsToBeCollectedMessage.setLineWrap(true);
		itemsToBeCollectedMessage.setEditable(false);
		itemsToBeCollectedMessage.setText("Items to be collected shown below.  Proceed when ready.");
		itemsToBeCollectedMessage.setBounds(65, 66, 291, 23);
		contentPane.add(itemsToBeCollectedMessage);
	}
}
	        
