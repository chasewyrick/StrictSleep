import java.util.Date;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import javax.swing.JOptionPane;
		public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date dateobj = new Date();
		int time=21;
		if (time == 21){
		
			   JOptionPane.showMessageDialog(null, "Oh No! Looks like it is " + df.format(dateobj) + " Time to sleep");

        }   else {
        	JOptionPane.showMessageDialog(null, "Welcome! Your System Time is " + df.format(dateobj));
            }
        }
    }