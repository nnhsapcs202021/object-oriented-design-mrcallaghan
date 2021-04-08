import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class ButtonViewer7 here.
 *
 * @author mrcallaghan
 * @version 08apr2021
 */
public class ButtonViewer7
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;

    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;

    private int clickCountA;
    private int clickCountB;

    public ButtonViewer7()
    {
        this.clickCountA = 0;
        this.clickCountB = 0;

        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.buttonA = new JButton("Click Me!");
        this.panel.add(this.buttonA);

        this.buttonB = new JButton("No, Click Me!");
        this.panel.add(this.buttonB);

        this.label = new JLabel("0 clicks");
        this.panel.add(this.label);

        this.frame.add(this.panel);

        // 2. create listener objects
        ClickListener7 listener = new ClickListener7();

        // 3. register listener objects with components that generate events
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        ButtonViewer7 viewer = new ButtonViewer7();

    }

    public class ClickListener7 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == buttonA)
            {
                clickCountA++;

            }
            else if(event.getSource() == buttonB)
            {
                clickCountB++;
            }

            label.setText("A: " + clickCountA + " clicks; B: " + clickCountB + " clicks");
        }
    }

}
