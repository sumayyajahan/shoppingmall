  
//////////////////////////////Main Frame Menu Implementation////////////////   

   import java.sql.*;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.util.*;
   
  public class shopping_mall extends JFrame 
  	{
  	 private JDesktopPane theDesktop;	
     private JLabel label1, label2, label3;
     private JTextField text1, text2, text3;
     private ButtonGroup fontGroup, colorGroup;
     private int style;
        
   
     public shopping_mall()
       {
       super( "Shopping Mall Project" );     
       JMenuBar bar = new JMenuBar();  
       setJMenuBar( bar );  
  
       theDesktop= new JDesktopPane();
       getContentPane().add(theDesktop);
              
       JMenu fileMenu = new JMenu( "File" );
       fileMenu.setMnemonic( 'F' );
       JMenuItem aboutItem = new JMenuItem( "About Us" );
       aboutItem.setMnemonic( 'A' );
       aboutItem.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is a SHOPPING MALL project like sattar shopping mall\n\n Developed by: \n  1) Mrs. Mahmuda Akhter (IT-07007)\n  2) Mrs. X (IT-070)\n  3) Mrs. Y(IT-070)\n  4) Mrs. Z (IT-070)",
                   "About Us", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
       fileMenu.add( aboutItem );
        
       JMenuItem contactItem = new JMenuItem( "Contact Us" );
       contactItem.setMnemonic( 'C' );
       contactItem.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "To get the detail kowledge of this project contact to the following link:\nhttp://mbstu.ac.bd/departments/?dept_id=2&page_id=17",
                   "Contact Us", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
       fileMenu.add( contactItem );
        
       JMenuItem termsAndConditionItem = new JMenuItem( "Terms and Condition" );
       termsAndConditionItem.setMnemonic( 'T' );
       termsAndConditionItem.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "Our Shopping Mall Project License Agreement\n\nIMPORTANT: Read this before using your copy of the project.\n\nThis document is a legal agreement between you (an individual or business)\nAnd Our Project(Shopping Mall Management). Use of the project\nIndicates your acceptance of these terms.\n\n  1. PROPRIETARY RIGHTS\n  2. GRANT OF LICENSE\n  3. NONPERMITTED USES\n  4. EXPORT CONTROLS\n  5. LIMITATION OF LIABILITY ",
                   "Terms and Conditions", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
       fileMenu.add( termsAndConditionItem );
  
       JMenuItem exitItem = new JMenuItem( "Exit" );
       exitItem.setMnemonic( 'E' );
        exitItem.addActionListener(
           new ActionListener() {
           public void actionPerformed( ActionEvent e )
              {
                 System.exit( 0 );
              }
           }
        );
        fileMenu.add( exitItem );
        bar.add( fileMenu );    
        
      

        JMenu itemMenu = new JMenu( "Item_Information" );
        itemMenu.setMnemonic( 'I' );
        JMenuItem category = new JMenuItem( "Category" );
        category.setMnemonic( 'A' );
        itemMenu.add( category );
        bar.add( itemMenu );    
        
        final JDesktopPane theDesktop = new JDesktopPane();
        getContentPane().add( theDesktop );
        
        category.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JInternalFrame categoryFrame = new JInternalFrame( "Category Frame",  true, true, true, true );
  
               Container c = categoryFrame.getContentPane();
               category panel = new category();
  
               c.add( panel, BorderLayout.CENTER );
               categoryFrame.setSize(panel.getWidth(), panel.getHeight());
               categoryFrame.setOpaque( true );
               theDesktop.add( categoryFrame );                                  
              }
           }
       );
        
        
        JMenuItem subCategory = new JMenuItem( "Sub_Category" );
        subCategory.setMnemonic( 'U' );
        subCategory.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JInternalFrame itemFrame = new JInternalFrame( "Sub_Categoty Frame",  true, true, true, true );
  
               Container c = itemFrame.getContentPane();
               sub_category panel = new sub_category();
  
               c.add( panel, BorderLayout.CENTER );
               itemFrame.setSize(panel.getWidth(), panel.getHeight());
               itemFrame.setOpaque( true );
               theDesktop.add( itemFrame );        
              }
           }
       );
        itemMenu.add( subCategory );
        
        JMenuItem item = new JMenuItem( "Item" );
        item.setMnemonic( 'T' );
        item.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JInternalFrame itemFrame = new JInternalFrame( "Item Frame",  true, true, true, true );
  
               Container c = itemFrame.getContentPane();
               item panel = new item();
  
               c.add( panel, BorderLayout.CENTER );
               itemFrame.setSize(panel.getWidth(), panel.getHeight());
               itemFrame.setOpaque( true );
               theDesktop.add( itemFrame );        
              }
           }
       );
        itemMenu.add( item );
        
        JMenuItem stockLedger = new JMenuItem( "Stock_ledger" );
        stockLedger.setMnemonic( 'O' );
        stockLedger.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        itemMenu.add( stockLedger );
        
        JMenuItem itemOrder = new JMenuItem( "Item_Order" );
        itemOrder.setMnemonic( 'e' );
        itemOrder.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        itemMenu.add( itemOrder );
        
        JMenuItem itemReceive = new JMenuItem( "Item_Receive" );
        itemReceive.setMnemonic( 'm' );
        itemReceive.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        itemMenu.add( itemReceive );
        
        JMenuItem sticker = new JMenuItem( "Sticker" );
        sticker.setMnemonic( 'k' );
        sticker.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        itemMenu.add( sticker );
        
        
        
        JMenu salesMenu = new JMenu( "Sales_Information" );
        salesMenu.setMnemonic( 'a' );
        JMenuItem itemSales = new JMenuItem( "Item_Sales" );
        itemSales.setMnemonic( 'I' );
        itemSales.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        salesMenu.add( itemSales );
        
        JMenuItem profitFromSales = new JMenuItem( "Profit_From_Sales" );
        profitFromSales.setMnemonic( 'o' );
        profitFromSales.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        salesMenu.add( profitFromSales );
        
        bar.add( salesMenu );    // add Sales menu
        
        JMenu employeeMenu = new JMenu( "Employee_Information" );
        employeeMenu.setMnemonic( 'y' );
        JMenuItem employeeList = new JMenuItem( "Employee_List" );
        employeeList.setMnemonic( 'p' );
        employeeList.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        employeeMenu.add( employeeList );
        
        bar.add( employeeMenu );    // add Employee menu
        
        JMenu expenseMenu = new JMenu( "Expense" );
        expenseMenu.setMnemonic( 'n' );
        JMenuItem expenseByChalan = new JMenuItem( "Expense_By__Chalan" );
        expenseByChalan.setMnemonic( 'e' );
        expenseByChalan.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        expenseMenu.add( expenseByChalan );
        
        JMenuItem expenseBySalary = new JMenuItem( "Expense_By__Salary" );
        expenseBySalary.setMnemonic( 'y' );
        expenseBySalary.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        expenseMenu.add( expenseBySalary );
        
        JMenuItem expenseByOther = new JMenuItem( "Expense_By__Ohter" );
        expenseByOther.setMnemonic( 'h' );
        expenseByOther.addActionListener(
          new ActionListener() {
             public void actionPerformed( ActionEvent e )
              {
               JOptionPane.showMessageDialog( shopping_mall.this,
                   "This is an example\nof using menus",
                   "About", JOptionPane.PLAIN_MESSAGE );
              }
           }
       );
        expenseMenu.add( expenseByOther );
        
        bar.add( expenseMenu );    // add Sales menu
        
        Container c = getContentPane();
        
        c.setLayout( new FlowLayout() );
        

        Icon bug = new ImageIcon( "sattar.gif" );
        label1 = new JLabel( " ", bug, SwingConstants.CENTER );
        label1.setBackground(Color.RED);
        label1.setForeground(Color.BLUE);
        c.add(label1);
        c.setBackground( Color.lightGray );
        
        label2 = new JLabel( "Main  Road,  Tangail" );
        label2.setFont( new Font( "Lucida Bright", Font.BOLD , 15 ) );
        label2.setBackground(Color.RED);
        label2.setForeground(Color.blue);
        c.add( label2 );

        Icon bug1 = new ImageIcon( "vegitables.gif" );
        label3 = new JLabel( " ", bug1, SwingConstants.CENTER );
        label3.setBackground(Color.RED);
        label3.setForeground(Color.BLUE);
        c.add( label3 );
        c.setBackground( Color.lightGray );
      
     setSize( 600, 500 );
     setResizable(false);
     show();
    }

   public static void main( String args[] )
   {
       shopping_mall app = new shopping_mall();
 
       app.addWindowListener(
          new WindowAdapter() {
             public void windowClosing( WindowEvent e )
             {
                System.exit( 0 );
             }
          }
       );
    }
    
 }

 
////////////////////////////Category Frame INSERT-SELECT statement////////////////////////////  

 class category extends JFrame {
    
  private JButton insertButton, showButton,nextButton,previousButton,backButton;
  private JLabel label4, label5,label6;
  private JTextField text1, text2, text3;
  private JPanel buttonPanel,panel;
  private JTextArea textArea1, textArea2;
  Box box;
  long  s1;
  String s2 ;
  Statement stat, statement;
  Connection conn,connection ;
  ResultSet resultSet,rs;
  StringBuffer results;
  ResultSetMetaData metaData,rsmd;
  int numberOfColumns;
  Container c;
  Vector columnHeads,currentRow;
  Vector rows;
  JScrollPane scroller;
  JTable table;
     
     
     public category() 
      {   
      	super("Category Frame");
       
       Container c=getContentPane();
       c.setLayout(new FlowLayout());       
         
        label4 = new JLabel();
        label4.setText( "Main Road, Tangail" );
        label4.setIcon( new ImageIcon("all.gif") );
        label4.setHorizontalTextPosition(SwingConstants.CENTER );
        label4.setVerticalTextPosition(SwingConstants.BOTTOM );
        c.add( label4 );
        
        	//  Container c = getContentPane();
        c.setLayout( new FlowLayout() );
		
        label5 = new JLabel( "Category_ID        " );
        c.add( label5 );
        text1 = new JTextField( 30 );
        c.add( text1 );
        TextFieldHandler handler = new TextFieldHandler();
        text1.addActionListener( handler );

        label6 = new JLabel( "Category_Name" );
        c.add( label6 );
        text2 = new JTextField( 30 );
        c.add( text2 );
        text2.addActionListener( handler );
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout() );
        
        insertButton = new JButton( "Insert" ); 
        insertButton.addActionListener(
       	   new ActionListener() {
	          public void actionPerformed( ActionEvent e )
        	      {
            	  if(e.getSource()==insertButton)   
               	     {
               	      try {
        				  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        				  String serverName = "127.0.0.1";   
						  int port = 1521;     
						  String user = "scott";     
	    				  String password = "tiger"; 
        				  String SID = "nazrul";   
	    				  String URL = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + SID;
						  conn = DriverManager.getConnection(URL, user, password);
						  stat = conn.createStatement();
						  connection = DriverManager.getConnection(URL, user, password);
						  statement = connection.createStatement();
               		                			   
               		  	  resultSet=stat.executeQuery("INSERT into category (" + "category_id, category_name"+ ") VALUES ('" + s1+ "', '" + s2 + "')");
	  					  stat.executeUpdate("COMMIT");
	  					  System.out.println("1 row affected");
	  					  statement.close();
        				  connection.close();
	  					  } catch(Exception ee){ee.printStackTrace();}
		 				 
		 			
		 			}
				  }
	           }
        	);
        showButton = new JButton( "Show" );
        showButton.addActionListener(
       	   new ActionListener() {
	          public void actionPerformed( ActionEvent e )
        	      {
            	  if(e.getSource()==showButton)   
               	     {
               	     	try {
        					DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        					String serverName = "127.0.0.1";   
							int port = 1521;     
							String user = "scott";     
	    					String password = "tiger"; 
        					String SID = "nazrul";   
	    					String URL = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + SID;
							conn = DriverManager.getConnection(URL, user, password);
							stat = conn.createStatement();
							connection = DriverManager.getConnection(URL, user, password);
							statement = connection.createStatement();
			
          					String query = "SELECT * FROM category";  
         					statement = connection.createStatement();
         					resultSet = statement.executeQuery( query );
         				
       					    boolean moreRecords = resultSet.next();  
           					if ( ! moreRecords ) {
          						JOptionPane.showMessageDialog( null, "ResultSet contained no records" );
           						setTitle( "No records to display" );
           						return; }
        					Vector columnHeads = new Vector();
        					Vector rows = new Vector();
         
           					ResultSetMetaData rsmd = resultSet.getMetaData();
        
          					for ( int i = 1; i <= rsmd.getColumnCount(); ++i ) 
              				columnHeads.addElement( rsmd.getColumnName( i ) );
 				            do {
             					rows.addElement( getNextRow( resultSet, rsmd ) ); 
           						} while ( resultSet.next() );
  
           					table = new JTable( rows, columnHeads );
           					JScrollPane scroller = new JScrollPane( table );
           					getContentPane().add( scroller, BorderLayout.CENTER );
        					validate();
       
        					statement.close();
        					connection.close();
        					} catch ( SQLException sqlex ) {sqlex.printStackTrace();}          
        	        	}
				    }
	           }
        	);
        nextButton = new JButton( "Next" );
	    previousButton = new JButton( "Previous" );
	    backButton = new JButton( "Back" );
         
        buttonPanel.add( insertButton );
	    buttonPanel.add( showButton );
	    buttonPanel.add( nextButton );
	    buttonPanel.add( previousButton );
	    buttonPanel.add( backButton );
  
        c.add( buttonPanel, BorderLayout.SOUTH );
		
        setSize( 470, 360 );
        setResizable(false);
        show();
    }
  
 
    private Vector getNextRow( ResultSet rs, ResultSetMetaData rsmd ) throws SQLException
    {
       Vector currentRow = new Vector();      
       for ( int i = 1; i <= rsmd.getColumnCount(); i++ )
            switch( rsmd.getColumnType( i ) ) 
                  {
                   case Types.INTEGER:
                        currentRow.addElement( new Long(rs.getLong( i )) );
                        break;
                   case Types.VARCHAR:
                        currentRow.addElement( rs.getString( i ) );
                        break;
                   default: 
                        System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
                   }
       return currentRow;
     }
 
    private class TextFieldHandler implements ActionListener
	  {
	   public void actionPerformed(ActionEvent e)
		   {
			if ( e.getSource() == text1 )
				{
				String s=e.getActionCommand();
				s1 = Long.parseLong(s);
				}
        	if ( e.getSource() == text2 )
        			s2 = e.getActionCommand();
		   }
	   }
}
 
////////////////////////////Sub_Category Frame INSERT-SELECT statement//////////////////////////// 
class sub_category extends JFrame {
    
  private JButton insertButton ,showButton,nextButton,previousButton,backButton,searchButton;
  private JLabel label1, label2,label3,label4;
  private JTextField text1, text2, text3;
  private JPanel buttonPanel,panel;
  private JTextArea textArea1, textArea2;
  Box box;
  String s1,s2,s3,s4;
  Statement stat, statement;
  Connection conn,connection ;
  ResultSet resultSet,rs;
  StringBuffer results;
  ResultSetMetaData metaData,rsmd;
  int numberOfColumns;
  Container c;
  Vector columnHeads,currentRow;
  Vector rows;
  JScrollPane scroller;
  JTable table;
  

  
  JComboBox images;
  String names[] = { "Select One","Electronics", "Cloths", "Cosmatics", "Foods","Staitonary" };
  Icon icons[] = { new ImageIcon( names[ 0 ] ), new ImageIcon( names[ 1 ] ), new ImageIcon( names[ 2 ] ), new ImageIcon( names[ 3 ] ) };     
  
  public sub_category() 
      {   
      	super("Sub Category Frame");
       
       Container c=getContentPane();
       c.setLayout(new FlowLayout());
       
 
        label4 = new JLabel();
        label4.setText( "Main Road, Tangail" );
        label4.setIcon( new ImageIcon("all.gif") );
        label4.setHorizontalTextPosition(SwingConstants.CENTER );
        label4.setVerticalTextPosition(SwingConstants.BOTTOM );
        c.add( label4 );
        
        	//  Container c = getContentPane();
        c.setLayout( new FlowLayout() );
		
        label1 = new JLabel( "SubCategory_ID        " );
        c.add( label1 );
        text1 = new JTextField( 25 );
        c.add( text1 );
        TextFieldHandler handler = new TextFieldHandler();
        text1.addActionListener( handler );

        label2 = new JLabel( "SubCategory_Name" );
        c.add( label2 );
        text2 = new JTextField( 25 );
        c.add( text2 );
        text2.addActionListener( handler );
        
        label3 = new JLabel( "Category_Name" );
        c.add( label3 ); 
        images = new JComboBox( names );
        images.setMaximumRowCount( 4 );
        images.addItemListener(
           new ItemListener() {
              public void itemStateChanged( ItemEvent e )
             {
                 if(e.getStateChange()==ItemEvent.SELECTED)
                      s3=names[images.getSelectedIndex()] ;
	         }
           }
        );
  
        c.add( images );
        
               
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout() );
        
        insertButton = new JButton( "Insert" ); 
        insertButton.addActionListener(
       	   new ActionListener() {
	          public void actionPerformed( ActionEvent e )
        	      {
            	  if(e.getSource()==insertButton)   
               	     {
               	      try {
        				  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        				  String serverName = "127.0.0.1";   
						  int port = 1521;     
						  String user = "scott";     
	    				  String password = "tiger"; 
        				  String SID = "nazrul";   
	    				  String URL = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + SID;
						  conn = DriverManager.getConnection(URL, user, password);
						  stat = conn.createStatement();
						  connection = DriverManager.getConnection(URL, user, password);
						  statement = connection.createStatement();
               		                			   
               		  	  resultSet=stat.executeQuery("INSERT into sub_category (" + "subcategory_id, subcategory_name,category_name"+ ") VALUES ('" + s1+ "', '" + s2 + "', '" + s3 + "')");
	  					  stat.executeUpdate("COMMIT");
	  					  System.out.println("1 row affected");
	  					  statement.close();
        				  connection.close();
	  					  } catch(Exception ee){ee.printStackTrace();}
		 				 
		 			
		 			}
				  }
	           }
        	);
        	
       showButton = new JButton( "Show" );
       showButton.addActionListener(
       	   new ActionListener() {
	          public void actionPerformed( ActionEvent e )
        	      {
            	  if(e.getSource()==showButton)   
               	     {
               	     	try {
        				    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        					String serverName = "127.0.0.1";   
							int port = 1521;     
							String user = "scott";     
	    					String password = "tiger"; 
        					String SID = "nazrul";   
	    					String URL = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + SID;
							conn = DriverManager.getConnection(URL, user, password);
							stat = conn.createStatement();
							connection = DriverManager.getConnection(URL, user, password);
							statement = connection.createStatement();
			
          					String query = "SELECT * FROM sub_category";  
         					statement = connection.createStatement();
         					resultSet = statement.executeQuery( query );
         				
       					    boolean moreRecords = resultSet.next();  
           					if ( ! moreRecords ) {
          						JOptionPane.showMessageDialog( null, "ResultSet contained no records" );
           						setTitle( "No records to display" );
           						return; }
        					Vector columnHeads = new Vector();
        					Vector rows = new Vector();
         
           					ResultSetMetaData rsmd = resultSet.getMetaData();
        
          					for ( int i = 1; i <= rsmd.getColumnCount(); ++i ) 
              					columnHeads.addElement( rsmd.getColumnName( i ) );
 				            do {
             					rows.addElement( getNextRow( resultSet, rsmd ) ); 
           						} while ( resultSet.next() );
  
           					table = new JTable( rows, columnHeads );
           					JScrollPane scroller = new JScrollPane( table );
           					getContentPane().add( scroller, BorderLayout.CENTER );
        					validate();
       
        					statement.close();
        					connection.close();
        					} catch ( SQLException sqlex ) {sqlex.printStackTrace();}          
        	        	}
				    }
	           }
        	);
        
        nextButton = new JButton( "Next" );
	    previousButton = new JButton( "Previous" );
	    backButton = new JButton( "Back" );
         
        buttonPanel.add( insertButton );        
	    buttonPanel.add( showButton );
	    buttonPanel.add( nextButton );
	    buttonPanel.add( previousButton );
	    buttonPanel.add( backButton );
  
        c.add( buttonPanel, BorderLayout.SOUTH );
		
		searchButton = new JButton( "Search" );
        searchButton.addActionListener(
       	   new ActionListener() {
	          public void actionPerformed( ActionEvent e )
        	      {
            	  if(e.getSource()==searchButton)   
               	     {
               	     	try {
        					DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        					String serverName = "127.0.0.1";   
							int port = 1521;     
							String user = "scott";     
	    					String password = "tiger"; 
        					String SID = "nazrul";   
	    					String URL = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + SID;
							conn = DriverManager.getConnection(URL, user, password);
							stat = conn.createStatement();
							connection = DriverManager.getConnection(URL, user, password);
							statement = connection.createStatement();
							String query="SELECT * FROM sub_category " +
                            			 "WHERE subcategory_id = '" +
                            			 text3.getText() + "'";

          						
         					statement = connection.createStatement();
         					rs = statement.executeQuery( query );
         		
         				    try {         
         						
 						        if ( rs.next()) {
 						        	
             						text1.setText( rs.getString( "subcategory_id" ));
             						text2.setText( rs.getString( "subcategory_name" ) );
             						images.setSelectedItem(new String(rs.getString(3 )));
             						
           							}
        						else
             						System.out.print("\nNo record found\n" );         
       							}
       							catch ( SQLException sqlex ) {
         								sqlex.printStackTrace();
          								
      							}					    
       					          
        					statement.close();
        					connection.close();
        					} catch ( SQLException sqlex ) {sqlex.printStackTrace();}          
        	        	}
				    }
	           }
        	);
        	
        c.add(searchButton);
        text3 = new JTextField( 25 );
        c.add( text3 );
        setSize( 452, 420 );
        setResizable(false);
        show();
    }
  
 
    private Vector getNextRow( ResultSet rs, ResultSetMetaData rsmd ) throws SQLException
    {
       Vector currentRow = new Vector();      
       for ( int i = 1; i <= rsmd.getColumnCount(); i++ )
            switch( rsmd.getColumnType( i ) ) 
                  {
                   case Types.INTEGER:
                        currentRow.addElement( new Long(rs.getLong( i )) );
                        
                        break;
                   case Types.VARCHAR:
                        currentRow.addElement( rs.getString( i ) );
                        break;
                   default: 
                        System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
                   }
       return currentRow;
     }
 
    private class TextFieldHandler implements ActionListener
	  {
	   public void actionPerformed(ActionEvent e)
		   {
			if ( e.getSource() == text1 )
				s1 = e.getActionCommand();
        	if ( e.getSource() == text2 )
        			s2 = e.getActionCommand();
        	if ( e.getSource() == text3 )
        			s4 = e.getActionCommand();
        	
        	}
	   }
}
////////////////////////////   Item  Frame INSERT-SELECT-SEARCH statement////////////////////////////  
 class item extends JFrame {
    
  private JButton insertButton, updateButton,showButton,nextButton,previousButton,backButton,searchButton;
  private JLabel label4, label5,label6,label7,label8,label9,label10,label11;
  private JTextField text1, text2, text4, text5, text6,text7,text8;
  private JPanel buttonPanel,panel;
  private JTextArea textArea1, textArea2;
  Box box;
  String s1,s2,s3,s4,s5,s6,s7,s8;
  Statement stat, statement;
  Connection conn,connection ;
  ResultSet resultSet,rs;
  StringBuffer results;
  ResultSetMetaData metaData,rsmd;
  int numberOfColumns;
  Container c;
  Vector columnHeads,currentRow;
  Vector rows;
  JScrollPane scroller;
  JTable table;
  
  JComboBox images;
  String names[] = { "Select One","Electronics", "Cloths", "Cosmatics", "Foods","Staitonary" };
  Icon icons[] = { new ImageIcon( names[ 0 ] ), new ImageIcon( names[ 1 ] ), new ImageIcon( names[ 2 ] ), new ImageIcon( names[ 3 ] ) };     
  
  public item() 
      {   
      	super("Item Frame");
       
       Container c=getContentPane();
       c.setLayout(new FlowLayout());
       
 
        label4 = new JLabel();
        label4.setText( "Main Road, Tangail" );
        label4.setIcon( new ImageIcon("all.gif") );
        label4.setHorizontalTextPosition(SwingConstants.CENTER );
        label4.setVerticalTextPosition(SwingConstants.BOTTOM );
        c.add( label4 );
        
        	//  Container c = getContentPane();
        c.setLayout( new FlowLayout() );
		
        label5 = new JLabel( "Item_ID        " );
        c.add( label5 );
        text1 = new JTextField( 30 );
        c.add( text1 );
        TextFieldHandler handler = new TextFieldHandler();
        text1.addActionListener( handler );

        label6 = new JLabel( "Item_Name" );
        c.add( label6 );
        text2 = new JTextField( 30 );
        c.add( text2 );
        text2.addActionListener( handler );
        
        label7 = new JLabel( "Category_Name" );
        c.add( label7 ); 
        images = new JComboBox( names );
        images.setMaximumRowCount( 4 );
        images.addItemListener(
           new ItemListener() {
              public void itemStateChanged( ItemEvent e )
             {
                 if(e.getStateChange()==ItemEvent.SELECTED)
                      s3=names[images.getSelectedIndex()] ;
	         }
           }
        );
  
        c.add( images );
        
        label8 = new JLabel( "Sub_Category_Name" );
        c.add( label8 );
        text4 = new JTextField( 9 );
        c.add( text4 );
        text4.addActionListener( handler );
        
        label9 = new JLabel( "Purchesing Price" );
        c.add( label9 );
        text5 = new JTextField( 9 );
        c.add( text5 );
        text5.addActionListener( handler );
        
        label10 = new JLabel( "Selling Unit Price" );
        c.add( label10 );
        text6 = new JTextField( 9 );
        c.add( text6 );
        text6.addActionListener( handler );
        
        label11 = new JLabel( "Balance Stock" );
        c.add( label11 );
        text7 = new JTextField(29 );
        c.add( text7 );
        text7.addActionListener( handler );
       
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout() );
        
        insertButton = new JButton( "Insert" ); 
        insertButton.addActionListener(
       	   new ActionListener() {
	          public void actionPerformed( ActionEvent e )
        	      {
            	  if(e.getSource()==insertButton)   
               	     {
               	      try {
        				  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        				  String serverName = "127.0.0.1";   
						  int port = 1521;     
						  String user = "scott";     
	    				  String password = "tiger"; 
        				  String SID = "nazrul";   
	    				  String URL = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + SID;
						  conn = DriverManager.getConnection(URL, user, password);
						  stat = conn.createStatement();
						  connection = DriverManager.getConnection(URL, user, password);
						  statement = connection.createStatement();
               		                			   
               		  	  resultSet=stat.executeQuery("INSERT into item (" + "item_id, item_name,category_name,sub_category,purchasing_price,selling_price,balance_stock"+ ") VALUES ('" + s1+ "', '" + s2 + "', '" + s3 + "', '" + s4 + "', '" + s5 + "', '" + s6 + "', '" + s7 + "')");
	  					  stat.executeUpdate("COMMIT");
	  					  System.out.println("1 row affected");
	  					  statement.close();
        				  connection.close();
	  					  } catch(Exception ee){ee.printStackTrace();}
		 				 
		 			
		 			}
				  }
	           }
        	);
        	
       showButton = new JButton( "Show" );
       showButton.addActionListener(
       	   new ActionListener() {
	          public void actionPerformed( ActionEvent e )
        	      {
            	  if(e.getSource()==showButton)   
               	     {
               	     	try {
        					DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        					String serverName = "127.0.0.1";   
							int port = 1521;     
							String user = "scott";     
	    					String password = "tiger"; 
        					String SID = "nazrul";   
	    					String URL = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + SID;
							conn = DriverManager.getConnection(URL, user, password);
							stat = conn.createStatement();
							connection = DriverManager.getConnection(URL, user, password);
							statement = connection.createStatement();
			
          					String query = "SELECT * FROM item";  
         					statement = connection.createStatement();
         					resultSet = statement.executeQuery( query );
         				
       					    boolean moreRecords = resultSet.next();  
           					if ( ! moreRecords ) {
          						JOptionPane.showMessageDialog( null, "ResultSet contained no records" );
           						setTitle( "No records to display" );
           						return; }
        					Vector columnHeads = new Vector();
        					Vector rows = new Vector();
         
           					ResultSetMetaData rsmd = resultSet.getMetaData();
        
          					for ( int i = 1; i <= rsmd.getColumnCount(); ++i ) 
              					columnHeads.addElement( rsmd.getColumnName( i ) );
 				            do {
             					rows.addElement( getNextRow( resultSet, rsmd ) ); 
           						} while ( resultSet.next() );
  
           					table = new JTable( rows, columnHeads );
           					JScrollPane scroller = new JScrollPane( table );
           					getContentPane().add( scroller, BorderLayout.CENTER );
        					validate();
       
        					statement.close();
        					connection.close();
        					} catch ( SQLException sqlex ) {sqlex.printStackTrace();}          
        	        	}
				    }
	           }
        	);
        updateButton = new JButton( "Update" ); 
        nextButton = new JButton( "Next" );
	    previousButton = new JButton( "Previous" );
	    backButton = new JButton( "Back" );
         
        buttonPanel.add( insertButton );        
	    buttonPanel.add( showButton );
	    buttonPanel.add( updateButton );
	    buttonPanel.add( nextButton );
	    buttonPanel.add( previousButton );
	    buttonPanel.add( backButton );
  
        c.add( buttonPanel, BorderLayout.SOUTH );
		
      	searchButton = new JButton( "Search" );
        searchButton.addActionListener(
       	   new ActionListener() {
	          public void actionPerformed( ActionEvent e )
        	      {
            	  if(e.getSource()==searchButton)   
               	     {
               	     	try {
        					DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        					String serverName = "127.0.0.1";   
							int port = 1521;     
							String user = "scott";     
	    					String password = "tiger"; 
        					String SID = "nazrul";   
	    					String URL = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + SID;
							conn = DriverManager.getConnection(URL, user, password);
							stat = conn.createStatement();
							connection = DriverManager.getConnection(URL, user, password);
							statement = connection.createStatement();
							String query="SELECT * FROM item " +
                            			 "WHERE item_id = '" +
                            			 text8.getText() + "'";

          						
         					statement = connection.createStatement();
         					rs = statement.executeQuery( query );
         		
         				    try {         
         						
 						        if ( rs.next()) {
 						        	
             						text1.setText( rs.getString( "item_id" ));
             						text2.setText( rs.getString( "item_name" ) );
             						images.setSelectedItem(new String(rs.getString(3 )));
             						text4.setText( rs.getString( 4 ));
             						text5.setText( rs.getString( 5) );
            						text6.setText( rs.getString( 6 ));
             						text7.setText( rs.getString( 7) );
           							}
        						else
             						System.out.print("\nNo record found\n" );         
       							}
       							catch ( SQLException sqlex ) {
         								sqlex.printStackTrace();
          								
      							} 					    
       					          
        					statement.close();
        					connection.close();
        					} catch ( SQLException sqlex ) {sqlex.printStackTrace();}          
        	        	}
				    }
	           }
        	);
        	
        c.add(searchButton);
        text8 = new JTextField( 25 );
        c.add( text8 );
        setSize( 452, 420 );
        setResizable(false);
        show();
    }
  
 
    private Vector getNextRow( ResultSet rs, ResultSetMetaData rsmd ) throws SQLException
    {
       Vector currentRow = new Vector();      
       for ( int i = 1; i <= rsmd.getColumnCount(); i++ )
            switch( rsmd.getColumnType( i ) ) 
                  {
                   case Types.INTEGER:
                        currentRow.addElement( new Long(rs.getLong( i )) );
                        
                        break;
                   case Types.VARCHAR:
                        currentRow.addElement( rs.getString( i ) );
                        break;
                   default: 
                        System.out.println( "Type was: " + rsmd.getColumnTypeName( i ) );
                   }
       return currentRow;
     }
 
    private class TextFieldHandler implements ActionListener
	  {
	   public void actionPerformed(ActionEvent e)
		   {
			if ( e.getSource() == text1 )
				s1 = e.getActionCommand();
        	if ( e.getSource() == text2 )
        			s2 = e.getActionCommand();
        	if ( e.getSource() == text4 )
        			s4 = e.getActionCommand();
        	if ( e.getSource() == text5 )
        		s5 = e.getActionCommand();        		
        	if ( e.getSource() == text6 )
        		s6 = e.getActionCommand();
        	if ( e.getSource() == text7 )        		
        		s7 = e.getActionCommand();       		
        	if ( e.getSource() == text8 )        		
        		s8 = e.getActionCommand();       		
        		
        	}
	   }
}



